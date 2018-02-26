package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class PutItemIntoCartAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();

	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	//miniカートのlist
	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();

	private boolean duplicationFlg;

	private String itemId;
	private String itemName;
	private String itemNameKana;
	private String itemDescription;
	private String price;
	private String imageFileName;
	private String releaseCompany;
	private int count;
	private String token;

	private int itemCount;

	private int totalPrice=0;



	@SuppressWarnings("static-access")
	public String execute()throws SQLException{

		Random rand=new Random();
		int[] orderIntArray= new int[3];
		String[] orderStringArray = new String[3];
		String orderNumPreview="";
		for(int i=0 ; i<orderStringArray.length; i++){
			orderIntArray[i]=rand.nextInt(6);
			orderStringArray[i]=String.valueOf(orderIntArray[i]);
			orderNumPreview=orderNumPreview+orderStringArray[i];
		}

		try {
			TimeUnit.MILLISECONDS.sleep(Long.parseLong(orderNumPreview));
		} catch (InterruptedException e) {

			e.printStackTrace();
		}



		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				System.out.println("まじかよ");
				return "errorPage2";
			}
		}

		if(itemCount<0) {
			return "CountError";
		}


		if(!(token.equals(session.get("token").toString()))){
			System.out.println("putitemトークン"+token);
			System.out.println("こっちきてくれええええええ");
			return "errorPage";
		}

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);

		System.out.println("countは"+count);


		if (!(itemCount<6)) {
			System.out.println("不正操作我絶対不許");
			return "errorPage";
		}

		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		buyItemDTO=buyItemInfoDAO.selectBuyItemInfo(itemId);

		if (!(itemCount<= buyItemDTO.getItemStock()) ) {
			return "errorPage";
		}

		CartDTO dto=new CartDTO();
		CartDAO dao=new CartDAO();
		dto.setItemId(Integer.parseInt(itemId.toString()));
		dto.setItemCount(itemCount);

		System.out.println("PutItemIntoCartAction");
		System.out.println("itemId:"+itemId);
		System.out.println("itemName"+itemName);
		System.out.println("itemNameKana"+itemNameKana);
		System.out.println("itemDescription"+itemDescription);
		System.out.println("price"+price);
		System.out.println("imageFileName"+imageFileName);
		System.out.println("releaseCompany"+releaseCompany);
		System.out.println("loginFlg:"+session.get("loginFlg"));
		System.out.println("userId:"+session.get("userId"));
		System.out.println("duplicationFlg"+duplicationFlg);

		System.out.println("仮ユーザーID:"+session.get("tempUserId").toString());

		int iPrice=Integer.parseInt(price);
		if(!(session.containsKey("loginFlg"))){
			session.put("loginFlg", false);
		}

		/**
		 * ログインしている際にカートに入れた場合
		 */
		if((boolean)session.get("loginFlg")) {
			boolean dupFlg=dao.isAlreadyIntoCart(session.get("userId").toString(),Integer.parseInt(itemId));
			if(!dupFlg) {
				count=dao.putItemIntoCart(session.get("userId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);

				//ログインユーザーから検索し6件カートの値をとってくる
				miniCartList = dao.UserMiniCart(session.get("userId").toString());
				session.put("miniCartList", miniCartList);
				System.out.println("minilistのサイズ"+miniCartList);
				cartList = dao.showUserCartList(session.get("userId").toString());



				dao.changeItemStock(itemCount, Integer.parseInt(itemId));
			} else {
				count = dao.updateItemCount(session.get("userId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);
				miniCartList = dao.UserMiniCart(session.get("userId").toString());
				session.put("miniCartList", miniCartList);

				cartList = dao.showUserCartList(session.get("userId").toString());
				dao.changeItemStock(itemCount, Integer.parseInt(itemId));
			}
		}

		/**
		 * ゲストユーザーの場合
		 */
		else {
			boolean dupFlg=dao.isAlreadyIntoCart(session.get("tempUserId").toString(),Integer.parseInt(itemId));
			if (!dupFlg) {
				count = dao.putItemIntoCart(session.get("tempUserId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);

				miniCartList = dao.TempUserMiniCart(session.get("tempUserId").toString());
				System.out.println("ミニカート中身"+miniCartList.size());
				session.put("miniCartList", miniCartList);

				cartList = dao.showUserCartList(session.get("tempUserId").toString());
				dao.changeItemStock(itemCount, Integer.parseInt(itemId));
			} else {
				count = dao.updateItemCount(session.get("tempUserId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);

				miniCartList = dao.TempUserMiniCart(session.get("tempUserId").toString());
				System.out.println("ミニカート中身"+miniCartList.size());
				session.put("miniCartList", miniCartList);

				cartList = dao.showUserCartList(session.get("tempUserId").toString());
				dao.changeItemStock(itemCount, Integer.parseInt(itemId));
			}
		}


		/**
		 * 検証画面で購入個数をマイナスにした場合を返しホームに戻る
		 */

		ShowItemDAO showItemDAO = new ShowItemDAO();
		session.put("buyItemList", showItemDAO.ShowItem());
		totalPrice=calcTotalPrice(cartList);

		if (!(totalPrice <10000000)) {
			return  ERROR;
		}

		session.put("allTotalPrice", totalPrice);
		return SUCCESS;
	}


	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session=session;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId=itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
	}

	public String getItemNameKana() {
		return itemNameKana;
	}

	public void setItemNameKana(String itemNameKana) {
		this.itemNameKana=itemNameKana;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription=itemDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price=price;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName=imageFileName;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public ArrayList<CartDTO> getCartList(){
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList=cartList;
	}

	public boolean isDuplicationFlg() {
		return duplicationFlg;
	}

	public void setDuplicationFlg(boolean duplicationFlg) {
		this.duplicationFlg = duplicationFlg;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * 合計金額を計算するメソッド
	 */
	public int calcTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;
		for (CartDTO dto : cartList) {
			totalPrice += dto.getPrice() * dto.getItemCount();
			System.out.println("合計" + totalPrice + "円");
		}
		return totalPrice;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ArrayList<CartDTO> getMiniCartList() {
		return miniCartList;
	}

	public void setMiniCartList(ArrayList<CartDTO> miniCartList) {
		this.miniCartList = miniCartList;
	}

}

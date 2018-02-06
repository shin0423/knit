package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PutItemIntoCartAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();

	private boolean duplicationFlg;

	private String itemId;
	private String itemName;
	private String itemNameKana;
	private String itemDescription;
	private String price;
	private String imageFileName;
	private String releaseCompany;
	private int count;

	private int itemCount;

	private int totalPrice=0;

	public String execute()throws SQLException{
		System.out.println("countは"+count);
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

		int iPrice=Integer.parseInt(price);
		if(!(session.containsKey("loginFlg"))){
			session.put("loginFlg", false);
		}

		/**
		 * ログインしている際にカートに入れた場合
		 */
		if(session.containsKey("loginFlg")&&(boolean)session.get("loginFlg")) {
			boolean dupFlg=dao.isAlreadyIntoCart(session.get("userId").toString(),Integer.parseInt(itemId));
			if(!dupFlg) {
				count=dao.putItemIntoCart(session.get("userId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);
				cartList = dao.showUserCartList(session.get("userId").toString());
			} else {
				count = dao.updateItemCount(session.get("userId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);
				cartList = dao.showUserCartList(session.get("userId").toString());
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
				cartList = dao.showUserCartList(session.get("tempUserId").toString());
			} else {
				count = dao.updateItemCount(session.get("tempUserId").toString(), Integer.parseInt(itemId),
						itemCount, iPrice);
				cartList = dao.showUserCartList(session.get("tempUserId").toString());
			}
		}

		/**
		 * 検証画面で購入個数をマイナスにした場合を返しホームに戻る
		 */
		if(itemCount<0) {
			return "CountError";
		}
		totalPrice=calcTotalPrice(cartList);
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

}
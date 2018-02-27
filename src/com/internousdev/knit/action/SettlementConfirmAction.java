package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.DestinationInfoDAO;
import com.internousdev.knit.dao.SettlementConfirmDAO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.DestinationInfoDTO;
import com.internousdev.knit.dto.SettlementConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
* 決済確認画面
*
*カート情報と宛先情報の取得
*/

public class SettlementConfirmAction extends ActionSupport implements SessionAware{

	//session
	public Map<String,Object> session;

	//DAO
	private SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	private CartDAO cartDAO =new CartDAO();
	private DestinationInfoDAO DestinationInfoDAO = new DestinationInfoDAO();

	//宛先情報DTOをListに格納
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();

	public ArrayList<DestinationInfoDTO> oneDestinationList = new ArrayList<DestinationInfoDTO>();



	//カート情報受け取り
	public ArrayList<CartDTO> cartInfoList = new ArrayList<CartDTO>();

	private boolean buyCountErrorFlg = false;

	//購入個数、在庫比較リスト
	private ArrayList<CartDTO> buyCountErrorList = new ArrayList<CartDTO>();

	//未ログインカートフラグ

	private boolean cartFlg;

	private String token;




	String destinationError;


	@SuppressWarnings("static-access")
	public String execute() throws SQLException{
		String result = ERROR;

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);


		if(session.containsKey("userId")){

			//宛先情報の取得
			destinationList = settlementConfirmDAO.getDestinationInfo(session.get("userId").toString());

			session.put("destinationList", destinationList);

			if (destinationList.size() ==0) {
				destinationError ="a";
				session.put("destinationError", destinationError);
			}else {
				session.remove("destinationError");
			}

			//宛先登録する時に一番最初に表示してあげるための宛先情報を取得
			oneDestinationList = DestinationInfoDAO.OneDestination(session.get("userId").toString());

			//カート情報取得
			cartInfoList = cartDAO.showUserCartList(session.get("userId").toString());

			session.put("cartInfoList", cartInfoList);

			//カートの合計金額計算
			if(cartInfoList != null){
				calcCartTotalPrice();
			}

			result = SUCCESS;

		}
		if(!(session.containsKey("userId"))){
			cartFlg=true;
			session.put("cartFlg", cartFlg);
		}
		return result;
	}

	//合計金額を計算
	public void calcCartTotalPrice(){
		int cartTotalPrice=0;
		for(int i=0; i < cartInfoList.size(); i++) {
			//+= で足して変数に格納を繰り返す。
			cartTotalPrice += cartInfoList.get(i).getPrice() *  cartInfoList.get(i).getItemCount();

		}
		session.put("cartTotalPrice", cartTotalPrice);
	}


	public ArrayList<SettlementConfirmDTO> getDestinationList() {
		return destinationList;
	}

	public void setDestinationList(ArrayList<SettlementConfirmDTO> destinationList) {
		this.destinationList = destinationList;
	}

	public boolean getBuyCountErrorFlg() {
		return buyCountErrorFlg;
	}

	public void setBuyCountErrorFlg(boolean buyCountErrorFlg) {
		this.buyCountErrorFlg = buyCountErrorFlg;
	}

	//セッション
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartInfoList() {
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<CartDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}

	public ArrayList<CartDTO> getBuyCountErrorList() {
		return buyCountErrorList;
	}

	public void setBuyCountErrorList(ArrayList<CartDTO> buyCountErrorList) {
		this.buyCountErrorList = buyCountErrorList;
	}

	public ArrayList<DestinationInfoDTO> getOneDestinationList() {
		return oneDestinationList;
	}

	public void setOneDestinationList(ArrayList<DestinationInfoDTO> oneDestinationList) {
		this.oneDestinationList = oneDestinationList;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}

package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.UserCreateCompleteDAO;
import com.internousdev.knit.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	private String telNumber;
	private String userAddress;
	private String token;

	private ArrayList<CartDTO> userCartList = new ArrayList<CartDTO>();
	 private ArrayList<CartDTO> tempUserCartList = new ArrayList<CartDTO>();
	 private ArrayList<Integer> userCartItemIdList = new ArrayList<Integer>();
	 private ArrayList<Integer> tempUserCartItemIdList = new ArrayList<Integer>();

	public Map<String,Object> session;

	public String execute() throws SQLException{
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);
//不正な書き換えがあった場合のチェック
		if(!(userId.equals(session.get("createUserId").toString()))){
			return "errorPage";
		}
		if(!(password.equals(session.get("createPassword").toString()))){
			return "errorPage";
		}
		if(!(familyName.equals(session.get("createFamilyName").toString()))){
			return "errorPage";
		}
		if(!(firstName.equals(session.get("createFirstName").toString()))){
			return "errorPage";
		}
		if(!(familyNameKana.equals(session.get("createFamilyNameKana").toString()))){
			return "errorPage";
		}
		if(!(firstNameKana.equals(session.get("createFirstNameKana").toString()))){
			return "errorPage";
		}
		if(!(sex==Integer.parseInt(session.get("createSex").toString()))){
			return "errorPage";
		}
		if(!(email.equals(session.get("createEmail").toString()))){
			return "errorPage";
		}
		if(!(telNumber.equals(session.get("createTelNumber").toString()))){
			return "errorPage";
		}
		if(!(userAddress.equals(session.get("createUserAddress").toString()))){
			return "errorPage";
		}

		String result = ERROR;
		//入力された値の確認
		int count1 = 0;
		int count2 = 0;
		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

		//ユーザー情報の登録
		count1 = dao.createUser1(session.get("createUserId").toString(),
				session.get("createPassword").toString(),
				session.get("createFamilyName").toString(),
				session.get("createFirstName").toString(),
				session.get("createFamilyNameKana").toString(),
				session.get("createFirstNameKana").toString(),
				Integer.parseInt(session.get("createSex").toString()),
				session.get("createEmail").toString()

				);

		if(count1 >0){
			count2 = dao.createUser2(session.get("createUserId").toString(),
				session.get("createFamilyName").toString(),
				session.get("createFirstName").toString(),
				session.get("createFamilyNameKana").toString(),
				session.get("createFirstNameKana").toString(),
				session.get("createEmail").toString(),
				session.get("createTelNumber").toString(),
				session.get("createUserAddress").toString()
				);

			session.put("userId", userId);
			makeCartList();
			session.put("tempUserId",session.get("createUserId").toString());
			session.put("loginFlg", true);
		}

		if(count2 >0){
			result=SUCCESS;
		}
		return result ;
	}
public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	//セッターゲッターの設定
	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}

	public int getSex(){
		return sex;
	}

	public void setSex(int sex){
		this.sex = sex;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public void makeCartList() throws SQLException {
		CartDAO cartDAO = new CartDAO();
		userCartList = cartDAO.showUserCartList(session.get("userId").toString());
		tempUserCartList = cartDAO.showTempUserCartList(session.get("tempUserId").toString());

		/**
		 * ユーザーのカート内商品のIDを全取得してリストに入れる
		 */
		int i = 0;
		for (i = 0; i < userCartList.size(); i++) {
			userCartItemIdList.add(userCartList.get(i).getItemId());
		}
		System.out.println("ユーザーカートの商品のIDリスト生成 : " + userCartItemIdList);

		/**
		 * 仮ユーザーのカート内商品のIDを全取得してリストに入れる
		 */
		i = 0;
		for (i = 0; i < tempUserCartList.size(); i++) {
			tempUserCartItemIdList.add(tempUserCartList.get(i).getItemId());
		}
		System.out.println("仮ユーザーカートの商品のIDリスト生成 : " + tempUserCartItemIdList);

		/**
		 * ユーザーカートリストと仮ユーザーカートリストの重複をチェック
		 */
		i = 0;
		for (i = 0; i < tempUserCartItemIdList.size(); i++) {

			/**
			 * 仮ユーザーカートリストにユーザーカートリストにある物が含まれているか
			 */
			boolean exist = userCartItemIdList.contains(Integer.valueOf(tempUserCartItemIdList.get(i)) );
			System.out.println("カート重複確認 : " + exist);

			/**
			 * もし含まれていた場合の処理
			 */
			if (exist) {

				/**
				 * 重複商品の選択数をユーザーのカート情報の選択数に足すメソッド
				 */
				cartDAO.changeItemStockId(Integer.valueOf(tempUserCartList.get(i).getItemCount()),
						Integer.valueOf(tempUserCartItemIdList.get(i)),
						session.get("userId").toString());
				System.out.println(session.get("userId").toString() + "のカートに" + tempUserCartItemIdList.get(i) + "(このIDに該当する商品)の重複分" + tempUserCartList.get(i).getItemCount() + "個追加");

				/**
				 * 仮ユーザーカートリストから重複してた商品を削するメソッド
				 */
				cartDAO.deleteSeparete(session.get("tempUserId").toString(),
						tempUserCartItemIdList.get(i));
				System.out.println(session.get("tempUserId").toString() + "のカート内の" + tempUserCartItemIdList.get(i) + "(このIDに該当する商品)を削除");
				/**
				 * 含まれていなかった場合の処理
				 */
			} else {
				cartDAO.changeUserId(session.get("tempUserId").toString(),
						session.get("userId").toString());
				System.out.println(session.get("tempUserId").toString() + "のカート情報を" + session.get("userId").toString() + "のカート情報に統合");
			}

		}
	}

}

package com.internousdev.knit.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dto.ResetPasswordDTO;
import com.internousdev.knit.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordDAO extends ActionSupport implements SessionAware{
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	//ログインidと新規パスワードを格納
	public Map<String,Object> session;
	ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();

	//一致するログインidが存在するかDBから探す
	public boolean getUserId(String userId){
		String sql = "SELECT user_id FROM user_info where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				resetPasswordDTO.setLoginId(rs.getString("user_id"));
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	//新しいパスワードをDBにセットする
	public boolean resetPassword(String newLoginPassword,String userId){
		String sql = "UPDATE user_info SET password = ? where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newLoginPassword);
			ps.setString(2, userId);
			ps.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//文字列の加工と指定範囲以外を*に差し替える
	//word:加工する文字列
	//a:開始位置
	//b:終了位置

	public String hideString(String word,int a,int b){

		//加工した文字を入れる型定義
		String hideWord;

		//文字の長さをセット
		int wordLength;
		wordLength = word.length();

		//aからbまでの文字列を抽出
		hideWord=word.substring(a,b);

		//抽出した文字列以外は*に差し替える
		//aの位置まで*に差し替え

		int i=0;
		while(i < wordLength - b){
			hideWord = hideWord + "*";
			i++;
		}
		return hideWord;
	}

	//セッション
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}

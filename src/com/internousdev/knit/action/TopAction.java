package com.internousdev.knit.action;

import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TopAction extends ActionSupport implements SessionAware {

	/*↓小池作成↓ */

	//仮ユーザーIDとloginflgを入れるためにsessionを作成
	private Map<String,Object> session;

	public String execute(){

		//ランダム文字列を作るためにインスタンス化
		RandomStringUtils rndStr = new RandomStringUtils();

		//↓


		try {
			//↓商品を表示させるためのDAO(商品登録機能完成後 後日作成)↓


			//↓loginFlgがない場合loginFlgにfalseを入れてさらに仮ユーザーIDを発行する
			if (!(session.containsKey("loginFlg"))) {
				session.put("loginFlg", false);

				//仮ユーザーIDの変数作成(ランダムな英字を10文字作成)
				String tempUserId =rndStr.randomAlphabetic(10);

				//発行された仮ユーザーIDの中身をコンソールで確認
				System.out.println("仮ユーザーIDの値"+tempUserId);

				//仮ユーザーIDをsessionに入れる
				session.put("tempUserId", tempUserId);

				//sessionに仮ユーザーIDが入ってるか確認
				System.out.println("sessionのtempUserIdの値"+session.get("tempUserId").toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}



		return SUCCESS;

		/*↑小池作成↑ */
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

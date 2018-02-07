package com.internousdev.knit.dto;

public class PurchaseHistoryDTO {

//	ID
	private int id;

//	ユーザーID
	private String userId;

//	商品個数
	private int itemCount;

//	商品値段
	private int price;

//	商品ID
	private int itemId;

//	登録日
	private String registDate;

//	更新日
	private String updateDate;

//	注文番号
	private String orderNum;

//	商品名
	private String itemName;

//	商品名ふりがな
	private String itemNameKana;

//	商品画像ファイル名
	private String imageFilePath;

//	商品の履歴表示フラグ [0で非表示,1で表示]
	private int status;

//	商品の発送待機、または発送キャンセル、または発送開始状態
//	[0で発送待機状態、1で発送キャンセル状態、2で発送開始状態]

	private int sendFlg ;

//*--------------------------------------	ゲッタセッタ	-------------------------------------------



	//	ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

//	ユーザーID
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

//	購入個数
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

//	商品値段
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

//	商品ID
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

//	登録日
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

//	更新日
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

//	注文番号
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

//	商品名
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

//	商品名ふりがな
	public String getItemNameKana() {
		return itemNameKana;
	}
	public void setItemNameKana(String itemNameKana) {
		this.itemNameKana = itemNameKana;
	}

//	商品画像ファイルパス
	public String getimageFilePath() {
		return imageFilePath;
	}
	public void setimageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

//	商品の履歴表示フラグ [0で非表示,1で表示]
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

//	商品の発送待機、または発送キャンセル、または発送開始状態
//	[0で発送待機状態、1で発送キャンセル状態、2で発送開始状態]
	public int getsendFlg() {
		return sendFlg;
	}
	public void setsendFlg(int sendFlg) {
		this.sendFlg = sendFlg;
	}

}
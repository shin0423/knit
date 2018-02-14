package com.internousdev.knit.util;

public class InputChecker {

	/**
	 * 姓
	 */
	public String familyNameChk(String familyName) {
		String result = "OK";

		if (familyName.equals("") || familyName == null) {
			result = "姓を入力してください。";
		} else if (familyName.length() < 1 || familyName.length() > 16) {
			result = "姓は1文字以上16文字以下で入力してください。";
		} else if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
			result = "姓は半角英語、漢字、ひらがな、カタカナで入力してください。";
		}
		return result;
	}

	public String firstNameChk(String firstName) {
		String result = "OK";

		if (firstName.equals("") || firstName == null) {
			result = "名を入力してください。";
		} else if (firstName.length() < 1 || firstName.length() > 16) {
			result = "名は1文字以上16文字以下で入力してください。";
		} else if (!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
			result = "名は半角英語、漢字、ひらがな、カタカナで入力してください。";
		}

		return result;
	}

	public String familyNameKanaChk(String familyNameKana) {
		String result = "OK";

		if (familyNameKana.equals("") || familyNameKana == null) {
			result = "姓ふりがなを入力してください。";
		} else if (familyNameKana.length() < 1 || familyNameKana.length() > 16) {
			result = "姓ふりがなは1文字以上16文字以下で入力してください。";
		} else if (!familyNameKana.matches("^[ぁ-ん]+$")) {
			result = "姓ふりがなはひらがなで入力してください。";
		}

		return result;
	}

	public String firstNameKanaChk(String firstNameKana) {
		String result = "OK";

		if (firstNameKana.equals("") || firstNameKana == null) {
			result = "名ふりがなを入力してください。";
		} else if (firstNameKana.length() < 1 || firstNameKana.length() > 16) {
			result = "名ふりがなは1文字以上16文字以下で入力してください。";
		} else if (!firstNameKana.matches("^[ぁ-ん]+$")) {
			result = "名ふりがなはひらがなで入力してください。";
		}

		return result;
	}

	public String emailChk(String email) {
		String result = "OK";

		if (email.equals("") || email == null) {
			result = "メールアドレスを入力してください。";
		} else if (email.length() < 10 || email.length() > 32) {
			result = "メールアドレスは10文字以上32文字以下で入力してください。";
		} else if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			result = "正しいメールアドレスの形式で入力してください。";
		}

		return result;
	}

	public String userIdChk(String userId) {
		String result = "OK";

		if (userId.equals("") || userId == null) {
			result = "ユーザーIDを入力してください。";
		} else if (userId.length() < 1 || userId.length() > 8) {
			result = "ユーザーIDは1文字以上8文字以下で入力してください。";
		} else if (!userId.matches("^[a-zA-Z0-9]+$")) {
			result = "ユーザーIDは半角英数字で入力してください。";
		}

		return result;
	}

	public String passwordChk(String password) {
		String result = "OK";

		if (password.equals("")) {
			result = "パスワードを入力してください。";
		} else if (password.length() < 1 || password.length() > 16) {
			result = "パスワードは1文字以上16文字以下で入力してください。";
		} else if (!password.matches("^[a-zA-Z0-9]+$")) {
			result = "パスワードは半角英数字で入力してください。";
		}

		return result;
	}

	public String passwordcChk(String passwordc, String password) {
		String result = "OK";

		if (passwordc.equals("") || passwordc == null) {
			result = "再確認パスワードを入力してください。";
		} else if (passwordc.length() < 1 || passwordc.length() > 16) {
			result = "再確認パスワードは1文字以上16文字以下で入力してください。";
		} else if (!passwordc.matches("^[a-zA-Z0-9]+$")) {
			result = "再確認パスワードは半角英数字で入力してください。";
		} else if (!(passwordc.equals(password))) {
			result = ("入力されたパスワードが異なります。");
		}

		return result;
	}

	public String telNumberChk(String telNumber) {
		String result = "OK";

		if (telNumber.equals("") || telNumber == null) {
			result = "電話番号を入力してください。";
		} else if (telNumber.length() < 8 || telNumber.length() > 13) {
			result = "電話番号は7文字以上13文字以下で入力してください。";
		} else if (!telNumber.matches("^[0-9]+$")) {
			result = "電話番号は半角数字で入力してください。";
		}

		return result;
	}

	public String userAddressChk(String userAddress) {
		String result = "OK";

		if (userAddress.equals("") || userAddress == null) {
			result = "住所を入力してください。";
		} else if (userAddress.length() < 7 || userAddress.length() > 50) {
			result = "住所は7文字以上50文字以下で入力してください。";
		} else if (!userAddress.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
			result = "住所は半角英数字、漢字、カタカナ及び半角記号で入力してください。";
		}

		return result;
	}

	public String itemIdChk(String itemId) {
		String result = "OK";

		if (itemId.equals("")) {
			result = "商品Idを入力してください。";
		} else if (itemId.length() < 1 || itemId.length() > 3) {
			result = "商品Idは1桁以上3桁以下で入力してください。";
		} else if (!itemId.matches("^[0-9]+$")) {
			result = "商品Idは半角数字で入力してください。";
		}
		return result;
	}

	public String itemNameChk(String itemName) {
		String result = "OK";

		if (itemName.equals("")) {
			result = "商品名を入力してください。";
		} else if (itemName.length() < 1 || itemName.length() > 100) {
			result = "商品名は1文字以上100文字以下で入力してください。";
		} else if (!itemName.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
			result = "商品名は半角英数字、半角記号、全角記号、カタカナ、ひらがな、漢字で入力してください。";
		}
		return result;
	}

	public String itemNameKanaChk(String itemNameKana) {
		String result = "OK";

		if (itemNameKana.equals("")) {
			result = "商品名ふりがなを入力してください。";
		} else if (itemNameKana.length() < 1 || itemNameKana.length() > 100) {
			result = "商品名ふりがなは1文字以上100文字以下で入力してください。";
		} else if (!itemNameKana.matches("^[ぁ-ん]+$")) {
			result = "商品名ふりがなはひらがなで入力してください。";
		}
		return result;
	}

	public String itemDescriptionChk(String itemDescription) {
		String result = "OK";

		if (itemDescription.equals("")) {
			result = "商品詳細を入力してください。";
		} else if (itemDescription.length() < 1 || itemDescription.length() > 255) {
			result = "商品詳細は1文字以上255文字以下で入力してください。";
		} else if (!itemDescription.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
			result = "商品詳細は半角英数字、半角記号、全角記号、カタカナ、ひらがな、漢字で入力してください。";
		}
		return result;
	}

	public String releaseCompanyChk(String releaseCompany) {
		String result = "OK";

		if (releaseCompany.equals("")) {
			result = "商品販売会社名を入力してください。";
		} else if (releaseCompany.length() < 1 || releaseCompany.length() > 50) {
			result = "商品販売会社名は1文字以上50文字以下で入力してください。";
		} else if (!releaseCompany.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
			result = "商品名販売会社名は半角英数字、半角記号、全角記号、カタカナ、ひらがな、漢字で入力してください。";
		}
		return result;
	}

	public String insertItemStockChk(String insertItemStock) {
		String result = "OK";
		if (insertItemStock.equals("")) {
			result = "追加在庫数を入力してください。";
		} else if (insertItemStock.length() < 1 || insertItemStock.length() > 3) {
			result = "追加在庫数は1桁以上3桁以下で入力してください。";
		} else if (!insertItemStock.matches("^[0-9]+$")) {
			result = "追加在庫数は半角数字で入力してください。";
		}
		return result;
	}

	public String itemStockChk(String itemStock) {
		String result = "OK";
		if (itemStock.equals("")) {
			result = "在庫数を入力してください。";
		} else if (itemStock.length() < 1 || itemStock.length() > 3) {
			result = "在庫数は1桁以上3桁以下で入力してください。";
		} else if (!itemStock.matches("^[0-9]+$")) {
			result = "在庫数は半角数字で入力してください。";
		}
		return result;
	}

	public String priceChk(String price){
		String result="OK";
		if(price.equals("")){
			result="値段を入力してください";
		}else if(price.length()<1 || price.length()>9){
			result="値段は1桁以上9桁以下で入力してください。";
		}else if(!price.matches("^[0-9]+$")){
			result="値段は半角数字で入力してください。";
		}
		return result;
	}

	public String categoryNameChk(String categoryName){
		String result="OK";
	if (categoryName.equals("")) {
		result = "カテゴリー名を入力してください。";
	} else if (categoryName.length() < 1 || categoryName.length() > 10) {
		result = "カテゴリー名は1文字以上10文字以下で入力してください。";
	} else if (!categoryName.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
		result = "カテゴリー名は半角英数字、半角記号、全角記号、カタカナ、ひらがな、漢字で入力してください。";
	}
	return result;
	}

	public String categoryIdChk(String categoryId) {
		String result = "OK";

		if (categoryId.equals("")) {
			result = "カテゴリーIdを入力してください。";
		} else if (categoryId.length() < 1 || categoryId.length() > 3) {
			result = "カテゴリーIdは1桁以上3桁以下で入力してください。";
		} else if (!categoryId.matches("^[0-9]+$")) {
			result = "カテゴリーIdは半角数字で入力してください。";
		}
		return result;
	}

	public String categoryDescriptionChk(String categoryDescription) {
		String result = "OK";

		if (categoryDescription.equals("")) {
			result = "カテゴリー詳細を入力してください。";
		} else if (categoryDescription.length() < 1 || categoryDescription.length() > 255) {
			result = "カテゴリー詳細は1文字以上255文字以下で入力してください。";
		} else if (!categoryDescription.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
			result = "カテゴリー詳細は半角英数字、半角記号、全角記号、カタカナ、ひらがな、漢字で入力してください。";
		}
		return result;
	}



	/**
	 * 検索ワードの入力チェック
	 *
	 * @param keyword
	 * @return
	 */
	public String keywordChk(String keywords) {
		String result = "";

		if (keywords.length() < 1 || keywords.length() > 16) {
			result = "検索は、1文字以上16文字以下で入力してください。";
		} else if (!keywords.matches("^[a-zA-Z一-龠ァ-ヴあ-ん\\s\u30A1-\u30FC]+$")) {
			result = "検索は半角英数字、漢字、カタカナ、ひらがなで入力してください。";
		}

		return result;
	}

	/**
	 * <p>
	 * [概 要] 全角数字⇒半角数字への変換
	 * </p>
	 * <p>
	 * [詳 細]
	 * </p>
	 * <p>
	 * [備 考]
	 * </p>
	 *
	 * @param str
	 *            変換対象文字列
	 * @return 変換後文字列
	 */
	public static String changeNumFullToHalf(String str) {
		String result = null;
		if (str != null) {
			StringBuilder sb = new StringBuilder(str);
			for (int i = 0; i < sb.length(); i++) {
				int c = (int) sb.charAt(i);
				if (c >= 0xFF10 && c <= 0xFF19) {
					sb.setCharAt(i, (char) (c - 0xFEE0));
				}
			}
			result = sb.toString();
		}
		return result;
	}
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />

	<title>決済確認画面</title>

	<style type="text/css">

</style>

</head>
<body>

<s:form action="settlementCompleteAction">
		<p class="message">購入情報は以下になります</p>

<!-- 決済情報 -->
<s:iterator value="cartInfoList">
<p><input type="image" src="<s:property value='itemImagePath' />" alt="画像なし"width="100" height="100" ></p>
<s:property value="itemName" />
<s:property value="itemNameKana" />
<s:property value="itemPrice" />円
<s:property value="itemCount" />
<s:property value="itemCompany" />
</s:iterator>

<s:property value="itemTotalPrice" />

<!-- 宛先情報一覧 -->

<s:iterator value="destinationList">

<input type="radio" name="destination" checked="checked"/>
お届け先住所

ふりがな
<s:property value="family_name_kana"/>
<s:property value="first_name_kana"/>
<br>
名前
<s:property value="family_name"/>
<s:property value="first_name"/>
<br>
住所
<s:property value="user_address"/>
<br>
電話番号
<s:property value="tel_number"/>
<br>
メールアドレス
<s:property value="email"/>

</s:iterator>

<button type="submit">購入</button>

</s:form>

<br>
<p><a href='<s:url action="CartAction" />'>カートに戻る</a></p>
<p><a href='<s:url action="CreateAddressAction" />'>宛先登録</a></p>
<br>


<footer>
</footer>

</body>
</html>
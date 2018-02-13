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

<s:form action="SettlementCompleteAction">
		<p class="message">購入情報は以下になります</p>

<!-- 決済情報 -->

<table border="1">
<tr>
<s:iterator value="cartInfoList">
<td>

<div class="img">
<img src='<s:property value="imageFilePath"/>' alt="画像なし" width="100px" height="100px" />
</div>
</td>
<td>
<div class="name">
商品名：<s:property value="itemName" />
</div>
<div class="kana">
ふりがな：<s:property value="itemNameKana" />
</div>
<div class="price">
価格：<s:property value="price" />円
</div>
<div class="count">
個数：<s:property value="itemCount" />個
</div>
<div class="total">
合計価格：<s:property value="total" />円
</div>
<div class="company">
発売会社<s:property value="releaseCompany" />
</div>
</td>

<br>
<br>


</s:iterator>

</table>
<br>
<br>
<br>


合計金額:<s:property value="#session.cartTotalPrice" />円


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
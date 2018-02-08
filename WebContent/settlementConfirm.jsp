<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<title>決済確認画面</title>

	<style type="text/css">

</style>

</head>
<body>

 <div id="main">
<br>
<div id="title">
<span>CART</span>
</div>

<!-- カート情報と宛先情報の表示 -->
<s:form action="SettlementCompleteAction">

<!-- カート確認は動作未確認 -->
<s:iterator value="session.cartInfoList">
<table>
<tr>
<td>
<img src='<s:property value="imageFilePath" />
<s:property value="imageFileName" />' id="cartImg">
</td>
<td>
<s:property value="productName" />&nbsp;(<s:property value="productNameKana"/>)<br><br>
<s:hidden value="price"/>&nbsp;<s:property value="itemCount"/>点<br><br>
合計 <s:property value="totalPriceComma"/><s:hidden value="totalPrice"/><br><br><br><br>
<s:property value="releaseCompany"/><br>
<s:property value="releaseDate"/>
</td>
</tr>
</table>
</s:iterator>
<br>
<br>
<br>

<div class="cartText">
カート合計金額  <s:property value="session.cartTotalPriceComma"/>
</div>

<br>
<br>
<br>
<br>
<br>

<div id="title">
<span>DESTINATION</span>
</div>
<!-- 宛先情報とラジオボタンを表示 -->
<br/>
<s:if test="destinationList.isEmpty()">
<h1>宛先情報が登録されていません</h1>
<h2>宛先登録は<a href='<s:url action="DestinationCreateMoveAction" />'>こちら</a></h2>
</s:if>
<s:iterator value="destinationList">
<table class="destination">
<tr>
<td id="check">
<s:textfield name="destinationList" type="radio" value="%{destinationList[#stat.index]['id']}" checked=""></s:textfield>
</td>
<td>
<s:property value="familyName"/>&nbsp;<s:property value="firstName" />
&nbsp;(<s:property value="familyNameKana" />&nbsp;<s:property value="firstNameKana" />)<br><br>
<s:property value="userAddress" /><br><br>
<s:property value="telNumber" /><br><br>
<s:property value="email" />
</td>
</tr>
</table>
</s:iterator>
<br>
<br>
<br>
<br>
<div class="cartText">
<s:submit value=" 決済確定 "/>
</div>
</s:form>
<br>
<p><a href='<s:url action="CartAction" />'>カートに戻る</a></p>
<p><a href='<s:url action="DestinationCreateMoveAction" />'>宛先登録</a></p>
<br>
</div>

<footer>
<p>good tomorrow co.,ltd All rights reserved</p>
</footer>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/settlementConfirm.css">
	<title>決済確認画面</title>

	<style type="text/css">

</style>

</head>
<body>

<s:form action="SettlementCompleteAction">
		<p class="message">購入情報は以下になります</p>

<!-- 決済情報 -->


<s:iterator value="cartInfoList">

<table border="1">
<tr>

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

</tr>
</table>

<br>
<br>

</s:iterator>

<br>
<br>
<br>

<div class="totalPrice">
合計金額:<s:property value="#session.cartTotalPrice" />円
</div>
<br>
<!-- 宛先情報一覧 -->
<br>
<table border="1" class="destinationTable">
<tr>
<s:if test="destinationFlg = Error">
宛先情報がありませんので宛先を登録してください。
</s:if>





<s:else>
<br>
<p class="center">お届け先住所を選択してください。</p>

<s:iterator value="destinationList" status="st">
<td>
<input type="radio" name="id" value="#st.index" checked="checked"/>

</td>
<td>
ふりがな:

<s:property value="familyNameKana"/>
<s:property value="firstNameKana"/>

<br>
名前:

<s:property value="familyName"/>
<s:property value="firstName"/>

<br>
住所:
<s:property value="userAddress"/>
<br>
電話番号:
<s:property value="telNumber"/>
<br>
メールアドレス:
<s:property value="email"/>

<input type="text" value="<s:property value="id"/>">
</td>
<input type="hidden" name="familyName" value="<s:property value="familyName"/>"  >
<input type="hidden" name="firstName" value="<s:property value="firstName"/>" >
<input type="hidden" name="familyNameKana" value="<s:property value="familyNameKana"/>"  >
<input type="hidden" name="firstNameKana" value="<s:property value="firstNameKana"/>"  >
<input type="hidden" name="email" value="<s:property value="email"/>"  >
<input type="hidden" name="telNumber" value="<s:property value="telNumber"/>"  >
<input type="hidden" name="userAddress" value="<s:property value="userAddress"/>"  >
</s:iterator>
</s:else>
</tr>
</table>

<button type="submit">購入</button>
</s:form>


<br>
<p><a href='<s:url action="CartAction" />'>カートに戻る</a></p>

<s:form action="CreateAddressAction">

<s:iterator value="oneDestinationList">
<
<input type="hidden" name="familyName" value="<s:property value="familyName"/>"  >
<input type="hidden" name="firstName" value="<s:property value="firstName"/>" >
<input type="hidden" name="familyNameKana" value="<s:property value="familyNameKana"/>"  >
<input type="hidden" name="firstNameKana" value="<s:property value="firstNameKana"/>"  >
<input type="hidden" name="email" value="<s:property value="email"/>"  >
<input type="hidden" name="telNumber" value="<s:property value="telNumber"/>"  >
<input type="hidden" name="userAddress" value="<s:property value="userAddress"/>"  >


</s:iterator>


<button type="submit">宛先登録</button>

</s:form>

<p><a href='<s:url action="CreateAddressAction" />'>宛先登録</a></p>
<br>

<footer>
</footer>

</body>
</html>
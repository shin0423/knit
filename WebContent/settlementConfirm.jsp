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
		<br>
		<br>

		<div class="message">購入情報は以下になります</div>

		<br>
		<br>
		<br>
		<br>




<!-- 決済情報 -->


<s:iterator value="cartInfoList">


<table border="1" class="settlementtable">
<tr>
<td rowspan="6">
<div class="img">
<img src='<s:property value="imageFilePath"/>' alt="画像なし" />
</div>
</td>

<td>
商品名
</td>
<td>
<s:property value="itemName" />
</tr>
<tr>
<td>
ふりがな
</td>
<td>
<s:property value="itemNameKana" />
</td>
</tr>
<tr>
<td>
価格
</td>
<td>
<s:property value="price" />円
</td>
</tr>
<tr>
<td>
個数
</td>
<td>
<s:property value="itemCount" />個
</td>
</tr>
<tr>
<td>
合計価格
</td>
<td>
<s:property value="total" />円
</td>
</tr>
<tr>
<td>
発売会社
</td>
<td>
<s:property value="releaseCompany" />
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


<s:if test="destinationList.isEmpty()">
宛先情報がありませんので宛先を登録してください。
</s:if>





<s:else>
<br>
<p class="message">お届け先住所を選択してください。</p>

<s:iterator value="destinationList" status="st">

<table class="destinationTable" >

<tr>

<td rowspan="6">
<input type="radio" name="id" value="<s:property value='#st.index'/>" checked="checked"/>

</td>
<td class="midasi">ふりがな</td>
<td class="jouhou"><s:property value="familyNameKana"/><s:property value="firstNameKana"/></td>
<tr/>

<tr>
<td  class="midasi" >名前</td>
<td class="jouhou"><s:property value="familyName"/><s:property value="firstName"/></td>
</tr>

<tr>
<td  class="midasi">住所</td>
<td class="jouhou" ><s:property value="userAddress"/></td>
</tr>

<tr>
<td  class="midasi">電話番号</td>
<td class="jouhou"><s:property value="telNumber"/></td>
</tr>

<tr>
<td  class="midasi">メールアドレス</td>
<td class="jouhou"><s:property value="email"/></td>
</tr>
</table>
<br>

</s:iterator>
</s:else>



<button type="submit" class="purchase">購入</button>
</s:form>


<br>


<s:form action="CreateAddressAction">

<s:iterator value="destinationList" >

<input type="hidden" name="familyName" value="<s:property value="familyName"/>"  >
<input type="hidden" name="firstName" value="<s:property value="firstName"/>" >
<input type="hidden" name="familyNameKana" value="<s:property value="familyNameKana"/>"  >
<input type="hidden" name="firstNameKana" value="<s:property value="firstNameKana"/>"  >
<input type="hidden" name="email" value="<s:property value="email"/>"  >
<input type="hidden" name="telNumber" value="<s:property value="telNumber"/>"  >
<input type="hidden" name="userAddress" value="<s:property value="userAddress"/>"  >



</s:iterator>


<button type="submit" class="destination">宛先登録</button>

</s:form>

<p><a href='<s:url action="CartAction" />'>カートに戻る</a></p>


<br>

<footer>
</footer>

</body>
</html>
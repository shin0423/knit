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
<jsp:include page="headerInclude.jsp"/>
<s:form action="SettlementCompleteAction">
		<br>
		<br>

		<div class="message1">注文内容は以下になります</div>

		<br>
		<br>
		<br>
		<br>


<!-- 決済情報 -->





<s:iterator value="cartInfoList">

<div class="box17">


<table class="settlementTable">
<tr>
<td colspan="2">

<img class="img" src='<s:property value="imageFilePath"/>' alt="画像なし" />
</td>
</tr>
<tr class="space"><br></tr>
<tr>
<th>商品名</th>
<td><s:property value="itemName" /></td>
</tr>
<tr>
<th>価格</th>
<td><s:property value="price" />円</td>
</tr>
<tr>
<th>個数</th>
<td><s:property value="itemCount" />個</td>
</tr>
<tr>
<th>発売会社</th>
<td><s:property value="releaseCompany" /></td>
</tr>
<tr class="space"></tr>
<tr>
<th class="total">小計</th>
<td><s:property value="total" />円</td>
</tr>

</table>

<br>
<br>

</div>



</s:iterator>



<br>
<br>
<br>

<div class="totalPrice">
合計金額:<s:property value="#session.cartTotalPrice" />円
</div>

<br>
<br>
<br>
<br>
<br>

<p><a href='<s:url action="CartAction" />'>カートに戻る</a></p>

<!-- 宛先情報一覧 -->

<br>

<s:if test="destinationList.isEmpty()">
<div class="errorMessage">宛先情報に不備がありますので宛先を登録してください。</div>
</s:if>

<s:else>

<br>

<p class="message2">お届け先住所を選択してください。</p>

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

<button type="submit" class="purchase">購入</button>

</s:else>



</s:form>


<br>

<s:form action="CreateAddressAction">

<s:iterator value="oneDestinationList" >

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




<br>

<footer>
<jsp:include page="footerInclude.jsp"/>
</footer>

</body>
</html>

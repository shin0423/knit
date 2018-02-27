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



<!-- 決済情報 -->





<s:iterator value="cartInfoList">

<div class="box14">

<table class ="settlementTable" >

<tr>
<td class="imgw" rowspan="8">
<img class="img" src='<s:property value="imageFilePath"/>' alt="画像なし" />
</td>

<tr>
<td class="spw" rowspan="7"></td>


<th>商品名</th>
<td><s:property value="itemName" /></td>
<tr/>

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
<td><s:property value="total" /> 円</td>
<tr/>

</table>

<br>
<br>

</div>

</s:iterator>

<br>
<br>
<br>
<div class="totalPrice">
合計金額:<span class="tpt"><s:property value="#session.cartTotalPrice" /></span> 円
</div>
<s:hidden name="token" value="%{token}" />
<br>


<!-- 宛先情報一覧 -->

<br>

<s:if test="destinationList.isEmpty()">

<div class="errorMessage">宛先情報に不備がありますので宛先を登録してください。</div>
</s:if>

<s:else>

<br>
<div class="destination">

<h3 class="message2">--------------------------お届け先住所を選択してください--------------------------</h3>

<div id="box">

<s:iterator value="destinationList" status="st">

<div id="item">

<table class="destinationTable" >

<tr>

<td class="b" rowspan="7" >
<input type="radio" name="id" value="<s:property value='#st.index'/>" checked="checked"/>

</td>
<tr>
<th class="midasi">ふりがな</th>
<td class="jouhou"><s:property value="familyNameKana"/><s:property value="firstNameKana"/></td>
<tr/>

<tr>
<th  class="midasi" >名前</th>
<td class="jouhou"><s:property value="familyName"/><s:property value="firstName"/></td>
</tr>

<tr>
<th  class="midasi">住所</th>
<td class="jouhou" ><s:property value="userAddress"/></td>
</tr>

<tr>
<th  class="midasi">電話番号</th>
<td class="jouhou"><s:property value="telNumber"/></td>
</tr>

<tr>
<th  class="midasi">ﾒｰﾙｱﾄﾞﾚｽ</th>
<td class="jouhou"><s:property value="email"/></td>
</tr>


</table>

<br>
</div>
</s:iterator>
</div>



<div id="button">
<s:a href="javascrrpt:void(0)"
onclick="document.SettlementCompleteAction.submit();return false;" class="button">購入</s:a>



			</div>
</div>
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

<div class="destination">
<div id="button">
<s:a href="javascrrpt:void(0)"
onclick="document.CreateAddressAction.submit();return false;" class="button">宛先登録</s:a>
</div>
</div>
</s:form>




<br>

<footer>
<jsp:include page="footerInclude.jsp"/>
</footer>

</body>
</html>

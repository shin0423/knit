<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/createAddress.css">
 <title>宛先情報登録</title>
 </head>
 <body>
  <s:form action="CreateAddressConfirmAction">

<table>



	<!-- ここから入力エラーメッセージ表示 -->
		<s:iterator value="errMsgList">
		<h5>
			<s:div align="center">
				<s:property />
			</s:div>
		</h5>
		</s:iterator>

</table>

<p class="message">宛先登録画面</p>

<table>
<tr>

   <th>姓必須</th>
   <td><s:textfield name="familyName" value="%{familyName}" /></td>
</tr>

<tr>
   <th>名必須</th>
  <td> <s:textfield name="firstName" value="%{firstName}" /></td>
</tr>

<tr>
<th>せい必須</th>
<td>	<s:textfield name="familyNameKana" value="%{familyNameKana}" /></td>

</tr>

<tr>
   <th>めい必須</th>
   <td><s:textfield name="firstNameKana" value="%{firstNameKana}" /><td>
</tr>

   <tr>
   <th>E-mail必須</th>
   <td><s:textfield name="email" value="%{email}" /></td>
</tr>

<tr>
   <th>電話番号必須</th>
   <td><s:textfield name="telNumber" value="%{telNumber}" /></td>
</tr>

<tr>
   <th>住所必須</th>
   <td><s:textfield name="userAddress" value="" /></td>
</tr>
</table>

   <s:form action="CreateAddressConfirmAction">
   <s:submit class="button" value="登録"/>
   </s:form>

   <br>

   <s:form action="SettlementConfirmAction">
   <s:submit class="returnButton" value="戻る"/>
   </s:form>
  </s:form>
 </body>
</html>
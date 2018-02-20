<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/createAddressConfirm.css">
 <title>宛先情報確認</title>
 </head>
 <body>

<br>
<br>
<div class="message">宛先確認</div>

 <div class="form_conf">

  <s:form action="CreateAddressAction">

  <s:hidden name="familyName" value="%{familyName}" />
<s:hidden name="firstName" value="%{firstName}" />
<s:hidden name="familyNameKana" value="%{familyNameKana}" />
<s:hidden name="firstNameKana" value="%{firstNameKana}"/>
<s:hidden name="email" value="%{email}"/>
<s:hidden name="telNumber" value="%{telNumber}" />
<s:hidden name="userAddress" value="%{userAddress}"/>


<button class="button" type="submit">戻る</button>


  </s:form>

  <s:form action="CreateAddressCompleteAction"><br>

  <table class="des">

<tr>
<th>姓</th>
<td><s:property value="familyName"/></td>
</tr>

<tr>
<th>名</th>
<td><s:property value="firstName"/></td>
</tr>

<tr>
<th>せい</th>
<td><s:property value="familyNameKana"/></td>
</tr>

<tr>
<th>めい</th>
<td><s:property value="firstNameKana"/><td>
</tr>

<tr>
<th>E-mail</th>
<td><s:property value="email"/></td>
</tr>

<tr>
<th>電話番号</th>
<td><s:property value="telNumber"/></td>
</tr>

<tr>
<th>住所</th>
<td><s:property value="userAddress"/></td>
</tr>

</table>
</div>





<s:hidden name="familyName" value="%{familyName}" />
<s:hidden name="firstName" value="%{firstName}" />
<s:hidden name="familyNameKana" value="%{familyNameKana}" />
<s:hidden name="firstNameKana" value="%{firstNameKana}"/>
<s:hidden name="email" value="%{email}"/>
<s:hidden name="telNumber" value="%{telNumber}" />
<s:hidden name="userAddress" value="%{userAddress}"/>
   <button class="button" type="submit">登録情報を確定</button>


  </s:form>


  </div>
 </body>
</html>
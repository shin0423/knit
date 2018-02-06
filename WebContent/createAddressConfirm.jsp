<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>宛先情報確認</title>
 </head>
 <body>
  <s:form action="CreateAddressCompleteAction"><br>
familyName<s:property value="familyName"/><br>
firstName<s:property value="firstName"/><br>
familyNameKana<s:property value="familyNameKana"/><br>
firstNameKana<s:property value="firstNameKana"/><br>
email<s:property value="email"/><br>
telNumber<s:property value="telNumber"/><br>
userAddress<s:property value="userAddress"/><br>

<s:hidden name="familyName" value="%{familyName}" />
<s:hidden name="firstName" value="%{firstName}" />
<s:hidden name="familyNameKana" value="aaa" />
<s:hidden name="firstNameKana" value="%{firstNameKana}"/>
<s:hidden name="email" value="%{email}"/>
<s:hidden name="telNumber" value="%{telNumber}" />
<s:hidden name="userAddress" value="%{userAddress}"/>
   <button type="submit">登録情報を確定</button>
   <a href="/knit/createAddress.jsp">戻る</a>
  </s:form>
 </body>
</html>
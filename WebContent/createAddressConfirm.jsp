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
  <s:form action="CreateAddressComplete">
   <s:property value="familyName"/>
   <s:hidden name="familyName" value="%{familyName}" />
   <br>
   <s:property value="firstName"/>
   <s:hidden name="firstName" value="%{firstName}" />
   <br>
   <s:property value="familyNameKana"/>
   <s:hidden name="familyNameKana" value="%{familyNameKana}" />
   <br>
   <s:property value="firstNameKana"/>
   <s:hidden name="firstNameKana" value="%{firstNameKana}"/>
   <br>
   <s:property value="email"/>
   <s:hidden name="email" value="%{email}"/>
   <br>
   <s:property value="telNumber"/>
   <s:hidden name="telNumber" value="%{telNumber}" />
   <br>
   <s:property value="userAddress"/>
   <s:hidden name="userAddress" value="%{userAddress}"/>
   <br>
   <button type="submit">登録情報を確定</button>
   <a href="/knit/createAddress.jsp">戻る</a>
  </s:form>
 </body>
</html>
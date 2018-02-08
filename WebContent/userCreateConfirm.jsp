<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>ユーザー情報確認</title>
 </head>
 <body>
  <s:form action="UserCreateCompleteAction">
   ユーザーID:<s:property value="userId"/>
   <s:hidden name="userId" value="%{userId}" />
   <br>
   パスワード:<s:property value="password"/>
   <s:hidden name="password" value="%{password}" />
   <br>
   姓:<s:property value="familyName"/>
   <s:hidden name="familyName" value="%{familyName}" />
   <br>
   名:<s:property value="firstName"/>
   <s:hidden name="firstName" value="%{firstName}" />
   <br>
   姓ふりがな:<s:property value="familyNameKana"/>
   <s:hidden name="familyNameKana" value="%{familyNameKana}" />
   <br>
   名ふりがな:<s:property value="firstNameKana"/>
   <s:hidden name="firstNameKana" value="%{firstNameKana}"/>
   <br>
   性別:<s:property value="sex"/>
   <s:hidden name="sex" value="%{sex}"/>
   <br>
   メール:<s:property value="email"/>
   <s:hidden name="email" value="%{email}"/>
   <br>
   電話番号:<s:property value="telNumber"/>
   <s:hidden name="telNumber" value="%{telNumber}" />
   <br>
   住所:<s:property value="userAddress"/>
   <s:hidden name="userAddress" value="%{userAddress}"/>
   <br>
   <button type="submit">登録情報を確定</button>
   <a href="/knit/userCreate.jsp">戻る</a>
  </s:form>
 </body>
</html>
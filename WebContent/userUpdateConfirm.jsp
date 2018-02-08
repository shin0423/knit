<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>ユーザー情報変更確認</title>
 </head>
 <body>
  <s:form action="UserUpdateCompleteAction">
   ユーザーID<s:property value="userId"/>
   <s:hidden name="userId" value="%{userId}" />
   <br>
   新規パスワード<s:property value="newPassword"/>
   <s:hidden name="newPassword" value="%{newPassword}" />
   <br>
   電話番号<s:property value="telNumber"/>
   <s:hidden name="telNumber" value="%{telNumber}" />
   <br>
   住所<s:property value="userAddress"/>
   <s:hidden name="userAddress" value="%{userAddress}"/>
   <br>
   <button type="submit">登録情報を確定</button>
   <a href="/knit/userUpdate.jsp">戻る</a>
  </s:form>
 </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
 <title>ユーザー情報変更確認</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
 </head>
 <body>
  <div id="header">
 <div id="logo">
 <ul>
 <li>検索画面</li>
 <li>カテゴリ</li>
 <li><a href="/knit/mypage.jsp" >マイページ</a></li>
 <li><a href="/knit/login.jsp" >ログイン</a></li>
 <li><a href="/knit/cart.jsp" >カート</a></li>
</ul>
 </div>
</div>
<div id="main">
<div id="main_title"><p>入力情報確認</p></div>
  <s:form action="UserUpdateCompleteAction">
  <div id="main_contents">
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
   </div>
   <br>
   <div id="button">
   <button type ="button" onclick ="location.href='/knit/userUpdate.jsp'">戻る</button>
   <button type="submit">登録情報を確定</button>
   </div>
  </s:form>
  </div>
  <div id="footer">
  </div>
 </body>
</html>
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
 <title>ユーザー情報確認</title>
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
  <s:form action="UserCreateCompleteAction">
  <div id="main_contents">
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
</div>
   <div id="button">
   <button type ="button" onclick ="location.href='/knit/userCreate.jsp'">戻る</button>
   <button type="submit">登録情報を確定</button>
   </div>
   </s:form>
  </div>
  <div id="footer">
  </div>
 </body>
</html>
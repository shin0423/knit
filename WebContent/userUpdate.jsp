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
 <title>ユーザー情報変更</title>
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
<div id="main_title"><p>ユーザー情報変更<p></div>
<s:form action="UserUpdateConfirmAction">
<div id="main_contents">
<s:if test="errorMessage !=''">
<s:property value="errorMessage" escape="false" />
</s:if>
<s:iterator value="errMsgList">
		<h5>
			<s:div align="center">
				<s:property />
			</s:div>
		</h5>
		</s:iterator>

   <br>
   <span>ユーザーID</span><span>必須</span>
   <s:textfield name="userId" value="%{userId}" />
   <br>
   <span>新規パスワード</span><span>必須</span>
   <s:password name="newPassword" value="%{newPassword}" />
   <br>
   <span>確認用パスワード</span><span>必須</span>
   <s:password name="conPassword" value="%{conPassword}" />
   <br>
   <span>電話番号</span><span>必須</span>
   <s:textfield name="telNumber" value="%{telNumber}" />
   <br>
   <span>住所</span><span>必須</span>
   <s:textfield name="userAddress" value="%{userAddress}" />
   <br>
   </div>
   <div id="button">
   <a href="<s:url action='MyPageAction'/>">戻る</a>
   <button type="submit">登録</button>
   </div>
  </s:form>
  </div>
  <div id="footer">
  </div>
 </body>
</html>
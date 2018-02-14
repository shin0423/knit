<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>ユーザー登録完了</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
<script language="JavaScript">
<!--
function autoLoginAction(){
document.loginAction.submit();
}
//-->



</script>
</head>
<body onload="setTimeout( 'autoLoginAction()', 5000 )">

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
<div id="main_contents">
<h3>ユーザー登録が完了しました。</h3>
<h3>5秒後にホーム画面に遷移します</h3>
<br>
<s:form name="loginAction" action="LoginAction" method="post">
<s:hidden name="userId" VALUE="{$userId}" />
<s:hidden name="password" VALUE="{$password}" />
すぐに遷移する場合はこちら<input type="submit" VALUE="ホーム">
</s:form>
</div>
</div>
<div id="footer">
コピーライト
</div>
</body>
</html>
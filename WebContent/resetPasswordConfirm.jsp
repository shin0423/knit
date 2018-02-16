<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="text/javascript"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/resetPassword.css">
<title>パスワード再設定確認</title>
</head>
<body>
<header>
</header>
	<div id="main">
	<br>
		<div id="title">
			<p>パスワード再設定確認</p>
		</div>
		<s:form action="ResetPasswordCompleteAction">
		<div>入力内容をご確認ください</div>
		<table>
			<tr>
				<th>ユーザーID</th>
				<td><s:property value="hideUserId"/></td>
			</tr>
			<tr>
				<th>パスワード</th>
				<td><s:property value="hideNewLoginPassword"/></td>
			</tr>
		</table>
		<br>
		<s:hidden name="userId" value="%{userId}"/>
		<s:hidden name="newPassword" value="%{newPassword}"/>
		<div id="button">
			<button type ="button" onclick ="location.href='/knit/ResetPasswordAction'">戻る</button>
			<button type="submit"><span>変更する</span></button>
			</div>
		</s:form>



	</div>
		<br>
	<footer>
	</footer>
</body>
</html>
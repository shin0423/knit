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
<title>パスワード再設定確認</title>
</head>
<body>
<header>
</header>
	<div id="main">
	<br>
		<div id="title">
			<span>パスワード再設定確認</span>
		</div>
		<s:form action="ResetPasswordCompleteAction">
		<div>入力内容をご確認ください</div>
		<table>
			<tr>
				<td>USERID</td>
				<td><s:property value="hideUserId"/></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><s:property value="hideNewLoginPassword"/></td>
			</tr>
		</table>
		<br>
		<s:hidden name="userId" value="%{userId}"/>
		<s:hidden name="newPassword" value="%{newPassword}"/>
		<div id="button">
			<a href='<s:url action = "ResetPasswordAction"/>'>戻る</a>
			<button type="submit"><span>確定</span></button>
			</div>
		</s:form>



	</div>
		<br>
	<footer>
	</footer>
</body>
</html>
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

<title>パスワード再設定</title>
</head>
<body>
		<header>
		<jsp:include page="headerInclude.jsp"/>
		</header>
		<div id="main">
		<br>
			<div id="title"><p>パスワードを再設定する</p>
			</div>
		<s:form action="ResetPasswordConfirmAction">
		<div>パスワードを再設定してください</div>
			<table>
				<tr>
					<th>ユーザーID</th>
					<td><s:textfield name="userId" placeholder="IDを入力" value=""/></td>
				</tr>
				<tr>
					<th>新規パスワード</th>
					<td><s:password name="newPassword" placeholder="1～16文字の半角英数字"/></td>
				</tr>
				<tr>
					<th>新規パスワード(確認用)</th>
					<td><s:password name="conPassword" placeholder="確認のため再入力"/></td>
				</tr>
			</table>
			<br>

			<div id="button">
			<button type ="button" onclick ="location.href='/knit/GoLoginPageAction'">戻る</button>
			<button type="submit">確認画面へ</button>
			<!--<a href="/knit/login.jsp" class="deg_btn">戻る</a>
			<button type = "submit" id="deg_btn2">確認画面へ</button>-->
			</div>
			</s:form>
			<div id="error">
			<br>
				<s:property value="passwordErrorMessage"/>
			<br>
			</div>
			</div>
			<br>
			<footer>
			<jsp:include page="footerInclude.jsp"/>
			</footer>
</body>
</html>
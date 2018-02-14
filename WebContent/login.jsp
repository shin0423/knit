<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<link href="${pageContext.request.contextPath}/css/login_style.css" rel="stylesheet" type="text/css">

<title>ログインページ</title>
</head>
<body>

	<div id="header">
		<div id="logo_container"></div>
		<ul>
			<li>aaaaaaaaa</li>
			<li>bbbbbbbbb</li>
			<li>ccccccccc</li>
		</ul>
	</div>

	<div id="main">
		<div id="main_container">
		<h3>ログインページ</h3>

		<div id="left_contents">
		<table>
			<s:form action="LoginAction">
			<tr>
				<td>ID:</td>
				<td><s:textfield name="userId" value="%{#session.saveUserId}" /></td>
			</tr>
			<tr>
				<td>パスワード:</td>
				<td><s:password name="password" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<div>
					<s:submit value="確認" />
					<input type="checkbox" value="true" name="saveId" >ID保存の場合はチェック
				</div>
				</td>
			</tr>
			</s:form>
		</table>


		<div>
			<s:if test="errorMessage != null " >
			<div id="errorMessage">
				<s:iterator value="errorMessage">
					<s:property /><br>
				</s:iterator>
			</div>
		</s:if>
		</div>
		</div>

		<div id="right_contents">

			<div>新規ユーザー登録は<a href="<s:url action='UserCreateAction' />">こちら</a></div>
			<div>パスワード再設定は<a href="<s:url action='ResetPasswordAction' />">こちら</a></div>
			<div>ホーム画面へ戻る時は<a href="<s:url action='TopAction' />">こちら</a></div>

		</div>

		</div>
	</div>

	<div id="footer">
	</div>

</body>
</html>
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

<link href="./css/login_style.css" rel="stylesheet" type="text/css">

<title>ログインページ</title>
</head>
<body>

		<header>
		</header>

		<div id="main">
		<br>
			<div id="title"><p>ログインページ</p>
			</div>
			<s:form action="LoginAction">
				<div>ログイン情報を入力してください</div>
				<table>
					<tr>
						<th>ユーザーID</th>
						<td><s:textfield name="userId" value="%{#session.saveUserId}"
								placeholder="IDを入力" /></td>
					</tr>
					<tr>
						<th>パスワード</th>
						<td><s:password name="password" placeholder="4～16文字の半角英数字" /></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="checkbox" id="checkbox" value="true" name="saveId">ID保存の場合はチェック
						</td>
					</tr>
				</table>
				<br>
				<div id="button">
					<button type="submit"
						onclick="<s:url action='TopAction' />">戻る</button>
					<button type="submit">確認</button>

				</div>
			</s:form>

			<br><br>
			<s:if test="errorMessage != null " >
				<div id="error">
					<s:iterator value="errorMessage">
						<s:property /><br>
					</s:iterator>
				</div>
			</s:if>
			<br><br>
			<div>新規ユーザー登録は<a href="<s:url action='UserCreateAction' />">こちら</a></div>
			<div>パスワード再設定は<a href="<s:url action='ResetPasswordAction' />">こちら</a></div>
		</div>

		<footer>
		</footer>

</body>
</html>
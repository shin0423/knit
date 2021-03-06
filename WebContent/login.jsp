<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- https://qiita.com/yukinaka/items/c4fcb7f0878702485f70  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_style.css">


<title>ログイン画面</title>
<script type="text/javascript">

<!--
	function goLoginAction() {
	document.loginAction.submit();
}
//-->

</script>
</head>
<body>

	<!-- ヘッダー -->

	<jsp:include page="headerInclude.jsp"/>



	<div class="main">

				<div class="title">

					<h3>ログインページ</h3>

				</div>

				<div id="mainContainer">
				<div id="leftContents">
					<s:form action="LoginAction" name="loginAction" method="post">
					<table>
						<tbody>
						<tr>
							<th>ユーザーID :</th>
							<td><s:textfield name="userId" value="%{#session.saveId}" />
							</td>
						</tr>

						<tr>
							<th>パスワード :</th>
							<td><s:password name="password" /></td>
						</tr>

						<tr>
							<td id="checkbox" colspan="2"><s:checkbox name="saveId" value="true" />ID保存</td>
						</tr>

						<tr>
							<td colspan="2">
								<div class="buttonBox">
									<div class="submitButtonBox">
										<s:a href="javascrrpt:void(0)"
											onclick="document.loginAction.submit();return false;"
											class="sbutton">確定</s:a>
									</div>

									<div class="backButtonBox">
										<s:a href="/knit/TopAction" class="bbutton">戻る</s:a>
									</div>
								</div>
							</td>
						</tr>

						<tr>
							<td colspan="2"><s:if test="errorMessage != null ">
									<div id="error">
										<s:iterator value="errorMessage">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</s:if></td>
						</tr>
					</tbody>
					</table>
					</s:form>
				</div>
					<div id="rightContents">
						<div class="btn0">
							<a href="/knit/UserCreateAction" class="button">新規ユーザー登録</a>
						</div>
						<div class="btn0">
							<a href="/knit/ResetPasswordAction" class="button">パスワード再設定</a>
						</div>
					</div>

				</div>
	</div>


	<!-- フッター -->

	<jsp:include page="footerInclude.jsp"/>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- https://qiita.com/yukinaka/items/c4fcb7f0878702485f70  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mypage.css">


<title>マイページ画面</title>

</head>
<body>

	<!-- ヘッダー -->

	<div class="header"></div>



	<div class="main">

		<div id="secRegist" class="section">

			<div class="sectionInner">

				<div class="sectionHeader">

					<h3>会員登録情報</h3>
					<!-- sectionHeader -->
				</div>

				<div class="contBody">
					<table>
						<tbody>
							<s:iterator value="myPageList">
								<tr>
									<th>ふりがな</th>
									<td>
										<p>
											<s:property value="familyNameKana" />
											<s:property value="firstNameKana" />
										</p>
									</td>

								</tr>

								<tr>
									<th>氏名</th>
									<td><p>
											<s:property value="familyName" />
											<s:property value="firstName" />
										</p></td>

								</tr>

								<tr>
									<th>性別</th>
									<td><p>
											<s:if test="sex==0">男性</s:if>
											<s:else>女性</s:else>
										</p></td>

								</tr>

								<tr>
									<th>メールアドレス</th>
									<td><s:property value="email" /></td>

								</tr>

								<tr>
									<th>ID</th>
									<td><p>
											<s:property value="userId" />
										</p></td>

								</tr>

								<tr>
									<th>password</th>
									<td><p>
											<s:property value="password" />
										</p></td>

							</s:iterator>
						</tbody>
					</table>

					<div class="buttonBox">
						<div class="btnn">
							<a href="/knit/PurchaseHistoryAction" class="button">購入履歴</a>
						</div>
					</div>


					<div class="buttonBox">
						<div class="btn">
							<a href="/knit/UserUpdateAction" class="button">変更</a>
						</div>
					</div>

					<div class="buttonBox">
						<div class="btn0">
							<a href="/knit/UserDeleteAction" class="button">退会</a>
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>


	<!-- フッター -->

	<div class="footer"></div>



</body>
</html>
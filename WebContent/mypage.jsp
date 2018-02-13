<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- https://qiita.com/yukinaka/items/c4fcb7f0878702485f70  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/reset.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mt_style.css">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/img/favicon.ico">
	
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mypage.css">
	
<style type="text/css">

header{
	background: #F48FB1;
	box-shadow: 0 2px 4px rgba(0,0,0,0.1);
}

html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed,
figure, figcaption, footer, header, hgroup,
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}

article, aside, details, figcaption, figure,
footer, header, hgroup, menu, nav, section {
	display: block;
}

.main {
	width: 100%;
}

#secRegist {
	width: 100%;
	margin: 0;
	padding: 0;
}

.sectionInner {
	width: 100%;
	height: 500px;
	margin-right: auto;
	margin-left: auto;
	margin-top: 20px;
}

.sectionHeader {
	width: 133px;
	height: 30px;
    margin: 23px 0 10px 0;
	text-align: center;
	font-weight: bold;
	background: #ffe6ea;
	padding: 0.2em 0.5em;
	margin-right: auto;
	margin-left: 3em;
	margin-top: 3em;
}

.sectionHeader h3 {
	text-align: center;
	margin: 0 auto;
	line-height: 30px;
}

.contBody {
	width: 100%;
	margin-top: 20px;
}

.btnn{
	margin-left : auto ;
	margin-right : 0 ;
	}

.buttonBox {
	width: 100%;
}

.btnn {
   float: right;
	width: 193px;
	margin: 0 auto;
	margin-top: 5em;
	z-index: 2;
	color: #fff;
	line-height: 50px;
	-webkit-perspective: 300px;
	perspective: 300px;
	-webkit-transform-style: preserve-3d;
	transform-style: preserve-3d;
}

.btn {
   float: right;
	width: 193px;
	margin: 0 auto;
	margin-top: 4em;
	z-index: 2;
	color: #fff;
	line-height: 50px;
	-webkit-perspective: 300px;
	perspective: 300px;
	-webkit-transform-style: preserve-3d;
	transform-style: preserve-3d;
}

.btnn a,.btn a{
	color: #808080;
	font-family: 'Covered By Your Grace', cursive;
	font-size: 15px;
	line-height: 11px;
}

/*------*/
.button {
	position: relative;
	display: inline-block;
	padding: .65em 4em;
	border: 2px solid #e6e6e6;
	color: #333;
	text-decoration: none;
	text-align: center;
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
}

.button::after {
	position: absolute;
	top: 4px;
	left: 4px;
	z-index: -1;
	content: '';
	width: 102%;
	height: 102%;
	background-color: #ffe6ea;
	-webkit-transform: rotate(1deg);
	transform: rotate(1deg);
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
}

.button:hover {
	color: #b3b3b3;
}

.button:hover::after {
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	-webkit-transform: rotate(0);
	transform: rotate(0);
}

.table {
	width: 400px;
}

.table th {
	background: #ffe6ea;
	vertical-align: middle;
	text-align: left;
	width: 70px;
	overflow: visible;
	position: relative;
	color: #4d4545;
	font-weight: normal;
	font-size: 15px;
}


table{
    float: left;
	margin-left : 2em ;
	margin-right : auto ;

	}


table {
    margin-top: 1em;
	width: 500px;
	border-collapse: separate;
	border-spacing: 0px 9px;
	font-size: 12px;
	 padding-bottom:20px; 
}

table th, table td {
	padding: 10px;
	padding-left: 26px;
}

table th {
	background: #ffe6ea;
	vertical-align: middle;
	text-align: left;
	width: 100px;
	overflow: visible;
	position: relative;
	color: #4d4545;
	font-weight: normal;
	font-size: 15px;
}

table th:after {
	left: 100%;
	top: 50%;
	border: solid transparent;
	content: " ";
	height: 0;
	width: 0;
	position: absolute;
	pointer-events: none;
	border-color: rgba(255, 239, 204, 0);
	border-left-color: #ffe6ea;
	border-width: 10px;
	margin-top: -10px;
}

td {
	font-size: 13px;
	background: #f8f8f8;
	border-width: 0.3px;
}

td.change {
	text-align: right;
}

a {
	color: black;
}


a{
	text-decoration: none;
	color: #3F51B5;
}

footer{
	background: #F48FB1;
	clear: both;
	text-align: center;
	height: 100px;
	line-height: 100px;
	margin-top: 100px;
	color: #fff;
}

</style>
	
	

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
									<td class="change">
										<!-- <a href="アクション"></> -->
									</td>
								</tr>

								<tr>
									<th>氏名</th>
									<td><p>
											<s:property value="familyName" />
											<s:property value="firstName" />
										</p></td>
									<td class="change">
										<!-- <a href="アクション"></> -->
									</td>
								</tr>

								<tr>
									<th>性別</th>
									<td><p>
											<s:if test="sex==0">男性</s:if>
											<s:else>女性</s:else>
										</p></td>
									<td class="change">
										<!-- <a href="アクション"></> -->
									</td>
								</tr>

								<tr>
									<th>メールアドレス</th>
									<td><s:property value="email" /></td>
									<td class="change">
										<!-- <a href="アクション"></> -->
									</td>
								</tr>

								<tr>
									<th>ID</th>
									<td><p>
											<s:property value="userId" />
										</p></td>
									<td class="change">
										<!-- <a href="アクション"></> -->
									</td>
								</tr>

								<tr>
									<th>password</th>
									<td><p>
											<s:property value="password" />
										</p></td>
									<td class="change"></td>
								</tr>
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
							<a href="/knit/ResetPasswordAction" class="button">変更</a>
						</div>
					</div>				
				
				</div>


			</div>
		</div>
	</div>





	<!-- フッター -->
	
	<div class="header"></div>
	


</body>
</html>
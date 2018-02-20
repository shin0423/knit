<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<link rel="stylesheet"
		  type="text/css"
		  href="${pageContext.request.contextPath}/css/purchaseCancelComplete_style.css">

	<title>購入キャンセル完了画面</title>

	<style type="text/css">
	</style>

</head>
<body>

	<div id="header">
	<jsp:include page="headerInclude.jsp"/>
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>CancelComplete</p>
		</div>

<div class="clear"></div>

		<div>



			<div  id="textcm01">
			<h1>購入キャンセル手続きが完了致しました。</h1>
			</div>
			<div class = "guide" id="textcm02">
			<div class="buttonBox">
						<div class="btn">
					<a href='<s:url action="GoPurchaseHistoryAction" />'
					   class="button">購入履歴へもどる</a>
				</div>
				</div>
				</div>
		</div>
	</div>
	<div id="footer">
	<jsp:include page="footerInclude.jsp"/>
	<div id="pr">
	</div>
	</div>

</body>
</html>
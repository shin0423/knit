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

	<title>決済完了画面</title>

	<style type="text/css">

</style>

</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>PurchaseComplete</p>
</div>

<div>
<p>購入手続きが完了致しました。</p>
<div>
<a href='<s:url action="MyPageAction" />'>
マイページ</a><span>から購入履歴の確認が可能です。</span>
<p>Homeへ戻る場合は<a href='<s:url action="記入" />'>
こちら</a></p>
</div>
</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>

</body>
</html>

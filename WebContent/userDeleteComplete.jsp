<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="refresh" content="5;URL='TopAction'" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="text/javascript"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="./css/userDelete.css">
<meta charset="UTF-8">

<title>退会完了画面</title>
</head>
<body>
	<header>
	<jsp:include page="headerInclude.jsp"/>
	</header>
	<div id="main">
	<br>
		<div id ="title"><p>退会しました</p>
		</div>
	<div id="button">
	<div>5秒後にホーム画面に遷移します</div>
	すぐに遷移する場合はこちら
	<button type="button" onclick="location.href='/knit/TopAction'">ホーム</button>
	</div>
	<!-- <a href="<s:url action='TopAction' />">ホーム</a> -->

	</div>

</body>
</html>
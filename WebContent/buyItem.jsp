<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>
	<s:iterator value="session.buyItemAfterSearchList">
		<s:property value="itemName"/>
		<s:property value="itemDescription" />
		<s:property value="price" />
		<s:property value="itemStock" />
		<s:property value="releaseCompany" />
		<s:property value="releaseDate" />
	</s:iterator>
</body>
</html>
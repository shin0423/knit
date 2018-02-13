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
	<table>
	<s:iterator value="buyItemAfterSearchList">
		<img src="<s:property value='itemImagePath' />">
		<s:property value="itemName"/>
		<s:property value="itemDescription" />
		<s:property value="price" />
		<s:property value="itemStock" />
		<s:property value="releaseCompany" />
		<s:property value="releaseDate" />
		<s:form action="BuyItemInfoAction" >
			<s:hidden value="%{itemId}" name="itemId" />
			<s:submit value="商品詳細" />
		</s:form>
	</s:iterator>
</body>
</html>
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
	<table border="1">
	<s:iterator value="buyItemAfterSearchList">
		<tr>
			<td><img src="<s:property value='itemImagePath' />"></td>
		</tr>
		<tr>
			<td><s:property value="itemName"/></td>
		</tr>
		<tr>
			<td><s:property value="itemDescription" /></td>
		</tr>
		<tr>
			<td><s:property value="price" /></td>
		</tr>
		<tr>
			<td><s:property value="itemStock" /></td>
		</tr>
		<tr>
			<td><s:property value="releaseCompany" /></td>
		</tr>
		<tr>
			<td><s:property value="releaseDate" /></td>
		</tr>
		<tr>
		<td>
		<s:form action="BuyItemInfoAction" theme="simple" >
			<s:hidden value="%{itemId}" name="itemId" />
			<s:submit value="商品詳細" />
		</s:form>
		</td>
		</tr>
	</s:iterator>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="/knit/css/buyItem.css" />
<title>商品一覧</title>

</head>
<body>
	<div class="fontTest">
	knitaaaaa
	</div>
	<div class="main">

	<s:iterator value="buyItemAfterSearchList" status="st">
	<s:if test="#st.count % 3 == 1" >
	<table class="itemBoxFirst">
		<tr>
			<td><img src="<s:property value='itemImagePath' />" class="itemImg"></td>
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
	</table>
	</s:if>
	<s:else>
	<table class="itemBox">
		<tr>
			<td><img src="<s:property value='itemImagePath' />" class="itemImg"></td>
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
	</table>
	</s:else>
	</s:iterator>
	</div>

</body>
</html>
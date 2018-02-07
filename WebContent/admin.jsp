<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:iterator value="buyItemList">

		<s:property value="itemId" />
		<s:property value="itemName" />
		<s:property value="itemNameKana" />
		<s:property value="itemDescription" />
		<s:property value="itemStock" />
		<s:property value="categoryId" />
		<s:property value="releaseCompany" />
		<s:property value="releaseDate" />

		<s:form action="AdminDeleteAction" >
			<s:hidden name="itemId" value="<s:property value='itemId' />"/>
 			<s:submit value="削除" />
		</s:form>
		<s:form action="AdminInsertItemAction">
			<s:textfield name="itemId" value="" />
			<s:textfield name="itemName" value="" />
			<s:textfield name="itemNameKana" value="" />
			<s:textarea  name="itemDescription" rows="4" cols="40" value=""/>
			<s:textfield name="categoryId" value="" />
			<s:textfield name="releaseCompany" value="" />
			<s:submit value="登録" />
		</s:form>

		<s:form action="AdminInsertCountAction">
			<s:textfield name="insertItemStock" />
			<s:hidden name="itemId" value="<s:property value='itemId' />"/>
			<s:hidden name="itemStock" value="<s:property value=''/>"/>
		</s:form>
		<s:form action="AdminLogoutAction">
			<s:submit value="ログアウト" />
		</s:form>


	</s:iterator>
</body>
</html>
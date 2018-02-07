<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin.jsp</title>
</head>
<body>
	<s:iterator value="session.buyItemList">

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


		<s:form action="AdminInsertCountAction">
			<s:textfield name="insertItemStock" />
			<s:hidden name="itemId" value="%{itemId}"/>
			<s:hidden name="itemStock" value="%{itemStock}"/>
			<s:submit value="追加" />
		</s:form>
	</s:iterator>
		<s:form action="AdminInsertItemAction">
			id<s:textfield name="itemId" value="" />
			name<s:textfield name="itemName" value="" />
			kana<s:textfield name="itemNameKana" value="" />
			stock<s:textfield name="itemStock" value="" />
			description<s:textarea  name="itemDescription" rows="4" cols="40" value=""/>
			category<s:textfield name="categoryId" value="" />
			company<s:textfield name="releaseCompany" value="" />
			<s:submit value="登録" />
		</s:form>

	<s:form action="AdminLogoutAction">
			<s:submit value="ログアウト" />
	</s:form>

	<s:if test="!errorList.size()==0">
		<s:iterator value="errorList">

		</s:iterator>
	</s:if>

	<s:if test="!errorMessage==null">
		<s:property value="errorMessage" />
	</s:if>
</body>
</html>
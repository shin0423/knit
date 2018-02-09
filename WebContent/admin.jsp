<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content="">
<meta name="keywords" content="">

<title>管理者画面</title>
</head>
<body>
	<s:iterator value="session.buyItemList">

		<s:property value="itemId" />
		<s:property value="itemName" />
		<s:property value="itemNameKana" />
		<s:property value="itemDescription" />
		<s:property value="itemStock" />
		<s:property value="categoryId" />
		<s:property value="price" />
		<s:property value="releaseCompany" />
		<s:property value="releaseDate" />

		<s:form action="AdminDeleteAction" >
			<s:hidden name="itemId" value="%{itemId}"/>
 			<s:submit value="削除" />
		</s:form>


		<s:form action="AdminInsertCountAction">
			<s:textfield name="insertItemStock" value=""/>
			<s:hidden name="itemId" value="%{itemId}"/>
			<s:hidden name="itemStock" value="%{itemStock}"/>
			<s:submit value="追加" />
		</s:form>
	</s:iterator>
		<s:form action="AdminInsertItemAction">
			商品ID:<s:textfield name="itemId" value="" />
			商品名:<s:textfield name="itemName" value="" />
			商品名ふりがな:<s:textfield name="itemNameKana" value="" />
			在庫数:<s:textfield name="itemStock" value="" />
			商品詳細:<s:textarea  name="itemDescription" rows="4" cols="40" value=""/>
			商品カテゴリー:<select name="categoryId">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
			価格:<s:textfield name="price" value="" />
			商品販売会社名:<s:textfield name="releaseCompany" value="" />
			<s:submit value="登録" />
		</s:form>

	<s:form action="AdminLogoutAction">
			<s:submit value="ログアウト" />
	</s:form>

	<s:if test="errorList!= null">
		<s:iterator value="errorList">
			<s:property/><br>
		</s:iterator>
	</s:if>

	<s:if test="errorMessage != null">
		<s:property value="errorMessage" />
	</s:if>
</body>
</html>
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

<style>
	#header{
		width:100%;
		height:50px;
		background-color:black;
		}

	#pageName{
		text-aligin:right;
		color:red;
		}

	#logout{
		text-aligin:left;
		}

	#footer{
		width:100%;
		height:50px;
		background-color:black;
		}

</style>
</head>
<body>
	<div id="header">
		<div id="pageName">管理者画面</div>

		<div id="logout">
			<s:form action="AdminLogoutAction">
				<s:submit value="ログアウト" />
			</s:form>
		</div>
	</div>


	<s:if test="errorList!= null">
		<s:iterator value="errorList">
			<s:property/><br>
		</s:iterator>
	</s:if>

	<s:if test="errorMessage != null">
		<s:property value="errorMessage" />
	</s:if>

	<s:iterator value="session.buyItemList">
		<table>
			<tr>
				<th>商品ID:</th>
				<td><s:property value="itemId" /></td>
			</tr>
			<tr>
				<th>商品名:</th>
				<td><s:property value="itemName" /></td>
			</tr>
			<tr>
				<th>商品名かな:</th>
				<td><s:property value="itemNameKana" /></td>
			</tr>
			<tr>
				<th>商品詳細:</th>
				<td><s:property value="itemDescription" /></td>
			</tr>
			<tr>
				<th>商品在庫:</th>
				<td><s:property value="itemStock" /></td>
			</tr>
			<tr>
				<th>カテゴリーID:</th>
				<td><s:property value="categoryId" /></td>
			</tr>
			<tr>
				<th>値段:</th>
				<td><s:property value="price" /></td>
			</tr>
			<tr>
				<th>販売会社:</th>
				<td><s:property value="releaseCompany" /></td>
			</tr>
			<tr>
				<th>販売日:</th>
				<td><s:property value="releaseDate" /></td>
			</tr>
			<tr>
				<th>商品の在庫追加</th>
				<td><s:form action="AdminInsertCountAction" theme="simple">
					<s:textfield name="insertItemStock" value=""/>
					<s:hidden name="itemId" value="%{itemId}"/>
					<s:hidden name="itemStock" value="%{itemStock}"/>
					<s:submit value="追加" />
				</s:form></td>
			</tr>
			<tr>
				<th>商品情報の削除</th>
				<td><s:form action="AdminDeleteAction" >
					<s:hidden name="itemId" value="%{itemId}"/>
 					<s:submit value="削除" />
				</s:form></td>
			</tr>
		</table>
		<br>
		---------------------------------------------------------
	</s:iterator>


		<s:form action="AdminInsertItemAction" theme="simple">
			商品ID:<s:textfield name="itemId" value="" /><br>
			商品名:<s:textfield name="itemName" value="" /><br>
			商品名ふりがな:<s:textfield name="itemNameKana" value="" /><br>
			在庫数:<s:textfield name="itemStock" value="" /><br>
			商品詳細:<s:textarea  name="itemDescription" rows="4" cols="40" value=""/><br>
			商品カテゴリー:<select name="categoryId">
			<s:iterator value="categoryList" status="st">
				<option value="%{#st.count}"><s:property value="categoryName" /></option>
			</s:iterator>
			</select><br>
			価格:<s:textfield name="price" value="" /><br>
			商品販売会社名:<s:textfield name="releaseCompany" value="" /><br>
			<s:submit value="登録" />
		</s:form>

		<s:form action="CategoryInsertAction">
			カテゴリ名:<s:textfield name="categoryName"/>
			<s:submit value="新規登録" />
		</s:form>

	<div id="footer">
	</div>

</body>
</html>
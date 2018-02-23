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
<script src="//ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<meta name="description" content="">
<meta name="keywords" content="">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin.css">
<script>
$(window).on('beforeunload', function(e) {
    return 'ちょっと待ってくださいよ。まだダメですよ。';
});

</script>
<title>管理者画面</title>
</head>
<body>
	     <div id="header">
				<div id="logo"><h2>管理者画面</h2></div>

				<a href="/knit/AdminLogoutAction" class="button">logout</a>

          </div>
    <div id="main">
	<div id="error">
	<s:if test="errorList!= null">
		<s:iterator value="errorList">
			<s:property/>
		</s:iterator>
	</s:if>

	<s:if test="errorMessage != null">
		<s:property value="errorMessage" />
	</s:if>
	</div>
	<div id="left">
	<h2>商品の在庫追加、情報の削除</h2>
	<s:iterator value="session.buyItemList">
		<div id="item">
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

					<s:hidden name="token" value="%{token}"/>
				</s:form></td>
			</tr>
			<tr>
				<th>商品情報の削除</th>
				<td><s:form action="AdminDeleteAction" >
					<s:hidden name="itemId" value="%{itemId}"/>
 					<s:submit value="削除" />

 					<s:hidden name="token" value="%{token}"/>
				</s:form></td>
			</tr>
		</table>
	</div>
	</s:iterator>
	</div>

		<div id="right">
			<div id="insert">
			<h2>商品の登録</h2>
		<s:form action="AdminInsertItemAction" theme="simple">
			<table>
			<tr>
			<th>商品ID:</th>
			<td><s:textfield name="itemId" value="" /></td>
			</tr>
			<tr>
			<th>商品名:</th>
			<td><s:textfield name="itemName" value="" /></td>
			</tr>
			<tr>
			<th>商品名ふりがな:</th>
			<td><s:textfield name="itemNameKana" value="" /></td>
			</tr>
			<tr>
			<th>在庫数:</th>
			<td><s:textfield name="itemStock" value="" /></td>
			</tr>
			<tr>
			<th>商品詳細:</th>
			<td><s:textarea  name="itemDescription" rows="2" cols="40" value=""/></td>
			</tr>
			<tr>
			<th>商品カテゴリー:</th>
			<td><select name="categoryId">
			<s:iterator value="categoryList" status="st">
				<option value="<s:property value='#st.count'/>"><s:property value="categoryName" /></option>
			</s:iterator>
			</select></td>
			</tr>
			<tr>
			<th>価格:</th>
			<td><s:textfield name="price" value="" /></td>
			</tr>
			<tr>
			<th>商品販売会社名:</th>
			<td>
				<s:textfield name="releaseCompany" value="" />
				<s:hidden name="token" value="%{token}"/>
			</td>
			</tr>
			<tr>
			<td><s:submit value="登録" /></td>
			</tr>
			</table>
		</s:form>
		</div>

		<s:form action="AdminInsertCategoryAction" theme="simple">
		<h2>カテゴリーの追加、削除</h2>
		<div id="category_i">
			<table>
			<tr>
			<th>カテゴリーID:</th>
			<td><s:textfield name="categoryId" value=""/></td>
			</tr>
			<tr>
			<th>カテゴリー名:</th>
			<td><s:textfield name="categoryName" value=""/></td>
			</tr>
			<tr>
			<th>カテゴリー詳細:</th>
			<td><s:textfield name="categoryDescription" value=""/></td>
			</tr>
			<tr>
			<td>
				<s:hidden name="token" value="%{token}"/>
				<s:submit value="新規登録" />
			</td>
			</tr>
			</table>
		</div>
		</s:form>
		<s:form action="AdminDeleteCategoryAction" theme="simple">
		<div id="category_d">
			<h4>カテゴリー削除</h4><select name="categoryId">
			<s:iterator value="categoryList" status="st">
				<option value="<s:property value='#st.count'/>"><s:property value="categoryName" /></option>
			</s:iterator>
			<s:hidden name="token" value="%{token}"/>
			<s:submit value="削除"/>
			</select>
		</div>
		</s:form>
		</div>

		</div>
		<jsp:include page="footerInclude.jsp"/>

</body>
</html>
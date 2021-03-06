<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="css/buyItem.css" />
<title>商品一覧</title>

</head>
<body>


<jsp:include page="headerInclude.jsp"/>
<div class="sideBar">
カート内商品<br>
<div id="mini">*6件まで表示</div>
<s:if test="! #session.miniCartList.isEmpty()">
	<s:iterator value="#session.miniCartList">
		<div class="sideBox">
			<table>
				<tr>
			       	<td><s:property value="itemName" /><br></td>
			        <td><s:property value="price" />円<br><td>
			        <td><s:property value="itemCount" />個<br><td>
			        <td><br></td>
				</tr>
			</table>
		</div>
	</s:iterator>
	<br><br><br>
	合計金額<br>
	<s:property value="#session.allTotalPrice"/>円
</s:if>
<s:else>
	<div class="sideBox">
		カートに商品がありません
	</div>
</s:else>

</div>

	<div class="main">
	<br><br>

<s:if test="buyItemAfterSearchList.isEmpty()">
		<h1 align ="center">検索結果がありません。</h1>
	</s:if>

	<s:iterator value="buyItemAfterSearchList" status="st">
	<s:if test="#st.count % 3 == 1" >
	<table class="itemBoxFirst">
		<tr>
			<td><img src="<s:property value='itemImagePath' />" class="itemImg"></td>
		</tr>
		<tr>
			<td> <div class="mais"><s:property value="itemName"/></div> </td>
		</tr>


		<tr>
			<td><s:property value="price" />円</td>
		</tr>
		<s:if test="itemStock == 0">
		<tr class=stockZero>
			<td>在庫切れ</td>
		</tr>
		</s:if>
		<s:else>
		<tr>
			<td><div class="mais"><s:property value="itemStock" />個</div></td>
		</tr>
		</s:else>
		<tr>
			<td><s:property value="releaseCompany" /></td>
		</tr>
		<tr>
			<td><s:property value="releaseDate" /></td>
		</tr>
		<tr>
		<td>
		<div class="buttonBox">
						<div class="btnn">
							<a href='<s:url action="BuyItemInfoAction"><s:param name="itemId" value="%{itemId}" /></s:url>' class="button">商品詳細</a>
						</div>
					</div>
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
			<td> <div class="mais"><s:property value="itemName"/></div> </td>
		</tr>

		<tr>
			<td><s:property value="price" />円</td>
		</tr>

		<s:if test="itemStock == 0">
		<tr class=stockZero>
			<td>在庫切れ</td>
		</tr>
		</s:if>
		<s:else>
		<tr>
			<td><div class="mais"><s:property value="itemStock" />個</div></td>
		</tr>
		</s:else>
		<tr>
			<td><s:property value="releaseCompany" /></td>
		</tr>
		<tr>
			<td><s:property value="releaseDate" /></td>
		</tr>
		<tr>
		<td>

		<div class="buttonBox">
						<div class="btn">
							<a href='<s:url action="BuyItemInfoAction"><s:param name="itemId" value="%{itemId}" /></s:url>' class="button">商品詳細</a>
						</div>
					</div>
		</td>
		</tr>
	</table>
	</s:else>
	</s:iterator>
	</div>
<jsp:include page="footerInclude.jsp"/>


</body>
</html>
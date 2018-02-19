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
<jsp:include page="headerInclude.jsp"/>
	<div class="main">

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
			<td><s:property value="itemDescription" /></td>
		</tr>
		<tr>
			<td><s:property value="price" />円</td>
		</tr>
		<tr>
		<s:if test="itemStock <= 0">
			<td><div>在庫切れ<br>&nbsp;&#010;</div></td>
		</s:if>
		<s:else>
			<td><div class="mais"><s:property value="itemStock" />個</div></td>
		</s:else>
		</tr>
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
			<td><s:property value="itemDescription" /></td>
		</tr>
		<tr>
			<td><s:property value="price" />円</td>
		</tr>
		<tr>
		<s:if test="itemStock == '0'">
			<td>在庫切れ</td>
		</s:if>
		<s:else>
			<td><div class="mais"><s:property value="itemStock" />個</div></td>
		</s:else>
		</tr>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./css/buyItemInfo.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<title>商品詳細ページ</title>
</head>
<body>
<jsp:include page="headerInclude.jsp" />
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




 <%-- </s:else> --%>


<s:iterator value="buyItemDTO">
<img id="imageItem" src="<s:property value='itemImagePath' />" alt="画像なし">
</s:iterator>
<table class="itemInfoBox">
	<s:iterator value="buyItemDTO">

		<tr>
			<td><s:property value="itemName" /></td>
		</tr>
		<tr>
			<td id="itemDescription"><s:property value="itemDescription" /></td>
		</tr>
		<tr>
			<td><s:property value="price" />円</td>
		</tr>
		<tr>
		<s:if test="itemStock <= 0">

		</s:if>
		<s:else>
			<td>在庫&nbsp;&nbsp;<s:property value="itemStock" />個</td>
		</s:else>
		</tr>
		<tr>
			<td><s:property value="releaseCompany" /></td>
		</tr>
		<tr>
			<td>販売日&nbsp;&nbsp;<s:property value="releaseDate" /></td>
		</tr>

		<s:form action="PutItemIntoCartAction" >
			<s:hidden name="itemId" value="%{itemId}" />
			<s:hidden name="price" value="%{price}"/>

			   <s:hidden name="token" value="%{token}" />

			<tr>
			<td>
				<s:if test="itemStock <= 5 && itemStock >= 1">
				<select name="itemCount" >
				<s:iterator value="optionNumber">
					<option value="<s:property /> "><s:property /></option>
				</s:iterator>
				</select>
				</s:if>

				<s:if test="itemStock >= 6">
				<select name="itemCount" >
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				</s:if>
			</td>
			</tr>
			<tr>
				<td>
					<s:if test="itemStock <= 0">
	在庫切れ
					</s:if>
					<s:else>

					<s:a href="javascrrpt:void(0)"
											onclick="document.PutItemIntoCartAction.submit();return false;"
											class="button">カートに入れる</s:a>
					</s:else>
				</td>
			</tr>
		</s:form>
	</s:iterator>
</table>
<p class="border">&nbsp;</p>
	<s:form action="ReviewAction">
		<s:iterator value="buyItemDTO">
			<div class="reviewForm" >
			<table>
			<tr>
				<td>レビュー入力欄</td>
			</tr>
			<tr>
				<td>
					<select name="review" >
						<option value="1">★</option>
						<option value="2">★★</option>
						<option value="3">★★★</option>
						<option value="4">★★★★</option>
						<option value="5">★★★★★</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><s:textarea cols="20" rows="5" name="reviewBody" value=""/></td>
			</tr>
			<tr>
				<s:hidden name="itemId" value="%{itemId}" />
				<td><s:a href="javascrrpt:void(0)"
											onclick="document.ReviewAction.submit();return false;"
											class="butto"><strong>レビューする</strong></s:a></td>
			</tr>

			</table>
			</div>
		</s:iterator>
	</s:form>
	<p class="reviewBorder">&nbsp;</p>

			<s:if test="reviewErrorMessage != null">
			<div id="errorMessage">
			<s:iterator value="reviewErrorMessage">
				※<s:property />

		</s:iterator>
		</div>
		</s:if>


	<br>

	<s:if test=" #session.userId != null ">
		<div class="deleteReview">
		<br>自分のレビューを消す<br>

			<s:form action="ReviewDeleteAction">
				<s:hidden name="itemId" value="%{itemId}" />
				<s:a href="javascrrpt:void(0)"
											onclick="document.ReviewDeleteAction.submit();return false;"
											class="butto">削除</s:a>
			</s:form>
		</div>
	</s:if>

	<div class="review">
	<br>レビュー<br>
	<s:iterator value="reviewList">
		名前:<s:property value="firstName"/>&nbsp;&nbsp;追加日時:<s:property value="insertDate" /><br>
		評価:<s:property value="reviewStar" /><br>
		レビュー内容:<s:property value="reviewBody" /><br><br>
	</s:iterator>
	</div>

<div class="categoryItem">
	<s:iterator value="categoryItemList">

	<table>
	<tr>
		<td>
		<div >
				<a href="<s:url action="BuyItemInfoAction"><s:param name="itemId" value="%{itemId}"/></s:url>">
					<img src='<s:property value="itemImagePath"/>' class="itemImageUrl" >
				</a>
		</div>
		</td>
	</tr>
	<tr>
		<td>
			<s:property value="itemName"/>


		</td>
	</tr>
	</table>

	</s:iterator>
</div>
</div>

<jsp:include page="footerInclude.jsp"/>
</body>
</html>
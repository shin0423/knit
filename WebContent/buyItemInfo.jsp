<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品詳細ページ</title>
</head>
<body>
<table>
	<s:iterator value="buyItemDTO">
		<tr>
			<td><img src="<s:property value='itemImagePath' />" alt="画像なし"></td>
		</tr>
		<tr>
			<td><s:property value="itemName" /></td>
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

		<s:form action="PutItemIntoCartAction" >
			<s:hidden name="itemId" value="%{itemId}" />
			<s:hidden name="price" value="%{price}"/>
			<tr>
			<td>
				<select name="itemCount" >
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</td>
			</tr>
			<tr>
				<td><s:submit value="カートに入れる" /></td>
			</tr>
		</s:form>
	</s:iterator>
</table>
	<s:form action="ReviewAction">
		<s:iterator value="buyItemDTO">
			<table border="1">
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
				<td><s:textfield name="reviewBody" value=""/></td>
			</tr>
			<tr>
				<s:hidden name="itemId" value="%{itemId}" />
				<td><s:submit value="送信" /></td>
			</tr>
			</table>
		</s:iterator>
	</s:form>

			<s:if test="reviewErrorMessage != null">
			<s:iterator value="reviewErrorMessage">
				<s:property />

		</s:iterator>
		</s:if>

	<br>
	<s:if test=" #session.userId != null ">
	<br>自分のレビューを消す<br>
	<s:form action="ReviewDeleteAction">
		<s:hidden name="itemId" value="%{itemId}" />
		<s:submit value="確認" />
	</s:form>
	</s:if>

	<br>レビュー<br>
	<s:iterator value="reviewList">
		名前:<s:property value="firstName"/>&nbsp;&nbsp;追加日時:<s:property value="insertDate" /><br>
		評価:<s:property value="reviewStar" /><br>
		レビュー内容:<s:property value="reviewBody" /><br><br>
	</s:iterator>
	<br>

	ホームに戻る方は<a href="<s:url action='TopAction' />" >こちら</a>
</body>
</html>
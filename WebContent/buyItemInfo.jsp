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
	<s:iterator value="buyItemDTO">
		<img src="<s:property value='itemImagePath' />" alt="画像なし">
		<s:property value="itemName" />
		<s:property value="itemDescription" />
		<s:property value="price" />
		<s:property value="itemStock" />
		<s:property value="releaseCompany" />
		<s:property value="releaseDate" />
		<s:form action="PutItemIntoCartAction" >
			<s:hidden name="itemId" value="%{itemId}" />
			<s:hidden name="price" value="%{price}"/>
			<select name="itemCount" >
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
			<s:submit value="カートに入れる" />
		</s:form>
	</s:iterator>

	<s:form action="ReviewAction">
	<s:iterator value="buyItemDTO">
		<select name="review" >
			<option value="1">★</option>
			<option value="2">★★</option>
			<option value="3">★★★</option>
			<option value="4">★★★★</option>
			<option value="5">★★★★★</option>
		</select>
		<s:textfield name="reviewBody" value=""/>
		<s:hidden name="itemId" value="%{itemId}" />
		<s:submit value="送信" />
		</s:iterator>
	</s:form>

		<s:if test="reviewErrorMessage != null">
		<s:iterator value="reviewErrorMessage">
			<s:property />
		</s:iterator>
		</s:if>
	
	自分のレビューを消す<br>
	<s:form action="ReviewDeleteAction">
		<s:submit value="確認" />
	</s:form>
	
	<br>レビュー<br>
	<s:iterator value="reviewList">
		名前:<s:property value="firstName"/>&nbsp;&nbsp;追加日時:<s:property value="insertDate" /><br>
		評価:<s:property value="reviewStar" /><br>
		レビュー内容:<s:property value="reviewBody" /><br><br>
	</s:iterator>
</body>
</html>
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
		<s:form action="CartAction" >
			<s:hidden name="itemId" value="<s:property value='itemId' />" />
			<s:hidden name="price" value="<s:property value='price' />"/>
			<s:hidden name="itemStock" value="<s:property value='itemStock' />" />
			<s:submit value="カートに入れる" />
		</s:form>
	</s:iterator>

	<s:form action="ReviewAction">
		<select name="review" >
			<option value="1">★</option>
			<option value="2">★★</option>
			<option value="3">★★★</option>
			<option value="4">★★★★</option>
			<option value="5">★★★★★</option>
		</select>
		<s:textfield name="reviewBody" value=""/>
		<s:submit value="送信" />
	</s:form>
	レビュー
	<s:iterator value="reviewList">
		<s:property value="firstName"/>
		<s:property value="review" />
		<s:property value="reviewBody" />
		<s:property value="insertDate" />
	</s:iterator>
</body>
</html>
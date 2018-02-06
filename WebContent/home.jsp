<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>home.jsp</title>
</head>
<body>
<h1>商品一覧</h1>
<s:iterator value="#session.buyItemList">




<p><input type="image" src="<s:property value='itemImagePath' />" alt="画像なし"width="100" height="100" ></p>
<s:property value="itemName"/>
<s:property value="price"/>円



</s:iterator>
</body>
</html>
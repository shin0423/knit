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
<s:iterator value="#buyItemList">

<img src='<s:property value="itemImagePath"/>' alt="画像なし"/>
<s:property value="itemName"/>
<s:property value="price"/>



</s:iterator>
</body>
</html>
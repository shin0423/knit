<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート画面</title>
</head>
<body>
<header>
</header>

<div class="main">

	<h2 class="title">CART</h2><br>

		<s:property value="errMsg"/>
		<!-- カートの中身が何も入って居ないとき -->
			<s:if test="cartList.isEmpty()">
				<p class="message">商品は入っておりません。</p>
			</s:if>

		<!-- カートに中身が入っているとき -->
			<s:else>
				<p class="message">カートには以下の商品が入っています。</p>
			</s:else>

<!------------------------ カート内容 ------------------------>
			<s:form action="CartAction">
				<s:iterator value="cartList">

			<div class="border">
			</div>
				</s:iterator>
			</s:form>

</body>
</html>
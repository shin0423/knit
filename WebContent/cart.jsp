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
			<div class="pro_img">
				<img src='<s:property value="image_file_path"/>' alt="画像なし"/>
			</div>

			<div class="kana">
				<s:property value="item_name_kana"/>
			</div>

			<div class="pro_name">
				商品名:<s:property value="item_name"/>
			</div>

			<div class="price">
				価格:<s:property value="price"/><span>円</span>
			</div>

			<div class="count">
				購入個数:<s:property value="itemCount"/><span>個</span>
			</div>

			<div class="company">
				発売会社:<s:property value="release_company"/>
			</div>

			<div class="release_date">
				発売日:<s:property value="release_date"/>
			</div>


<!----------------------- 商品削除 ------------------------->
			<div class="delete">
				<s:form action="CartDeleteAction">
					<a href='<s:url action="CartDeleteAction"><s:param name="itemId" value="itemId"></s:param></s:url>'>削除</a>
				</s:form>
			</div>

			</s:iterator>
			</s:form>

<!------------------------ 合計金額 ------------------------->
			<div class="totalPrice">
				合計金額:<s:property value="total_price"/><span>円</span>
			</div>


<!------------------------ 決済画面に移動---------------------->
			<s:if test="! cartList.isEmpty()">
				<div class="settlement_btn">
					<a href='<s:url action="SettlementConfirmAction"/>'>決済画面へ</a>
				</div>
			</s:if>

</div>
</body>
</html>
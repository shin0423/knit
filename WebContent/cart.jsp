<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート画面</title>

<script type="text/javascript">
    function goCartDeleteAction(){
        document.getElementById('form').action="CartDeleteAction";
    }
</script>

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
			<s:form action="CartAction" id="form" name="form">
				<s:iterator value="cartList">

			<s:hidden name="itemId" value="%{itemId}"/>
			<s:checkbox name="checkList" value="checked" fieldValue="%{itemId}" />
			<div class="border">
			</div>
			<div class="pro_img">
				<img src='<s:property value="imageFilePath"/>' alt="画像なし" width="100px" height="100px" />
				<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
			</div>

			<div class="kana">
				<s:property value="itemNameKana"/>
				<s:hidden name="itemNameKana" value="%{itemNameKana}"/>
			</div>

			<div class="pro_name">
				商品名:<s:property value="itemName"/>
				<s:hidden name="itemName" value="%{itemName}"/>

			</div>

			<div class="price">
				価格:<s:property value="price"/><span>円</span>
				<s:hidden name="price" value="%{price}"/>

			</div>

			<div class="count">
				購入個数:<s:property value="itemCount"/><span>個</span>
				<s:hidden name="itemCount" value="%{itemCount}"/>

			</div>

			<div class="company">
				発売会社:<s:property value="releaseCompany"/>
				<s:hidden name="releaseCompany" value="%{releaseCompany}"/>

			</div>

			<div class="release_date">
				発売日:<s:property value="releaseDate"/>
				<s:hidden name="releaseDate" value="%{releaseDate}"/>

			</div>

			</s:iterator>

<!----------------------- 商品削除 ------------------------->
			<s:submit value="削除" onclick="goCartDeleteAction();"/>

			</s:form>

<!------------------------ 合計金額 ------------------------->
			<div class="totalPrice">
				合計金額:<s:property value="totalPrice"/><span>円</span>
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
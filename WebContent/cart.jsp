<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content="">
<meta name="keywords" content="">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cart.css">
<title>カート画面</title>

<script type="text/javascript">
    function goCartDeleteAction(){
        document.getElementById('form').action="CartDeleteAction";
    }
</script>

</head>
<body>
<header>
<jsp:include page="headerInclude.jsp"/>
</header>


<div class="main">

	<h1 class="title">CART</h1><br>

		<s:property value="errorMsg"/>
		<!-- カートの中身が何も入って居ないとき -->
			<s:if test="cartList.isEmpty()">
				<p class="message">商品は入っておりません。</p>
			</s:if>

		<!-- カートに中身が入っているとき -->
			<s:else>
				<p class="message">カートには以下の商品が入っています。</p>
			</s:else>


<!------------------------ カート内容 ------------------------>
			<s:form action="CartAction" id="form" name="form" theme="simple">
			<div id="box">
				<s:iterator value="cartList">
				<%-- <s:if test="price != 0"> --%>
				<div id="item">
			<s:hidden name="itemId" value="%{itemId}"/>
			<s:checkbox id="item_r" name="checkList" fieldValue="%{itemId}" />
			<div class="border">
			<div class="pro_img">
				<img src='<s:property value="imageFilePath"/>' alt="画像なし" width="100px" height="100px" />
				<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
			</div>
			</div>
		<table>
			<tr>
				<th>商品名かな:</th>
				<td><s:property value="itemNameKana"/></td>
			</tr>
				<s:hidden name="itemNameKana" value="%{itemNameKana}"/>


			<tr>
				<th>商品名:</th>
				<td><s:property value="itemName"/></td>
			</tr>
				<s:hidden name="itemName" value="%{itemName}"/>



			<tr>
				<th>価格:</th>
				<td><span id="color"><s:property value="price"/></span><span>円</span></td>
			</tr>
				<s:hidden name="price" value="%{price}"/>



			<tr>
				<th>購入個数:</th>
				<td><span id="color"><s:property value="itemCount"/></span><span>個</span></td>
			</tr>
				<s:hidden name="itemCount" value="%{itemCount}"/>



			<tr>
				<th>発売会社:</th>
				<td><s:property value="releaseCompany"/></td>
			</tr>
				<s:hidden name="releaseCompany" value="%{releaseCompany}"/>



			<tr>
				<th>発売日:</th>
				<td><s:property value="releaseDate"/></td>
			</tr>
				<s:hidden name="releaseDate" value="%{releaseDate}"/>


			</table>

			</div>
			<%-- </s:if> --%>
			</s:iterator>
			</div>

   <s:hidden name="token" value="%{token}" />
<!----------------------- 商品削除 ------------------------->
			<div class="delete">

			<s:submit  id="delete_b" value="削除" onclick="goCartDeleteAction();"/>
			</div>
			</s:form>

<!------------------------ 合計金額 ------------------------->
			<div class="totalPrice">
				合計金額:<span id="color"><s:property value="totalPrice"/></span><span>円</span>
			</div>


<!------------------------ 決済画面に移動---------------------->
			<s:if test="session.loginFlg == false">
				<s:form action ="GoLoginAction" theme ="simple">
					<div class="settlement_btn">
						<s:submit value="ログイン" id="set_c"/>
					</div>
				</s:form>
			</s:if>
			<s:else>
				<s:if test="! cartList.isEmpty()">
					<s:form action="SettlementConfirmAction" theme="simple">
					   <s:hidden name="token" value="%{token}" />
						<div class="settlement_btn">
							<s:submit id="set_b" value="決算画面へ" />
						</div>
					</s:form>
				</s:if>
			</s:else>


</div>
<jsp:include page="footerInclude.jsp"/>
</body>
</html>
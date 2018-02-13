<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>カート画面</title>

<script type="text/javascript">
    function goCartDeleteAction(){
        document.getElementById('form').action="CartDeleteAction";
    }

    function checkboxTest(){
    	o=document.createElement('input');
    	o.name="flg";
    	f = document.getElementByClassName("sample01");
    	alert(f);
    	if(f==0){
    	o.value=1;
    	}else{
    	o.value=0;
    	}
    	document.form.appendChild(o);

    }
</script>

</head>
<body>
<header>
	<ul>
		<li><a href='<s:url action="MyPageAction"/>'>マイページ</a></li>
		<li><a href='<s:url action="LoginAction"/>'>ログイン</a></li>
		<li><a href='<s:url action="CartAction"/>'>カート</a></li>
	</ul>
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
				<s:iterator value="cartList" status="st">

			<s:hidden name="itemId" value="%{itemId}"/>
			<td ><s:checkbox name="checkList" value="checked" fieldValue="%{id}" class="sample01" onclick="checkboxTest();"/></td>

			<td>
			<div class="pro_img">
				<img src='<s:property value="imageFilePath"/>' alt="画像なし" width="100px" height="100px" />
				<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
			</div>
			</td>
			<td>
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
			</td>
			</s:iterator>

<!----------------------- 商品削除 ------------------------->
		<div>
			<input type="hidden" name="deleteFlg" value="1"  class="sample02"/>
			<s:if test="flg==0">
			<s:submit id="delete02" value="削除"  onclick="goCartDeleteAction();"/>
			</s:if>
			<s:else>
			<s:submit id="delete02" value="削除" disabled="disabled"/>
			</s:else>
		</div>
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
<script type="text/javascript">
$(function() {
	  $('.sample02 ').attr('disabled', 'disabled');

	  $('.sample01').click(function() {
	    if ( $(this).prop('checked') == false ) {
	      $('.sample02').attr('disabled', 'disabled');
	    } else {
	      $('.sample02').removeAttr('disabled');
	    }
	  });
	});
</script>
<%-- <script type="text/javascript">
	$(function(){
		$('#check').on('change',function(){
			if($(this).is(':checked')){

				//チェックが入ったら、送信ボタンを押せる
				$('#delete02').prop('disabled',false);

			}else{

				//チェックが入っていなかったら、送信ボタンを押せない
				$('#delete02').prop('disabled',true);
			}
		});
	});

	</script> --%>
<!--
<script type="text/javascript">




$(function checkValue(check){
	//チェックボックスがクリックされると送信ボタンが有効
	$('#check').on('change',function(){
		if($('#check').is(':checked')){
			$('#delete02').prop('disabled',false);
		}else{
			$('#delete02').prop('disabled',true);
		}
	});
});

</script>
-->

</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>knit</title>
</head>
<body class="home">

<s:form action="BuyItemAction">
<select name="categoryId" class="">
				<option value=0 selected="selected">全てのカテゴリ</option>
				<option value=1 >飲食</option>
				<option value=2 >家電・パソコン</option>
				<option value=3 >おもちゃ・ゲーム</option>
				<option value=4 >おもちゃ・ゲーム</option>
			</select>

			<s:textfield name="searchWord" class="h_search" />
			<br>
			<s:textfield name="moreDown" class="h_search" />～
			<s:textfield name="moreUp" class="h_search" />

	<button type="submit">検索</button>

</s:form>

<div class="top_main clearfix">
<h1>商品一覧</h1>
<ul>
<s:iterator value="#session.buyItemList">

<li>
<s:url id ="url" action="BuyItemInfoAction">
<s:param name="itemId" value="%{itemId}"/>
</s:url>

<s:a href="%{url}">
<s:if test="categoryId == 1">
<span class="category orange">飲食</span>
</s:if>
<s:if test="categoryId == 2">
<span class="category blue">&nbsp;&nbsp;家電&amp;パソコン</span>
</s:if>
<s:if test="categoryId == 3">
aaaa
</s:if>
<s:if test="categoryId == 4">
おもちゃ
</s:if>

<div><input type="image" src="<s:property value='itemImagePath' />" alt="画像なし" ></div>
<p class="name"><s:property value="itemName"/></p>
<p class="price">\<span><s:property value="price"/>円</span></p>
</s:a>
</li>
</s:iterator>
</ul>
</div>

<script>
$(function() {

	for(var i = 0; i < $(".home .top_main ul li img").length; i++){
	var arra_w = $('.home .top_main ul li img').eq(i).width() - 14;

	var arra_h = $('.home .top_main ul li img').eq(i).height();
	if(arra_w < arra_h || arra_w == arra_h){
		$('.home .top_main ul li img').eq(i).css('max-height','245px');
	}else{
		$('.home .top_main ul li img').eq(i).css('max-width','288px');
	}
	};	//配列をまわす

});	//function
</script>

<a href='<s:url action="GoLoginPageAction"/>'>ログインへ</a>
<s:if test="#session.loginFlg == true">
<a href='<s:url action="MyPageAction"/>'>マイページへ</a>
</s:if>
<a href='<s:url action="CartAction"/>'>カートへ</a>
<a href='<s:url action="BuyItemAction"/>'>商品一覧へ</a>

</body>
</html>
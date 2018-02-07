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

<s:form action="">
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

</s:form>
<h1>商品一覧</h1>
<ul>
<s:iterator value="#session.buyItemList">
<s:param name="itemid" value="%{itemId}"/>
<li>
<s:url id ="url" action="BuyItemInfoAction">

</s:url>

<s:a href="%{url}">

<br>

<s:if test="categoryId == 1">
飲食
</s:if>
<s:if test="categoryId == 2">
aaaa
</s:if>
<s:if test="categoryId == 3">
aaaa
</s:if>
<s:if test="categoryId == 4">
おもちゃ
</s:if>

<p><input type="image" src="<s:property value='itemImagePath' />" alt="画像なし" ></p>
<s:property value="itemName"/>
\<s:property value="price"/>円
</s:a>


</li>
</s:iterator>
</ul>

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
</body>
</html>
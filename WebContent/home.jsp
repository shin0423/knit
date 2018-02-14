<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <link rel="stylesheet" href="./css/home.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<title>knit</title>
</head>
<body>
<div class="header">

  <a href='<s:url action="CartAction"/>'><button class="cart">カートへ</button></a>

<button class="search"><p>Q</p></button>
 <div class="inside">
  <div class="hide_box">
  <s:form action="BuyItemAction">
   <s:textfield name="searchWord" class="h_search" />
   <select name="categoryId" class="">
    <option value=0 selected="selected">全てのカテゴリ</option>
    <option value=1 >飲食</option>
    <option value=2 >家電・パソコン</option>
    <option value=3 >おもちゃ・ゲーム</option>
    <option value=4 >おもちゃ・ゲーム</option>
   </select>
   <br>
   <s:textfield name="moreUp" class="h_search" />～
   <s:textfield name="moreDown" class="h_search" />
   <button type="submit">検索</button>
  </s:form>
  </div>
 </div>
<script>
$(function(){
	$(".search").click(function(){
		$(".inside").stop().fadeToggle();
	});
});
</script>


  <a href="/knit/home.jsp" class="home">Home</a>

 <s:if test="#session.loginFlg == false">
  <a href='<s:url action="GoLoginPageAction"/>' class="user">ログインへ</a>
 </s:if>

  <s:elseif test="#session.loginFlg == true">
   <a href='<s:url action="MyPageAction"/>' class="user">マイページへ</a>
   <a href='<s:url action="UserLogoutAction"/>' class="user">ログアウト</a>
  </s:elseif>


  <a href='<s:url action="BuyItemAction"/>' class="item">商品一覧へ</a>
</div>




<div class="main">

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

 <s:form action="BuyItemAction">
  <s:hidden name="categoryId" value="0"/>
  <s:hidden name="searchWord" value="" />
  <s:hidden name="moreUp" value="" />
  <s:hidden name="moreDown" value="" />
  <s:submit value="全件表示" />
 </s:form>
</div>
</body>
</html>
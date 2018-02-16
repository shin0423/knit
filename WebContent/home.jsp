<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <link rel="stylesheet" href="./css/home.css">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/jquery.plainmodal.js"></script>

<title>knit</title>
</head>
<body>
<div class="header">

 <div class="menu">
  <a href='<s:url action="TopAction" />'><button class="home" style="cursor:pointer"></button></a>

  <a href='<s:url action="CartAction"/>'><button class="cart" style="cursor:pointer"></button></a>

<button class="search" style="cursor:pointer"></button>
 <div class="inside">
  <s:form action="BuyItemAction" class="BOX">
    <div id="Insidetittle"><h4>商品検索</h4></div>
    <br>商品名<br>
   <s:textfield name="searchWord" class="h_search" size="30" />　
   <select name="categoryId">
    <option value=0 selected="selected">全てのカテゴリ</option>
    <option value=1 >飲食</option>
    <option value=2 >家電・パソコン</option>
    <option value=3 >おもちゃ・ゲーム</option>
    <option value=4 >おもちゃ・ゲーム</option>
   </select>
    <br>金額<br>
   <s:textfield name="moreUp" class="h_search" />円～<s:textfield name="moreDown" class="h_search" />円
   <br>
   <button type="submit" class="SearchB">検索</button>
  </s:form>
 </div>
<script>

 $('.search').click(function() {
	  $('.inside').plainModal('open', {overlay: {color: '#fff', opacity: 0.5}});
	});

 </script>




 <s:if test="#session.loginFlg == false">
  <a href='<s:url action="GoLoginPageAction"/>' ><button class="login" style="cursor:pointer"></button></a>
 </s:if>

  <s:elseif test="#session.loginFlg == true">
   <a href='<s:url action="MyPageAction"/>' ><button class="mypage" style="cursor:pointer"></button></a>
   <a href='<s:url action="UserLogoutAction"/>'><button class="logout" style="cursor:pointer"></button></a>
  </s:elseif>


  <a href='<s:url action="BuyItemAction">
    <s:param name="categoryId" value="0"/>
    <s:param name="searchWord" value="''"/>
    <s:param name="moreUp" value="''"/>
    <s:param name="moreDown" value="''"/>
  </s:url>'><button  class="item" style="cursor:pointer"></button></a>
</div>
</div>


<div class="main">
 <div class="centerbox">
  <div id="logo">knit</div>
  <div id="massage">より新しい自分へ。</div>
 </div>
</div>

<div class="fooder"> Knit is the best site ever </div>

<script>

$(function(){
	$(".home ,.cart ,.search ,.login ,.mypage ,.logout ,.item").hover(
			function(){
				$(this).animate({
					width:"70px",
					height:"70px",
					}, 50 );
			},
			function(){
				$(this).animate({
					width:"50px",
					height:"50px",
					}, 50 );
			});
});
</script>
</body>
</html>
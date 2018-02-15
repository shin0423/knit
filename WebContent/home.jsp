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
  <a href="/knit/home.jsp"><button class="home">Home</button></a>

  <a href='<s:url action="CartAction"/>'><button class="cart">カートへ</button></a>

<button class="search"></button>
 <div class="inside">
  <s:form action="BuyItemAction" class="BOX">
   <s:textfield name="searchWord" class="h_search" />
   <select name="categoryId">
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
<script>

 $('.search').click(function() {
	  $('.inside').plainModal('open', {overlay: {color: '#fff', opacity: 0.5}});
	});

 </script>




 <s:if test="#session.loginFlg == false">
  <a href='<s:url action="GoLoginPageAction"/>' ><button class="user">ログインへ</button></a>
 </s:if>

  <s:elseif test="#session.loginFlg == true">
   <a href='<s:url action="MyPageAction"/>' ><button class="user">マイページへ</button></a>
   <a href='<s:url action="UserLogoutAction"/>'><button class="user">ログアウト</button></a>
  </s:elseif>


  <a href='<s:url action="BuyItemAction"/>'><button  class="item">+</button></a>
</div>
</div>


<div class="main">

<script>


$(function(){
	$(".home ,.cart ,.search ,.user ,.item").hover(
			function(){
				$(this).animate({
					width:"55px",
					height:"55px",
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

</div>
</body>
</html>
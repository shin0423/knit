<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/knit/css/buyItemInfo.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/jquery.plainmodal.js"></script>
<title>商品詳細ページ</title>
<script type="text/javascript">


$(function(){
	$(".home ,.cart ,.search ,.login ,.mypage ,.logout ,.item").hover(
			function(){
				$(this).animate({
					width:"65px",
					height:"65px",
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
</head>
<body>
<div class="header">

	<s:if test="#session.miniCartList.isEmpty()">
	カートに商品がありません
	</s:if>
      <div class="sideBar">
<s:else>


        <s:iterator value="#session.miniCartList">
<table>
		<tr>
        <td><s:property value="itemName" /></td>
        <td><s:property value="price" /><td>
        <td><s:property value="itemStock" /><td>
        </tr>
</table>
        </s:iterator>
 </s:else>

    </div>

 <div class="menu">
  <a href='<s:url action="TopAction" />'><button class="home">Home</button></a>

  <a href='<s:url action="CartAction"/>'><button class="cart">カートへ</button></a>

<button class="search"></button>
 <div class="inside">
  <s:form action="BuyItemAction" class="BOX">
   <s:textfield name="searchWord" class="h_search" value="" />
   <select name="categoryId">
    <option value=0 selected="selected">全てのカテゴリ</option>
    <option value=1 >飲食</option>
    <option value=2 >家電・パソコン</option>
    <option value=3 >おもちゃ・ゲーム</option>
    <option value=4 >おもちゃ・ゲーム</option>
   </select>
   <br>
   <s:textfield name="moreUp" class="h_search" value=""/>～
   <s:textfield name="moreDown" class="h_search" value=""/>
   <button type="submit">検索</button>
  </s:form>
 </div>
<script>

 $('.search').click(function() {
	  $('.inside').plainModal('open', {overlay: {color: '#fff', opacity: 0.5}});
	});

 </script>




 <s:if test="#session.loginFlg == false">
  <a href='<s:url action="GoLoginPageAction"/>' ><button class="login">ログインへ</button></a>
 </s:if>

  <s:elseif test="#session.loginFlg == true">
   <a href='<s:url action="MyPageAction"/>' ><button class="mypage">マイページへ</button></a>
   <a href='<s:url action="UserLogoutAction"/>'><button class="logout">ログアウト</button></a>
  </s:elseif>


  <a href='<s:url action="BuyItemAction"><s:param name="categoryId" value="0"/><s:param name="searchWord" value="''"/><s:param name="moreUp" value="''"/><s:param name="moreDown" value="''"/></s:url>'><button  class="item">+</button></a>
</div>
</div>

<div class="main">
<s:iterator value="buyItemDTO">

<img id="imageItem" src="<s:property value='itemImagePath' />" alt="画像なし">
</s:iterator>
<table class="itemInfoBox">
	<s:iterator value="buyItemDTO">

		<tr>
			<td><s:property value="itemName" /></td>
		</tr>
		<tr>
			<td id="itemDescription"><s:property value="itemDescription" /></td>
		</tr>
		<tr>
			<td><s:property value="price" />円</td>
		</tr>
		<tr>
		<s:if test="itemStock <= 0">
					在庫切れ
		</s:if>
		<s:else>
			<td>在庫&nbsp;&nbsp;<s:property value="itemStock" />個</td>
		</s:else>
		</tr>
		<tr>
			<td><s:property value="releaseCompany" /></td>
		</tr>
		<tr>
			<td>販売日&nbsp;&nbsp;<s:property value="releaseDate" /></td>
		</tr>

		<s:form action="PutItemIntoCartAction" >
			<s:hidden name="itemId" value="%{itemId}" />
			<s:hidden name="price" value="%{price}"/>
			<tr>
			<td>
				<select name="itemCount" >
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</td>
			</tr>
			<tr>
				<td>
					<s:if test="itemStock <= 0">
					在庫切れ
					</s:if>
					<s:else>

					<s:a href="javascrrpt:void(0)"
											onclick="document.PutItemIntoCartAction.submit();return false;"
											class="button">カートに入れる</s:a>
					</s:else>
				</td>
			</tr>
		</s:form>
	</s:iterator>
</table>
<p class="border">&nbsp;</p>
	<s:form action="ReviewAction">
		<s:iterator value="buyItemDTO">
			<div class="reviewForm" >
			<table>
			<tr>
				<td>レビュー入力欄</td>
			</tr>
			<tr>
				<td>
					<select name="review" >
						<option value="1">★</option>
						<option value="2">★★</option>
						<option value="3">★★★</option>
						<option value="4">★★★★</option>
						<option value="5">★★★★★</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><s:textarea cols="20" rows="5" name="reviewBody" value=""/></td>
			</tr>
			<tr>
				<s:hidden name="itemId" value="%{itemId}" />
				<td><s:a href="javascrrpt:void(0)"
											onclick="document.ReviewAction.submit();return false;"
											class="button"><strong>レビューする</strong></s:a></td>
			</tr>

			</table>
			</div>
		</s:iterator>
	</s:form>
	<p class="reviewBorder">&nbsp;</p>

			<s:if test="reviewErrorMessage != null">
			<s:iterator value="reviewErrorMessage">
				<s:property />

		</s:iterator>
		</s:if>


	<br>

	<s:if test=" #session.userId != null ">
		<div class="deleteReview">
		<br>自分のレビューを消す<br>

			<s:form action="ReviewDeleteAction">
				<s:hidden name="itemId" value="%{itemId}" />
				<s:a href="javascrrpt:void(0)"
											onclick="document.ReviewDeleteAction.submit();return false;"
											class="button">削除</s:a>
			</s:form>
		</div>
	</s:if>

	<div class="review">
	<br>レビュー<br>
	<s:iterator value="reviewList">
		名前:<s:property value="firstName"/>&nbsp;&nbsp;追加日時:<s:property value="insertDate" /><br>
		評価:<s:property value="reviewStar" /><br>
		レビュー内容:<s:property value="reviewBody" /><br><br>
	</s:iterator>
	</div>
</div>
</body>
</html>
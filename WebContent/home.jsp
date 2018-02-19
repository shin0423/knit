<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <link rel="stylesheet" href="./css/home.css">
 <script src="//ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script type="text/javascript" src="jquery.bgswitcher.js" charset="utf-8"></script>

<script src="js/jquery.plainmodal.js"></script>

<title>knit</title>



<script type="text/javascript">
jQuery(function($) {
    $('.slider').bgSwitcher({
        images: ['images/homeBack1.jpg', 'images/homeBack2.jpg','images/homeBack3.jpg'],
        interval: 5000,
        effect: "clip"
    });
});
</script>
</head>
<body class="slider">
<jsp:include page="headerInclude.jsp"/>

<div class="main">

 <div class="centerbox">

  <div id="logo">knit</div>
  <div id="massage">より新しい自分へ。</div>
 </div>
</div>

<div class="fooder"> Knit is the best site ever </div>

<script>


</script>
</body>
</html>
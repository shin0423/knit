<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="imagetoolbar" content="text/javascript"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<meta charset="UTF-8">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="./css/userDelete.css">
<title>会員退会画面</title>
</head>
<body>
	<header>
	</header>
	<div id="main">
		<br>
		<div id="title">
		<h1>退会する</h1>
		</div>
	<script type="text/javascript">
	$(function(){
		$('#checkBtn').on('change',function(){
			if($(this).is(':checked')){

				//チェックが入ったら、送信ボタンを押せる
				$('#submitBtn').prop('disabled',false);

			}else{

				//チェックが入っていなかったら、送信ボタンを押せない
				$('#submitBtn').prop('disabled',true);
			}
		});
	});

	</script>
	<div id="button">
	<s:form action="UserDeteleCompleteAction" >
	<div>退会される方はチェックを入れて削除を押してください</div>
	<br>

		<input id="checkBtn" type="checkbox">
		<input id="submitBtn" class="button" disabled="disabled" type="submit" value="削除">

	</s:form>
	</div>
</div>
<footer></footer>

</body>
</html>
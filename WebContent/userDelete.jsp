<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>会員退会画面</title>
</head>
<body>
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

	<s:form action="UserDeteleCompleteAction" >
		<input id="checkBtn" type="checkbox"  >
		<input id="submitBtn" class="button" disabled="disabled" type="submit" value="削除">
	</s:form>

</body>
</html>
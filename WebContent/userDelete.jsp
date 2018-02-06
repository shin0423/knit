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
<script type="text/javascript">
	function checkValue(check){
		var btn = document.getElementById('btn');
		if(check.checked){
			btn.removeAttribute('disabled');
		}else{
			btn.setAttribute('disabled','disabled';);
		}
	}

</script>

</head>
<body>
	<s:form action="UserDeleteCompleteAction" >
		<input type="checkbox" id="check" onclick="checkValue(this)" >
		<s:submit value="削除" />
	</s:form>
</body>
</html>
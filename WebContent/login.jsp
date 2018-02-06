<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />


<style type="text/css">

#errorMessage {
	color : red;
}

</style>

<title>ログインページ</title>
</head>
<body>
	<table>
	<s:form action="LoginAction">
	<tr>
		<td>ID:</td>
		<td><s:textfield name="userId" value="" /></td>
	</tr>
	<tr>
		<td>パスワード:</td>
		<td><s:password name="password" /></td>
	</tr>
	<tr>
		<td><s:submit value="確認" /></td>
		<td><input type="checkbox" value="true" name="saveId" >ID保存の場合はチェック</td>
	</tr>
	</s:form>
	</table>
	<br><br>
	<s:if test="!errorMessage == '' " >
		<div id="errorMessage"><s:property value="errorMessage" /></div>
	</s:if>

</body>
</html>
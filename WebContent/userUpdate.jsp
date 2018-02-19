<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
 <title>ユーザー情報変更</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
 </head>
 <body>
<jsp:include page="headerInclude.jsp"/>

<div id="main">
<div id="title"><p>ユーザー情報変更<p></div>
<div>ユーザー情報を変更してください</div>
<s:form action="UserUpdateConfirmAction">
<table>


   <tr>
   <th>ユーザーID(必須)</th>
   <td><s:textfield name="userId" value="%{userId}" placeholder="IDを入力"/></td>
   </tr>
   <tr>
   <th>新規パスワード(必須)</th>
   <td><s:password name="newPassword" value="%{newPassword}" placeholder="1～16文字の半角英数字"/></td>
   </tr>
   <tr>
   <th>確認用パスワード(必須)</th>
   <td><s:password name="conPassword" value="%{conPassword}" placeholder="確認のため再入力"/></td>
   </tr>
   <tr>
   <th>電話番号(必須)</th>
   <td><s:textfield name="telNumber" value="%{telNumber}" placeholder="8文字以上13文字以下"/></td>
   </tr>
   <tr>
   <th>住所(必須)</th>
   <td><s:textfield name="userAddress" value="%{userAddress}" placeholder="7文字以上50文字以下" /></td>
   </tr>
   </table>
   <div id="button">
   <button type ="button" onclick ="location.href='/knit/MyPageAction'">戻る</button>
   <button type="submit">登録</button>
   </div>
   <s:if test="errorMessage !=''">
<s:property value="errorMessage" escape="false" />
</s:if>
<s:iterator value="errMsgList">
		<h5>
			<s:div align="center">
				<s:property />
			</s:div>
		</h5>
		</s:iterator>
  </s:form>
  </div>
 </body>
</html>
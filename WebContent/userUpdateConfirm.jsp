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
 <title>ユーザー情報変更確認</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
 </head>
 <body>
 <jsp:include page="headerInclude.jsp"/>
<div id="main">
<div id="title"><p>入力情報確認</p></div>
<div>入力内容をご確認ください</div>
  <s:form action="UserUpdateCompleteAction">
  <table>
  <tr>
   <th>ユーザーID<th>
   <td><s:property value="%{session.userId}"/>
   <s:hidden name="userId" value="%{session.userId}" /><td>
   </tr>
   <s:if test="session.newPassword != null" >
   <tr>
   <th>新規パスワード</th>
   <td><s:property value="%{session.newPassword}"/>
   <s:hidden name="newPassword" value="%{session.newPassword}" /></td>
   </tr>
   </s:if>
   <s:if test="session.newEmail != null" >
   <tr>
   <th>メールアドレス</th>
   <td><s:property value="%{session.newEmail}"/>
   <s:hidden name="newEmail" value="%{session.newEmail}" /></td>
   </tr>
   </s:if>
  </table>
   <br>
   <div id="button">
   <button type ="button" onclick ="location.href='/knit/userUpdate.jsp'">戻る</button>
   <button type="submit">登録情報を確定</button>
   </div>
  </s:form>

  </div>
  <jsp:include page="footerInclude.jsp"/>
 </body>
</html>
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
 <title>ユーザー情報確認</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
 </head>
 <body>
<jsp:include page="headerInclude.jsp"/>

<div id="main">
<div id="title"><p>入力情報確認</p></div>
  <s:form action="UserCreateCompleteAction">
  <div>入力内容をご確認ください</div>
  <table>
  <tr>
   <th>ユーザーID:</th>
   <td><s:property value="userId"/>
   <s:hidden name="userId" value="%{userId}" /></td>
   </tr>
   <tr>
   <th>パスワード:</th>
   <td><s:property value="password"/>
   <s:hidden name="password" value="%{password}" /></td>
   </tr>
   <tr>
   <th>姓:</th>
   <td><s:property value="familyName"/>
   <s:hidden name="familyName" value="%{familyName}" /></td>
   </tr>
   <tr>
   <th>名:</th>
   <td><s:property value="firstName"/>
   <s:hidden name="firstName" value="%{firstName}" /></td>
   </tr>
   <tr>
   <th>姓ふりがな:</th>
   <td><s:property value="familyNameKana"/>
   <s:hidden name="familyNameKana" value="%{familyNameKana}" /></td>
   </tr>
   <tr>
   <th>名ふりがな:</th>
   <td><s:property value="firstNameKana"/>
   <s:hidden name="firstNameKana" value="%{firstNameKana}"/></td>
   </tr>
   <tr>
   <th>性別:</th>
   <td><s:if test="sex==0">男性</s:if>
		<s:else>女性</s:else>
   <s:hidden name="sex" value="%{sex}"/></td>
   </tr>
   <tr>
   <th>メール:</th>
   <td><s:property value="email"/>
   <s:hidden name="email" value="%{email}"/></td>
   </tr>
   <tr>
   <th>電話番号:</th>
   <td><s:property value="telNumber"/>
   <s:hidden name="telNumber" value="%{telNumber}" /></td>
   </tr>
   <tr>
   <th>住所:</th>
   <td><s:property value="userAddress"/>
   <s:hidden name="userAddress" value="%{userAddress}"/></td>
   </tr>
</table>
   <div id="button">
   <button type ="button" onclick ="location.href='/knit/userCreate.jsp'">戻る</button>
   <button type="submit">登録情報を確定</button>
   </div>
   </s:form>
  </div>

 </body>
</html>
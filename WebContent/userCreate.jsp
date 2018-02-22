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
 <title>ユーザー登録</title>
  <script type="text/javascript">

<!--
	function goUserCreateConfirmAction() {
	document.UserCreateConfirmAction.submit();
}
//-->

</script>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userCreate.css">
 </head>
 <body>
<jsp:include page="headerInclude.jsp"/>


 <div id="main">

<s:form action="UserCreateConfirmAction">
     <div id="title"><p>ユーザー登録をする<p></div>
     		<div>ユーザー情報を登録してください</div>

   <table>

      <tr>
      <th>ユーザーID(必須)</th>
       <td><s:textfield name="userId" value="%{userId}" placeholder="IDを入力"/></td>
      </tr>
      <tr>
      <th>パスワード(必須)</th>
       <td><s:password name="password" value="%{password}" placeholder="1～16文字の半角英数字"/></td>
      </tr>
      <tr>
      <th>姓(必須)</th>
       <td><s:textfield name="familyName" value="%{familyName}" placeholder=""/></td>
      </tr>
      <tr>
      <th>名(必須)</th>
       <td><s:textfield name="firstName" value="%{firstName}" placeholder=""/></td>
      </tr>
      <tr>
      <th>せい(必須)</th>
       <td><s:textfield name="familyNameKana" value="%{familyNameKana}" placeholder="ひらがなのみ"/></td>
      </tr>
      <tr>
      <th>めい(必須)</th>
       <td><s:textfield name="firstNameKana" value="%{firstNameKana}" placeholder="ひらがなのみ" /></td>
      </tr>
      <tr>
      <th>性別(必須)</th>
      <td><s:radio name="sex" list="#{'0': '男性', '1': '女性'}" value="%{sex}"  /></td>
      </tr>
      <tr>
      <th>E-mail(必須)</th>
      <td><s:textfield name="email" value="%{email}" placeholder="***@***"/></td>
      </tr>
      <tr>
      <th>電話番号(任意)</th>
       <td><s:textfield name="telNumber" value="%{telNumber}" /></td>
      </tr>
      <tr>
      <th>住所(任意)</th>
       <td><s:textfield name="userAddress" value="%{userAddress}" /></td>
       </tr>
   </table>

   <div align="center">
   <a href="<s:url action='LoginAction'></s:url>"  class="button">戻る</a>
   <s:a href="javascrrpt:void(0)"
	onclick="document.UserCreateConfirmAction.submit();return false;"
	 class="button">登録</s:a>
   </div>
   <br>
 <s:if test="errorMessage !=''">
    <h5><s:property value="errorMessage" escape="false" /></h5>
 </s:if>
 <s:iterator value="errMsgList">
	<h5>
		<s:div align="center">
			<s:property />
		</s:div>
	</h5>
</s:iterator>
</s:form>

<br>
<br>

</div>
<jsp:include page="footerInclude.jsp"/>
</body>
</html>
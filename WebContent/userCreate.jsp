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
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/resetPassword.css">
 </head>
 <body>


 <div id="main">

   <s:form action="UserCreateConfirmAction">
     <div id="title"><p>ユーザー登録をする<p></div>
     		<div>ユーザー情報を登録してください</div>
   <table>
      <tr>
      <th>ユーザーID(必須)</th>
       <td><s:textfield name="userId" value="" placeholder="IDを入力"/></td>
      </tr>
      <tr>
      <th>パスワード(必須)</th>
       <td><s:password name="password" value="" placeholder="1～16文字の半角英数字"/></td>
      </tr>
      <tr>
      <th>姓(必須)</th>
       <td><s:textfield name="familyName" value="" placeholder=""/></td>
      </tr>
      <tr>
      <th>名(必須)</th>
       <td><s:textfield name="firstName" value="" placeholder=""/></td>
      </tr>
      <tr>
      <th>せい(必須)</th>
       <td><s:textfield name="familyNameKana" value="" placeholder="ひらがなのみ"/></td>
      </tr>
      <tr>
      <th>めい(必須)</th>
       <td><s:textfield name="firstNameKana" value="" placeholder="ひらがなのみ" /></td>
      </tr>
      <tr>
      <th>性別(必須)</th>
      <td><s:radio name="sex" list="#{'0': '男性', '1': '女性'}" value="0" /></td>
      </tr>
      <tr>
      <th>E-mail(必須)</th>
      <td><s:textfield name="email" value="" placeholder="***@***"/></td>
      </tr>
      <tr>
      <th>電話番号(任意)</th>
       <td><s:textfield name="telNumber" value="" /></td>
      </tr>
      <tr>
      <th>住所(任意)</th>
       <td><s:textfield name="userAddress" value="" /></td>
       </tr>
        </table>

          <div id="button">
       <button type ="button" onclick ="location.href='/knit/login.jsp'">戻る</button>
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
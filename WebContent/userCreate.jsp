<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>ユーザー登録</title>
 </head>
 <body>
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
<s:form action="UserCreateConfirmAction">
   <br>
   <span>ユーザーID</span><span>必須</span>
   <s:textfield name="userId" value="" />
   <br>
   <span>パスワード</span><span>必須</span>
   <s:password name="password" value="" />
   <br>
   <span>姓</span><span>必須</span>
   <s:textfield name="familyName" value="" />
   <br>
   <span>名</span><span>必須</span>
   <s:textfield name="firstName" value="" />
   <br>
   <span>せい</span><span>必須</span>
   <s:textfield name="familyNameKana" value="" />
   <br>
   <span>めい</span><span>必須</span>
   <s:textfield name="firstNameKana" value="" />
   <br>
   <span>性別</span><span>必須</span>
   <s:radio name="sex" list="#{'0': '男性', '1': '女性'}" value="0" />
   <br>
   <span>E-mail</span><span>必須</span>
   <s:textfield name="email" value="" />
   <br>
   <span>電話番号</span><span>任意</span>
   <s:textfield name="telNumber" value="" />
   <br>
   <span>住所</span><span>任意</span>
   <s:textfield name="userAddress" value="" />
   <br>
   <button type="submit">登録</button>
   <a href="/knit/login.jsp" >戻る</a>
  </s:form>
 </body>
</html>
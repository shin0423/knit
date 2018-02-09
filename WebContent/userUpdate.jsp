<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>ユーザー情報変更</title>
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
<s:form action="UserUpdateConfirmAction">
   <br>
   <span>ユーザーID</span><span>必須</span>
   <s:textfield name="userId" value="%{userId}" />
   <br>
   <span>新規パスワード</span><span>必須</span>
   <s:password name="newPassword" value="%{newPassword}" />
   <br>
   <span>確認用パスワード</span><span>必須</span>
   <s:password name="conPassword" value="%{conPassword}" />
   <br>
   <span>電話番号</span><span>必須</span>
   <s:textfield name="telNumber" value="%{telNumber}" />
   <br>
   <span>住所</span><span>必須</span>
   <s:textfield name="userAddress" value="%{userAddress}" />
   <br>
   <button type="submit">登録</button>
   <a href="<s:url action='MyPageAction'/>">戻る</a>
  </s:form>
 </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>宛先情報登録</title>
 </head>
 <body>
  <s:form action="CreateAddressConfirmAction">
   <h5>
    <s:iterator value="noInpList">
     <s:property/>
    </s:iterator>
   </h5>
   <br>
   <span>姓</span><span>必須</span>
   <s:textfield name="familyName" value="%{familyName}" />
   <br>
   <span>名</span><span>必須</span>
   <s:textfield name="firstName" value="%{firstName}" />
   <br>
   <span>せい</span><span>必須</span>
   <s:textfield name="familyNameKana" value="%{familyNameKana}" />
   <br>
   <span>めい</span><span>必須</span>
   <s:textfield name="firstNameKana" value="%{firstNameKana}" />
   <br>
   <span>E-mail</span><span>必須</span>
   <s:textfield name="email" value="%{email}" />
   <br>
   <span>電話番号</span><span>必須</span>
   <s:textfield name="telNumber" value="" />
   <br>
   <span>住所</span><span>必須</span>
   <s:textfield name="userAddress" value="" />
   <br>
   <button type="submit">登録</button>
   <a href="*">戻る</a>
  </s:form>
 </body>
</html>
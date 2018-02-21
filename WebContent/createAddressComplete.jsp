<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/createAddress.css">

<meta http-equiv="refresh"  content="5;URL='SettlementConfirmAction'" />

<meta >
 <title>宛先情報登録完了</title>




 </head>
 <body >
  <p class="message">宛先情報登録完了しました。</p>

  <p class="message">5秒後に決済確認ページに飛びます</p>
  <br>
  <p>すぐ遷移する場合はこちら<a href='<s:url action="SettlementConfirmAction"/>'>宛先情報選択画面へ</a></p>

  <s:form action="SettlementConfirmAction">
      <s:hidden name="token" value="%{token}" />


  <s:submit class="button" value="決済確認ページに戻る"/>
  </s:form>

 </body>
</html>
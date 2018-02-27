<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/createAddress.css">

<!-- <meta http-equiv="refresh"  content="5;URL='SettlementConfirmAction'" />-->

<meta>
 <title>宛先情報登録完了</title>




 </head>
 <body >
 <div class="main">
 <div class="message">宛先情報登録完了</div>
 <div class="messagebox1">
  <div><p>宛先情報登録完了しました。</p></div>
  <div><p>5秒後に決済確認ページに飛びます</p></div>

  <br>

  すぐ遷移する場合はこちら<a href='<s:url action="SettlementConfirmAction"/>'>宛先情報選択画面へ</a>

  <s:form action="SettlementConfirmAction">
      <s:hidden name="token" value="%{token}" />


  <s:submit class="button" value="決済確認ページに戻る"/>
  </s:form>
</div>
</div>
 </body>
</html>
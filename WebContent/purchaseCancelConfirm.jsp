<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<title>購入キャンセル確認画面</title>

	<style type="text/css">
	</style>

</head>
<body>

	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>CancelConfirm</p>
		</div>

		<div>
			<p>購入キャンセルの確認をお願いいたします</p>


		<!-- リストに応じたトップメッセージ -->
				<s:if test = "CancelConfirmList == null ">
					<h2>
					申し訳ございませんが、商品はすでに発送されています。
					<br>
					商品発送後のキャンセルはこのフォームからは受け付けておりません。
					</h2>
				</s:if>

			<s:iterator value = "CancelConfirmList">
        			<div class="date">
            			<p>注文日</p>
            			<p><s:property value="registDate" /></p>
            		</div>


			<div class="main_content clearfix_hon">
				<div class="item_image">
					<img src="<s:property value="imageFilePath"/>">
				</div>


				<div class="item_text">
					 <div class="name">
           				 <div class="kana"><s:property value="itemNameKana"/></div>
           				 <div class="pro_name">
           				 	商品名: <s:property value="itemName"/>
           				 </div>
        			</div>

					<div class="price_count">
            			<div class="price">
            			<span>金額:\</span>
            			<%-- <s:property value="price"/> --%>
            			</div>
            			<div class="count">(購入数:  <s:property value="count"/>点)</div>
       				 </div>

					 <div class="comp_info">
           				 <div class="company">発売会社：<s:property value="releasecompany"/></div>
           				 <div class="release_date">
           				 	発売日：<s:property value="release_date"/>
           				</div>
        			</div>


        			<div class="cancel">
						<!-- キャンセルボタン -->
							<s:form action ="PurchaseCompleteAction">
								<input type="hidden" name= "itemId" value="%{itemId}">
								<input type="hidden" name= "orderNum" value="%{orderNum}">
								<s:submit value="注文キャンセル" />
							</s:form>

					</div>
				</div>
    		</div>


    		</s:iterator>

				<div>
					<a href='<s:url action="PurchaseCancelAction" />'>購入キャンセル画面へもどる</a>
				</div>
		</div>
	</div>

	<div id="footer">
	<div id="pr">
	</div>
	</div>

</body>
</html>
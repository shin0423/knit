<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet"
		  type="text/css"
		  href="knit/css/purchaseCancelConfirm_style.css">

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
				<s:if test = "cancelConfirmList.size() == 0 ">
					<h2>
					申し訳ございませんが、商品はすでに発送されています。
					<br>
					商品発送後のキャンセルはこのフォームからは受け付けておりません。
					</h2>
				</s:if>
				<s:elseif test= "cancelConfirmList.size() != 0">
					<h2>キャンセル情報は以下になります</h2>

			<s:iterator value = "cancelConfirmList">


<table>
				<!--  画像ファイル -->
				 <tr>

					<td>
					<img src="<s:property value='imageFilePath' />" alt="画像なし">
					</td>

				</tr>

				<tr>
					<td>
					商品名:
					</td>

					<td>
					<s:property value="itemName"/>
					</td>
				</tr>

				<tr>
            		<td>
            		単価:
            		</td>

            		<td>
            		<s:property value="price"/>円
            		</td>
            	</tr>

            	<tr>
            		<td>
            		購入数:
            		</td>

            		<td>
            		<s:property value="itemCount"/>
            		</td>

				</tr>

				<tr>
					<td>
					合計購入金額:
					</td>
					<td>
					<s:property value='totalPrice'/>円
					</td>
				</tr>


				<tr>
					<td>
					発売会社:
					</td>

					<td>
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>

           		<tr>
           			<td>
           			発売日:
           			</td>

           			<td>
           			<s:property value="releaseDate"/>
           			</td>
           		</tr>

				<tr>
					<td>
					注文日:
					</td>

            		<td>
            		<s:property value="registDate" />
            		</td>
            	</tr>

        		<tr>
        			<td>
        			<s:form action = "BuyItemInfoAction">
					<input type="hidden" name="itemId" value="<s:property value= 'itemId'/>">
					<s:submit value="商品詳細ページへ"/>
					</s:form>
        			</td>

        			<td class="cancel">
						<!-- キャンセルボタン -->
							<s:form action ="PurchaseCancelCompleteAction">
								<input type="hidden" name= "itemId" value="<s:property value= 'itemId'/>">
								<input type="hidden" name= "orderNum" value="<s:property value= 'orderNum'/>">
								<s:submit value="注文キャンセル" />
								注文番号<s:property value= 'orderNum'/>
								アイテムId<s:property value= 'itemId'/>
							</s:form>
					</td>
			</tr>
			</table>

    		</s:iterator>
			</s:elseif>
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
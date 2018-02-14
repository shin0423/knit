<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/purchaseCancel_style.css">

	<title>購入キャンセル画面</title>

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
			<p>purchaseCancel</p>
		</div>

		<div>
			<p>購入キャンセルしたい商品をお選びください</p>
		</div>


		<!-- リストに応じたトップメッセージ -->
				<s:if test = "cancelList.size() == 0">
					<h2>キャンセル可能な商品はありません</h2>
				</s:if>
				<s:elseif test= "cancelList.size() != 0">
					<h2>キャンセル可能な商品は以下になります</h2>


			<s:iterator value = "cancelList">


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
							<s:form action ="PurchaseCancelConfirmAction">
								<input type="hidden" name= "itemId" value="<s:property value= 'itemId'/>">
								<input type="hidden" name= "orderNum" value="<s:property value= 'orderNum'/>">
								<s:submit value="注文キャンセル" />
								<!--  注文番号<s:property value= 'orderNum'/>
								アイテムId<s:property value= 'itemId'/>  -->
							</s:form>
					</td>
			</tr>
			</table>
    		</s:iterator>
		</s:elseif>


				<div>
					<a href='<s:url action="GoPurchaseHistoryAction" />'>購入履歴へもどる</a>
				</div>
				<div>
					<a href='<s:url action="MyPageAction" />'>マイページへもどる</a>
				</div>
				<div>
					<a href='<s:url action="TopAction" />'>トップページへもどる</a>
				</div>

	</div>

	<div id="footer">
	<div id="pr">
	</div>
	</div>

</body>
</html>
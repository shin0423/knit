<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet"
		  type="text/css"
		  href="${pageContext.request.contextPath}/css/purchaseCancelConfirm_style.css">

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

				<s:if test= "cancelConfirmList.size() != 0">
					<h2>キャンセル情報は以下になります</h2>

			<s:iterator value = "cancelConfirmList">


				<table class = "table01">

				<!--  画像ファイル -->
				 <tr>

					<td class ="guideto">
					<img src="<s:property value='imageFilePath' />" alt="画像なし">
					</td>

				</tr>

				<tr>
					<th class ="guide">
					商品名:
					</th>

					<td class ="guideto">
					<s:property value="itemName"/>
					</td>
				</tr>

				<tr>
            		<th class ="guide">
            		単価:
            		</th>

            		<td class ="guideto">
            		<s:property value="price"/>円
            		</td>
            	</tr>

            	<tr>
            		<th class ="guide">
            		購入数:
            		</th>

            		<td class ="guideto">
            		<s:property value="itemCount"/>
            		</td>

				</tr>

				<tr>
					<th class ="guide">
					合計購入金額:
					</th>
					<td class ="guideto">
					<s:property value='totalPrice'/>円
					</td>
				</tr>


				<tr>
					<th class ="guide">
					発売会社:
					</th>

					<td class ="guideto">
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>

           		<tr>
           			<th class ="guide">
           			発売日:
           			</th>

           			<td class ="guideto">
           			<s:property value="releaseDate"/>
           			</td>
           		</tr>

				<tr>
					<th class ="guide">
					注文日:
					</th>

            		<td class ="guideto">
            		<s:property value="registDate" />
            		</td>
            	</tr>

        		<tr>
        			<td class ="guide">
        			<div class="buttonBox">
						<div class="btn">
							<a href='<s:url action="BuyItemInfoAction"><s:param name="itemId" value="%{itemId}" /></s:url>' class="button">商品詳細</a>
						</div>
					</div>
        			</td>

					<td class="guide">
						<!-- キャンセルボタン -->
						<div class="buttonBox">
						<div class="btn">

							<a href=' <s:url action ="PurchaseCancelCompleteAction">
								<s:param name= "itemId" value="%{itemId}"/>
								<s:param name ="orderNum" value= "%{orderNum}"/>
								 </s:url>' class="button">
								 注文キャンセル
							</a>

						</div>
					</div>
					</td>
				</tr>

				<tr>
					<td><br></td>
					<td><br></td>
				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
				</tr>
			</table>

    		</s:iterator>
			</s:if>

			<s:else>
					<h2>
					申し訳ございませんが、商品はすでに発送されています。
					<br>
					商品発送後のキャンセルはこのフォームからは受け付けておりません。
					</h2>
			</s:else>
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
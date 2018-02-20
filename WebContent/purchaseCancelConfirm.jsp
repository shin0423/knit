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
	<jsp:include page="headerInclude.jsp"/>
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>CancelConfirm</p>
		</div>

		<div>
			<h2 class="guide">購入キャンセルの確認をお願いいたします</h2>


		<!-- リストに応じたトップメッセージ -->

				<s:if test= "cancelConfirmList.size() != 0">
					<h2 class="guide">キャンセル情報は以下になります</h2>

			<s:iterator value = "cancelConfirmList">


			<div class="box">
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
        			<th class ="guide">
        			<div class="buttonBox">
						<div class="btn">
							<a href='<s:url action="BuyItemInfoAction"><s:param name="itemId" value="%{itemId}" /></s:url>' class="button">商品詳細</a>
						</div>
					</div>
        			</th>

					<th class="guide">
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
					</th>
				</tr>
			</table>
		</div>

    		</s:iterator>
			</s:if>

			<s:else>
			<div class="clear"></div>
					<h2  id="textcm01">
					申し訳ございませんが、商品は既にキャンセル可能な状態ではありません。
					<br>
					<br>
					また、商品発送後のキャンセルはこのフォームからは受け付けておりません。
					</h2>
			</s:else>
			<div class="clear"></div>
			<div class = "guide" id="textcm02">
			<div class="buttonBox">
						<div class="btn">
					<a href='<s:url action="GoPurchaseHistoryAction" />'
					   class="button">購入履歴へもどる</a>
				</div>
				</div>
				</div>
		</div>
	</div>

	<div id="footer">
	<jsp:include page="footerInclude.jsp"/>
	<div id="pr">
	</div>
	</div>

</body>
</html>
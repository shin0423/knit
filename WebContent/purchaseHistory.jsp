<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/purchaseHistory_style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>購入履歴</title>
</head>
<body>

<!-- メイン -->
	<div class = "main">

		<!-- メインのトップ -->
			<div class = "top">
				<p class="title">購入履歴</p>
			</div>
		<!-- メインのトップここまで -->

		<div>
		<!-- リストに応じたトップメッセージ -->

				<s:if test= "historyList.size() != 0">
					<h2>購入情報は以下になります</h2>



			<!-- 全件削除ボタン -->
				<div class="alldelete">
					<s:form action="PurchaseHistoryAction" >
						<input type ="hidden" name="deleteFlg" value="1">
						<s:submit id="all_delete" value="履歴をすべて削除"/>
					</s:form>
				</div>
			<!-- 全件削除ボタンここまで -->

			<!-- ボタン押下でキャンセル画面に遷移 -->
    		<div class="cancel">
					<s:form action="PurchaseCancelAction">
						<s:submit value="購入キャンセルはこちら"/>
					</s:form>
			</div>

		<!-- リストに応じたトップメッセージここまで -->

<!----------------------履歴詳細   ここから------------------------------->

				<s:iterator value = "historyList" status="sts">
				<s:if test = "#sts.count % 3 == 1">

				<table class = "table01">



				<!--  画像ファイル -->
				 <tr>

					<td>
					<img src="<s:property value='imageFilePath' />" alt="画像なし">
					</td>

				</tr>

				<tr>
					<td class ="guide">
					商品名:
					</td>

					<td>
					<s:property value="itemName"/>
					</td>
				</tr>

				<tr>
            		<td class ="guide">
            		単価:
            		</td>

            		<td>
            		<s:property value="price"/>円
            		</td>
            	</tr>

            	<tr>
            		<td class ="guide">
            		購入数:
            		</td>

            		<td>
            		<s:property value="itemCount"/>
            		</td>

				</tr>

				<tr>
					<td class ="guide">
					合計購入金額:
					</td>
					<td>
					<s:property value='totalPrice'/>円
					</td>
				</tr>


				<tr>
					<td class ="guide">
					発売会社:
					</td>

					<td>
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>

           		<tr>
           			<td class ="guide">
           			発売日:
           			</td>

           			<td>
           			<s:property value="releaseDate"/>
           			</td>
           		</tr>

				<tr>
					<td class ="guide">
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

					<td>
					<!--  履歴個別削除ボタン-->
							<s:form action = "PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="2">
								<input type="hidden" name="itemId" value="<s:property value= 'itemId'/>">
								<s:submit  value="×履歴削除"/>
							</s:form>
					<!--  履歴個別削除ボタンここまで-->
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
			</s:if>


			<s:else>
			<table class = "table02">
				<!--  画像ファイル -->
				 <tr>

					<td>
					<img src="<s:property value='imageFilePath' />" alt="画像なし">
					</td>

				</tr>

				<tr>
					<td class ="guide">
					商品名:
					</td>

					<td>
					<s:property value="itemName"/>
					</td>
				</tr>

				<tr>
            		<td class ="guide">
            		単価:
            		</td>

            		<td>
            		<s:property value="price"/>円
            		</td>
            	</tr>

            	<tr>
            		<td class ="guide">
            		購入数:
            		</td>

            		<td>
            		<s:property value="itemCount"/>
            		</td>

				</tr>

				<tr>
					<td class ="guide">
					合計購入金額:
					</td>
					<td>
					<s:property value='totalPrice'/>円
					</td>
				</tr>


				<tr>
					<td class ="guide">
					発売会社:
					</td>

					<td>
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>

           		<tr>
           			<td class ="guide">
           			発売日:
           			</td>

           			<td>
           			<s:property value="releaseDate"/>
           			</td>
           		</tr>

				<tr>
					<td class ="guide">
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
					<s:submit value="商品詳細ページへ" />
					</s:form>
        			</td>

					<td>
					<!--  履歴個別削除ボタン-->
							<s:form action = "PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="2">
								<input type="hidden" name="itemId" value="<s:property value= 'itemId'/>">
								<s:submit  value="×履歴削除"/>
							</s:form>
					<!--  履歴個別削除ボタンここまで-->
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
			</s:else>
    		</s:iterator>



<!----------------------履歴詳細   ここまで------------------------------->
		</s:if>
		<s:else>
					<h2>購入情報はありません</h2>
		</s:else>


<!-- ページリンク -->
		<div class= "back">
			<!-- MyPageに戻る-->
			<div class="link">
				<a href='<s:url action="MyPageAction" />'>マイページに戻る</a>
			</div>
		</div>



<!-- ページリンクここまで -->





<!-- トップに戻れる！
				<div>
					<a href='<s:url action="TopAction" />'> ＞ページトップへ＜ </a>
				</div>
 トップに戻れるここまで -->

		</div>
	</div>
<!-- メインここまで -->


</body>
</html>
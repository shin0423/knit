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


<jsp:include page="headerInclude.jsp"/>
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
				<div class="buttonBox">
					<div class ="btn">
					<a href=' <s:url action = "PurchaseHistoryAction" >
						<s:param name="deleteFlg" value="1" />
					</s:url>' class="button">
					履歴全件削除
					</a>
				</div>
				</div>
			<!-- 全件削除ボタンここまで -->


			<!-- ボタン押下でキャンセル画面に遷移 -->
			<div class="buttonBox">
					<div class ="btn">
    		<div class="cancel">
    				<a href=' <s:url action = "PurchaseCancelAction" >
					</s:url>' class="button">
					購入キャンセル
					</a>
			</div>
			</div>
			</div>

		<!-- リストに応じたトップメッセージここまで -->

<!----------------------履歴詳細   ここから------------------------------->

				<s:iterator value = "historyList" status="sts">
				<s:if test = "#sts.count % 3 == 1">

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

					<th class ="guide">
					<!--  履歴個別削除ボタン-->
					<div class="buttonBox">
						<div class="btn">
							<a href=' <s:url action = "PurchaseHistoryAction">
											<s:param name="itemId" value="%{itemId}" />
											<s:param name="deleteFlg" value="2" />
									  </s:url>' class="button">
									  履歴削除
							</a>
						</div>
					</div>
					<!--  履歴個別削除ボタンここまで-->
					</th>
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

					<td class ="guideto">
					<img src="<s:property value='imageFilePath' />" alt="画像なし">
					</td>

				</tr>

				<tr>
					<th class ="guide">
					商品名:
					</th>

					<td class="guideto">
					<s:property value="itemName"/>
					</td>
				</tr>

				<tr>
            		<th class ="guide">
            		単価:
            		</th>

            		<td class="guideto">
            		<s:property value="price" />円
            		</td>
            	</tr>

            	<tr>
            		<th class ="guide">
            		購入数:
            		</th>

            		<td class="guideto">
            		<s:property value="itemCount"/>
            		</td>

				</tr>

				<tr>
					<th class ="guide">
					合計購入金額:
					</th>
					<td class="guideto">
					<s:property value='totalPrice'/>円
					</td>
				</tr>


				<tr>
					<th class ="guide">
					発売会社:
					</th>

					<td class="guideto">
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>

           		<tr>
           			<th class ="guide">
           			発売日:
           			</th>

           			<td class="guideto">
           			<s:property value="releaseDate"/>
           			</td>
           		</tr>

				<tr>
					<th class ="guide">
					注文日:
					</th>

            		<td class="guideto">
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

					<th class ="guide">
					<!--  履歴個別削除ボタン-->
					<div class="buttonBox">
						<div class="btn">
							<a href=' <s:url action = "PurchaseHistoryAction">
											<s:param name="itemId" value="%{itemId}" />
											<s:param name="deleteFlg" value="2" />
									  </s:url>' class="button">
									  履歴削除
							</a>
						</div>
					</div>
					<!--  履歴個別削除ボタンここまで-->
					</th>
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

<jsp:include page="footerInclude.jsp"/>
</body>
</html>
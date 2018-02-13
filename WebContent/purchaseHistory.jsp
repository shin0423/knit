<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
				<s:if test = "historyList == null">
					<h2>購入情報はありません</h2>
				</s:if>
				<s:elseif test= "historyList != null">
					<h2>購入情報は以下になります</h2>



			<!-- 全件削除ボタン -->
				<div class="all_delete">
					<s:form action="PurchaseHistoryAction" >
						<input type ="hidden" name="deleteFlg" value="1">
						<s:submit id="all_delete" value="履歴をすべて削除"/>
					</s:form>
				</div>
			<!-- 全件削除ボタンここまで -->

		<!-- リストに応じたトップメッセージここまで -->

<!----------------------履歴詳細   ここから------------------------------->

				<s:iterator value = "historyList">

				<table>

				<tr>
					<td>
					<p>注文日</p>
					</td>

            		<td>
            		<p><s:property value="registDate" /></p>
            		</td>
            	</tr>



				<!--
					<s:property value="itemId"/>
					<img src='<s:property value="imageFilePath"/>'>
					<img src="./images/coffee.jpg"/>
				</div>


				<s:property value="imageFilePath" />

				</div>  -->

				<!--  画像ファイル -->


				 <tr>

					<td>
					<img src="<s:property value='imageFilePath' />" alt="画像なし" >
					</td>

				</tr>

				<tr>
					<td>
					ふりがな:
					</td>
					<td>
					<s:property value="itemNameKana"/>
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
					<td>
					<s:property value="('price' * 'itemCount')"/>円
					</td>
				</tr>

				<tr>
					<td>
					発売会社：
					</td>

					<td>
					<s:property value="releaseCompany"/>
           			</td>
           		</tr>
           		<tr>
           			<td>
           			発売日：
           			</td>

           			<td>
           			<s:property value="releaseDate"/>
           			</td>


        		<tr>
					<td>
					<!--  履歴個別削除ボタン-->
							<s:form action = "PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="2">
								<input type="hidden" name="itemId" value="<s:property value= 'itemId'/>">
								<s:submit  value="×削除"/>
							</s:form>
					<!--  履歴個別削除ボタンここまで-->
					</td>
				</tr>
			</table>
    		</s:iterator>



<!----------------------履歴詳細   ここまで------------------------------->
		</s:elseif>


<!-- ページリンク -->
		<div class= "back">
			<!-- MyPageに戻る-->
			<div class="link">
				<a href='<s:url action="MyPageAction" />'>マイページに戻る</a>
			</div>
		</div>
		<!-- ボタン押下でキャンセル画面に遷移 -->
    		<div class="cancel">
						<!-- 注文キャンセルリンク -->
						<a href='<s:url action="PurchaseCancelAction" />'>購入キャンセルはこちら</a>

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
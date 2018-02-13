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
        			<div class="date">
            			<p>注文日</p>
            			<p><s:property value="registDate" /></p>
            		</div>

				<div>
					<s:property value="itemId"/>
				</div>


				<div>
				<s:property value="imageFilePath" />
				</div>

				<!--  画像ファイル -->
			<div class="main_content clearfix_hon">
				<div class="item_image">
					<input type="image" src="<s:property value="imageFilePath" />" alt="画像なし" >
					<input type="image" src="<s:property value='imageFilePath' />" alt="画像なし" >
					<input type="image" src="/knit/images/coffee.jpg" alt="画像なし" >
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
            			<s:property value="price"/>
            			</div>
            			<div class="count">(購入数:  <s:property value="itemCount"/>点)</div>
       				 </div>

					 <div class="comp_info">
           				 <div class="company">発売会社：<s:property value="releaseCompany"/></div>
           				 <div class="release_date">
           				 	発売日：<s:property value="releaseDate"/>
           				 </div>
        			</div>

        			<div class="delete">
					 	<!--  履歴個別削除ボタン-->
							<s:form action = "PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="2">
								<input type="hidden" name="itemId" value="<s:property value= 'itemId'/>">
								<s:submit  value="×削除"/>
							</s:form>
						<!--  履歴個別削除ボタンここまで-->

					 </div>

				</div>
    		</div>


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
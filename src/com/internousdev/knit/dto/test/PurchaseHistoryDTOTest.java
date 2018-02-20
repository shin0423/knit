package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.PurchaseHistoryDTO;

public class PurchaseHistoryDTOTest {

//Idに関するテスト get
	@Test
	public void testGetId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetId5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set Id
	@Test
	public void testSetId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetId5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//UserIdに関するテスト get
	@Test
	public void testGetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

//set UserId
	@Test
	public void testSetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

//ItemCountに関するテスト get
	@Test
	public void testGetItemCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetItemCount5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set ItemCount
	@Test
	public void testSetItemCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testSetItemCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testSetItemCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testSetItemCount4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetItemCount5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//Priceに関するテスト get
	@Test
	public void testGetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setPrice(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetPrice5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setPrice(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set Price
	@Test
	public void testSetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setPrice(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetPrice5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setPrice(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//ItemIdに関するテスト get
	@Test
	public void testGetItemId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetItemId5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set ItemId
	@Test
	public void testSetItemId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetItemId5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//RegistDateに関するテスト get
	@Test
	public void testGetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

//set RegistDate
	@Test
	public void testSetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

//
	@Test
	public void testGetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetOrderNum() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetOrderNum() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetItemName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetItemNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetStatus() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetStatus() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetsendFlg() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetsendFlg() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTotalPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTotalPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImageFilePath() {
		fail("まだ実装されていません");
	}

}

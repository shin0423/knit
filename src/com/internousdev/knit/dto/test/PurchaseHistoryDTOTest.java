package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

//UpdateDateに関するテスト get
	@Test
	public void testGetUpdateDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdatetDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

//set UpdateDate
	@Test
	public void testSetUpdateDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdatetDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

//OrderNumに関するテスト get
	@Test
	public void testGetOrderNum1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testGetOrderNum2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testGetOrderNum3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testGetOrderNum4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetOrderNum12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

//set OrderNum
	@Test
	public void testSetOrderNum1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testSetOrderNum2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testSetOrderNum3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setOrderNum(expected);
		assertEquals(expected, dto.getOrderNum());
	}

	@Test
	public void testSetOrderNum4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetOrderNum12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOrderNum(expected);
		String actual = dto.getOrderNum();
		assertEquals(expected, actual);
	}

//ItemNameに関するテスト get
	@Test
	public void testGetItemName1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

//set ItemName
	@Test
	public void testSetItemName1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testSetItemName2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testSetItemName3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testSetItemName4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

//ItemNameKanaに関するテスト get
	@Test
	public void testGetItemNameKana1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

//set ItemNameKana
	@Test
	public void testSetItemNameKana1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

//Statusに関するテスト get
	@Test
	public void testGetStatus1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testGetStatus2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testGetStatus3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testGetStatus4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setStatus(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetStatusd5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setStatus(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set Status
	@Test
	public void testSetStatus1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testSetStatus2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testSetStatus3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		assertEquals(expected, dto.getStatus());
	}

	@Test
	public void testSetStatus4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setStatus(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetStatusd5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setStatus(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//sendFlgに関するテスト get
	@Test
	public void testGetsendFlg1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testGetsendFlg2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testGetsendFlg3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testGetsendFlg4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setsendFlg(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetsendFlg5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setsendFlg(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//set sendFlg
	@Test
	public void testSetsendFlg1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testSetsendFlg2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testSetsendFlg3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setsendFlg(expected);
		assertEquals(expected, dto.getsendFlg());
	}

	@Test
	public void testSetsendFlg4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setsendFlg(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetsendFlg5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setsendFlg(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//ReleaseDateに関するテスト get
	@Test
	public void testGetReleasetDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate2() throws ParseException {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected =  sdf.parse("20180220 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

//set ReleaseDate
	@Test
	public void testSetReleasetDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate2() throws ParseException {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected =  sdf.parse("20180220 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

//ReleaseCompanyに関するテスト get
	@Test
	public void testGetReleaseCompany1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

//set ReleaseCompany
	@Test
	public void testSetReleaseCompany1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
//TotalPriceに関するテスト get
	@Test
	public void testGetTotalPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 9999999;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}
	@Test
	public void testGetTotalPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -9999999;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}
	@Test
	public void testGetTotalPrice4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try {
		     int postalMax = 10000000;
		     dto.setTotalPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testGetTotalPrice5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMin = -10000000;
	    	dto.setTotalPrice(postalMin);

	    }catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}

//set TotalPrice
	@Test
	public void testSetTotalPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testSetTotalPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 9999999;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}
	@Test
	public void testSetTotalPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -9999999;

		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}
	@Test
	public void testSetTotalPrice4() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try {
		     int postalMax = 10000000;
		     dto.setTotalPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testSetTotalPrice5() throws Exception {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
	    try{
	    	int postalMin = -10000000;
	    	dto.setTotalPrice(postalMin);

	    }catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}

//ImageFilePathに関するテスト get
	@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

//set ImageFilePath
	@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

}

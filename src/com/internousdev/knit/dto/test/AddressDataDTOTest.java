package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.knit.dto.AddressDataDTO;

public class AddressDataDTOTest {

	//idに関するテスト
		//getid
		@Test
		public void testGetId1() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = 0;
			dto.setId(expected);
			assertEquals(expected,dto.getId());
		}
		@Test
		public void testGetId2() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = 2147483647;

			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}
		@Test
		public void testGetId3() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = -2147483647;

			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		@Test
		public void testGetId4() throws Exception {
			AddressDataDTO dto = new AddressDataDTO();
		    try{
		    	int postalMax = Integer.parseInt("2147483648");
		    	dto.setId(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		    }
		}

		@Test
		public void testGetId5() throws Exception {
			AddressDataDTO dto = new AddressDataDTO();
		    try{
		    	int postalMax = Integer.parseInt("-2147483648");
		    	dto.setId(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		    }
		}

		//setid

		@Test
		public void testSetId1() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = 0;
			dto.setId(expected);
			assertEquals(expected,dto.getId());
		}
		@Test
		public void testSetId2() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = 2147483647;

			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}
		@Test
		public void testSetId3() {
			AddressDataDTO dto = new AddressDataDTO();
			int expected = -2147483647;

			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		@Test
		public void testSetId4() throws Exception {
			AddressDataDTO dto = new AddressDataDTO();
		    try{
		    	int postalMax = Integer.parseInt("2147483648");
		    	dto.setId(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		    }
		}

		@Test
		public void testSetId5() throws Exception {
			AddressDataDTO dto = new AddressDataDTO();
		    try{
		    	int postalMax = Integer.parseInt("-2147483648");
		    	dto.setId(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		    }
		}

		//ユーザーIDに関するテスト

		@Test
		public void testGetUserId1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "0";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId10() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId11() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId12() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//setユーザーID
		@Test
		public void testSetUserId1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "0";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetUserId2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetUserId3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetetUserId4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId10() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId11() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId12() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//姓に関するテスト
		//getFamilyName

		@Test
		public void testGetFamilyName1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//setFamilyName

		@Test
		public void testSetFamilyName1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//名に関するテスト
		//getFirstName

		@Test
		public void testGetFirstName1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//setFamilyName

		@Test
		public void testSetFirstName1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//姓(かな)に関するテスト
		//GetFamilyNameKana

		@Test
		public void testGetFamilyNameKana1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		//setFamilyNameKana

		@Test
		public void testSetFamilyNameKana1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		//名(かな)に関するテスト
		//getFirstNameKana
		@Test
		public void testGetFirstNameKana1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		//setFamilyNameKana

		@Test
		public void testSetFirstNameKana1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		//メールアドレスに関するテスト
		//getEmail

		@Test
		public void testGetEmail1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//setEmail

		@Test
		public void testSetEmail1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//電話番号に関するテスト
		//getTelNumber

		@Test
		public void testGetTelNumber1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		//setTelNumber

		@Test
		public void testSetTelNumber1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		//ユーザーアドレスに関するテスト
		//getUserAddress
		@Test
		public void testGetUserAddress1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		//setTelUserAddress

		@Test
		public void testSetUserAddress1() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress2() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress3() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress4() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress5() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress6() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress7() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress8() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress9() {
			AddressDataDTO dto = new AddressDataDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		//登録日に関するテスト
		//getRegistDate

		@Test
		public void testGetRegistDate1() {
			AddressDataDTO dto = new AddressDataDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();

			assertEquals(expected,actual);
		}


		public void testGetRegistDate2() throws ParseException {
			AddressDataDTO dto = new AddressDataDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected =  sdf.parse("20180220 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());

		}


		//setRegistDate

		@Test
		public void testSetRegistDate1() {
			AddressDataDTO dto = new AddressDataDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();

			assertEquals(expected,actual);

		}
		public void testSetRegistDate2() throws ParseException {
			AddressDataDTO dto = new AddressDataDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected =  sdf.parse("20180220 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());

		}


		//更新日に関するテスト
		//getUpdateDate

		@Test
		public void testGetUpdateDate1() {
			AddressDataDTO dto = new AddressDataDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();

			assertEquals(expected,actual);
		}


		public void testGetUpdateDate2() throws ParseException {
			AddressDataDTO dto = new AddressDataDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected =  sdf.parse("20180220 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());

		}


		//setUpdateDate

		@Test
		public void testSetUpdateDate1() {
			AddressDataDTO dto = new AddressDataDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();

			assertEquals(expected,actual);

		}
		public void testSetUpdateDate2() throws ParseException {
			AddressDataDTO dto = new AddressDataDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected =  sdf.parse("20180220 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());

		}


	/*@Test
	public void testGetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUserAddress() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserAddress() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUpdateDate() {
		fail("まだ実装されていません");
	}
	*/

}

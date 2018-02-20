package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.SettlementConfirmDTO;

public class SettlementConfirmDTOTest {

	//idに関するテスト
	//getid

	@Test
	public void testGetId1() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() throws Exception {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetId5() throws Exception {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

	//setId
	@Test
	public void testSetId1() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId2() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId3() {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId4() throws Exception {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetId5() throws Exception {
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

	//ユーザーIDに関するテスト
	//getUserId

		@Test
		public void testGetUserId1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "0";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testGetUserId4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId10() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId11() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserId12() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//setユーザーID

		@Test
		public void testSetUserId1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "0";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetUserId2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetUserId3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			assertEquals(expected, dto.getUserId());
		}

		@Test
		public void testSetetUserId4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId10() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId11() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserId12() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//姓に関するテスト
		//getFamilyName

		@Test
		public void testGetFamilyName1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//setFamilyName

		@Test
		public void testSetFamilyName1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//名に関するテスト
		//getFirstName

		@Test
		public void testGetFirstName1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//setFamilyName

		@Test
		public void testSetFirstName1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//姓(かな)に関するテスト
		//GetFamilyNameKana

		@Test
		public void testGetFamilyNameKana1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyNameKana9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		//setFamilyNameKana

		@Test
		public void testSetFamilyNameKana1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyNameKana9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		//名(かな)に関するテスト
		//getFirstNameKana
		@Test
		public void testGetFirstNameKana1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstNameKana9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		//setFamilyNameKana

		@Test
		public void testSetFirstNameKana1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		//メールアドレスに関するテスト
		//getEmail

		@Test
		public void testGetEmail1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//setEmail

		@Test
		public void testSetEmail1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//電話番号に関するテスト
		//getTelNumber

		@Test
		public void testGetTelNumber1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		//setTelNumber

		@Test
		public void testSetTelNumber1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		//ユーザーアドレスに関するテスト
		//getUserAddress
		@Test
		public void testGetUserAddress1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetUserAddress9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		//setTelUserAddress

		@Test
		public void testSetUserAddress1() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress2() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress3() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress4() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress5() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress6() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress7() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress8() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetUserAddress9() {
			SettlementConfirmDTO dto = new SettlementConfirmDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}

	/*
	@Test
	public void testGetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetId() {
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
	public void testGetUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserId() {
		fail("まだ実装されていません");
	}	*/

}

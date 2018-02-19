package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.LoginDTO;

public class LoginDTOTest {

	//testGetUserId
	@Test
	public void testGetUserId1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//testSetUserId
	@Test
	public void testSetUserId1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//testGetPassword
	@Test
	public void testGetPassword1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testGetPassword2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testGetPassword3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testGetPassword4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	//testSetPassword
	@Test
	public void testSetPassword1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testSetPassword2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testSetPassword3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}
	@Test
	public void testSetPassword4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	//testGetFamilyName
	@Test
	public void testGetFamilyName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testGetFamilyName2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testGetFamilyName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testGetFamilyName4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//testSetFamilyName
	@Test
	public void testSetFamilyName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testSetFamilyName2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testSetFamilyName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}
	@Test
	public void testSetFamilyName4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	//testGetFirstName
	@Test
	public void testGetFirstName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//testSetFirstName
	@Test
	public void testSetFirstName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	//testGetFamilyNameKana
	@Test
	public void testGetFamilyNameKana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testGetFamilyNameKana2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testGetFamilyNameKana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testGetFamilyNameKana4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	//testSetFamilyNameKana
	@Test
	public void testSetFamilyNameKana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testSetFamilyNameKana2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testSetFamilyNameKana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}
	@Test
	public void testSetFamilyNameKana4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	//testGetFirstNameKana
	@Test
	public void testGetFirstNameKana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testGetFirstNameKana2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testGetFirstNameKana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testGetFirstNameKana4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	//testSetFirstNameKana
	@Test
	public void testSetFirstNameKana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testSetFirstNameKana2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testSetFirstNameKana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}
	@Test
	public void testSetFirstNameKana4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	//testGetEmail
	@Test
	public void testGetEmail1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//testSetEmail
	@Test
	public void testSetEmail1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	//testGetAdminFlg
	@Test
	public void testGetAdminFlg1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testGetAdminFlg2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testGetAdminFlg3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testGetAdminFlg4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAdminFlg7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAdminFlg11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAdminFlg12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}

	//testSetAdminFlg
	@Test
	public void testSetAdminFlg1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testSetAdminFlg2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testSetAdminFlg3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setAdminFlg(expected);
		assertEquals(expected, dto.getAdminFlg());
	}
	@Test
	public void testSetAdminFlg4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAdminFlg7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAdminFlg12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAdminFlg(expected);
		String actual = dto.getAdminFlg();
		assertEquals(expected, actual);
	}
}

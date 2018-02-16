package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.ResetPasswordDTO;

public class ResetPasswordDTOTest {

	//ユーザーIDに関するテスト
	//getLoginID
	@Test
	public void testGetLoginId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	//setLoginID

	@Test
	public void testSetLoginId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	//新規パスワードに関するテスト
	//getPassword


	@Test
	public void testGetNewPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	//setNewPassword

	@Test
	public void testSetNewPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	//確認用パスワードに関するテスト
	//conPassword

	@Test
	public void testGetConPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetConPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	//setConPassword

	@Test
	public void testSetConPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetConPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	//hideログインIDに関するテスト
	//getHideUserId
	@Test
	public void testGetHideUserId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testGetHideUserId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testGetHideUserId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testGetHideUserId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideUserId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideUserId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}

	//setHideUserId

	@Test
	public void testSetHideUserId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testSetHideUserId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testSetHideUserId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setHideUserId(expected);
		assertEquals(expected, dto.getHideUserId());
	}
	@Test
	public void testSetHideUserId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideUserId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideUserId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHideUserId(expected);
		String actual = dto.getHideUserId();
		assertEquals(expected, actual);
	}

	//hideパスワードに関するテスト
	//getHideNewLoginPassword

	@Test
	public void testGetHideNewLoginPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testGetHideNewLoginPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testGetHideNewLoginPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testGetHideNewLoginPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHideNewLoginPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}

	//setHideNewLoginPassword

	@Test
	public void testSetHideNewLoginPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "0";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testSetHideNewLoginPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "2147483647";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testSetHideNewLoginPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "-2147483647";

		dto.setHideNewLoginPassword(expected);
		assertEquals(expected, dto.getHideNewLoginPassword());
	}
	@Test
	public void testSetHideNewLoginPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "　";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHideNewLoginPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();
		assertEquals(expected, actual);
	}

/*
	@Test
	public void testSetLoginId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetNewPassword() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetNewPassword() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetConPassword() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetConPassword() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetHideUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetHideUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetHideNewLoginPassword() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetHideNewLoginPassword() {
		fail("まだ実装されていません");
	}*/

}

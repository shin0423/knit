package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.MyPageDTO;

public class MyPageDTOTest {

//FirstNameに関するテスト get
	@Test
	public void testGetFirstName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

//set FirstName
	@Test
	public void testSetFirstName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
//FamilyNameKanaに関するテスト
	@Test
	public void testGetFamilyNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKanae3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKanae7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

//set FamilyNameKana
	@Test
	public void testSetFamilyNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKanae3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKanae7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

//FirstNameKanaに関するテスト
	@Test
	public void testGetFirstNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKanae3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

//set FirstNameKana
	@Test
	public void testSetFirstNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKanae3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

//sexに関するテスト get
	@Test
	public void testIsSex1() {
		MyPageDTO dto = new MyPageDTO();
		boolean expected = true;

		dto.setSex(expected);
		boolean actual=dto.isSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsSex2() {
		MyPageDTO dto = new MyPageDTO();
		boolean expected = false;

		dto.setSex(expected);
		boolean actual=dto.isSex();
		assertEquals(expected, actual);
	}

//Emailに関するテスト get
	@Test
	public void testGetEmail1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

//set Email
	@Test
	public void testSetEmail1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

//RegistDateに関するテスト get
	@Test
	public void testGetRegistDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

//set RegistDate
	@Test
	public void testSetRegistDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testSetRegistDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

//UserIdに関するテスト get
	@Test
	public void testGetUserId1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

//set UserID
	@Test
	public void testSetUserId1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

//Passwordに関するテスト get
	@Test
	public void testGetPassword1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

//set Password
	@Test
	public void testSetPassword1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

//FamilyNameに関するテスト get
	@Test
	public void testGetFamilyName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

//set FamilyName
	@Test
	public void testSetFamilyName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

//UpdateDateに関するテスト get
	@Test
	public void testGetUpdateDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

//set UpdateDate
	@Test
	public void testSetUpdateDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

}

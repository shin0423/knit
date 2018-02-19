package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.UserUpdateDTO;

public class UserUpdateDTOTest {
//ユーザーIDに関するテスト
 //getter
	@Test
	public void testGetLoginId1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testGetLoginId4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLoginId11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

 //setter
	@Test
	public void testSetLoginId1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}
	@Test
	public void testSetLoginId4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLoginId12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();
		assertEquals(expected, actual);
	}
//現在のパスワードに関するテスト
 //getter
		@Test
		public void testGetPassword1() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "0";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testGetPassword2() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testGetPassword3() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testGetPassword4() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword5() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword6() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetPassword7() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword8() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword9() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword10() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword11() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword12() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

	 //setter

		@Test
		public void testSetPassword1() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "0";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testSetPassword2() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testSetPassword3() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			assertEquals(expected, dto.getPassword());
		}
		@Test
		public void testSetPassword4() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword5() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword6() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetPassword7() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword8() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword9() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword10() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword11() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword12() {
			UserUpdateDTO dto = new UserUpdateDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

//新規パスワードに関するテスト
 //getter
	@Test
	public void testGetNewPassword1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testGetNewPassword4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetNewPassword12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

 //setter

	@Test
	public void testSetNewPassword1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setNewPassword(expected);
		assertEquals(expected, dto.getNewPassword());
	}
	@Test
	public void testSetNewPassword4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetNewPassword12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

//確認用パスワードに関するテスト
 //getter

	@Test
	public void testGetConPassword1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testGetConPassword4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetConPassword7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetConPassword12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

 //setter

	@Test
	public void testSetConPassword1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setConPassword(expected);
		assertEquals(expected, dto.getConPassword());
	}
	@Test
	public void testSetConPassword4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetConPassword7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetConPassword12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setConPassword(expected);
		String actual = dto.getConPassword();
		assertEquals(expected, actual);
	}

//電話番号に関するテスト
 //getter
	@Test
	public void testGetTelNumber1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testGetTelNumber2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testGetTelNumber3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testGetTelNumber4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

 //setter
	@Test
	public void testSetTelNumber1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testSetTelNumber2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testSetTelNumber3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setTelNumber(expected);
		assertEquals(expected, dto.getTelNumber());
	}
	@Test
	public void testSetTelNumber4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

//住所に関するテスト
 //getter
	@Test
	public void testGetUserAddress1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testGetUserAddress2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testGetUserAddress3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testGetUserAddress4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserAddress11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

 //setter
	@Test
	public void testSetUserAddress1() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testSetUserAddress2() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testSetUserAddress3() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setUserAddress(expected);
		assertEquals(expected, dto.getUserAddress());
	}
	@Test
	public void testSetUserAddress4() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress5() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress6() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress7() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress8() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress9() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress10() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress11() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserAddress12() {
		UserUpdateDTO dto = new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
}

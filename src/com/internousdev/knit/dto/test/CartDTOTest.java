package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.internousdev.knit.dto.CartDTO;

public class CartDTOTest {

	//カートIDに関するテスト get
	@Test
	public void testGetId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetId5() throws Exception {
		CartDTO dto = new CartDTO();
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
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId4() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetId5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}


	//ユーザーIDに関するテスト get
	@Test
	public void testGetUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//setユーザーID
	@Test
	public void testSetUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetetUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	//ゲストユーザーIDに関するテスト get
	@Test
	public void testGetTempUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setTempUserId(expected);
		assertEquals(expected, dto.getTempUserId());
	}

	@Test
	public void testGetTempUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setTempUserId(expected);

		assertEquals(expected, dto.getTempUserId());
	}

	@Test
	public void testGetTempUserId3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setTempUserId(expected);

		assertEquals(expected, dto.getTempUserId());
	}

	@Test
	public void testGetTempUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//setゲストユーザーID
		@Test
		public void testSetTempUserId1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setTempUserId(expected);
			assertEquals(expected, dto.getTempUserId());
		}

		@Test
		public void testSetTempUserId2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setTempUserId(expected);

			assertEquals(expected, dto.getTempUserId());
		}

		@Test
		public void testSetTempUserId3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setTempUserId(expected);

			assertEquals(expected, dto.getTempUserId());
		}

		@Test
		public void testSetTempUserId4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTempUserId12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTempUserId(expected);
			String actual = dto.getTempUserId();
			assertEquals(expected, actual);
		}


//商品IDに関するテスト get
	@Test
	public void testGetItemId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetProductId4() throws Exception {
		CartDTO dto = new CartDTO();
	    try {
	    	String postalMax = "2147483648";
	    	dto.setTempUserId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetProductId5() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     String postalMin = "-2147483649";
		     dto.setTempUserId(postalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//set商品ID
		@Test
		public void testSetItemId1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setItemId(expected);
			assertEquals(expected, dto.getItemId());
		}

		@Test
		public void testSetItemId2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setItemId(expected);
			assertEquals(expected, dto.getItemId());
		}

		@Test
		public void testSetItemId3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setItemId(expected);
			assertEquals(expected, dto.getItemId());
		}

		@Test
		public void testSetProductId4() throws Exception {
			CartDTO dto = new CartDTO();
		    try {
		    	String postalMax = "2147483648";
		    	dto.setTempUserId(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		    }
		}

		@Test
		public void testSetProductId5() throws Exception {
			CartDTO dto = new CartDTO();
			try {
			     String postalMin = "-2147483649";
			     dto.setTempUserId(postalMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

	//商品在庫に関するテスト get
	@Test
	public void testGetItemCount1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setItemCount(expected);
		assertEquals(expected, dto.getItemCount());
	}

	@Test
	public void testGetItemCount4() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetItemCount5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemCount(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

	//set商品在庫
		@Test
		public void testSetItemCount1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setItemCount(expected);
			assertEquals(expected, dto.getItemCount());
		}

		@Test
		public void testSetItemCount2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setItemCount(expected);
			assertEquals(expected, dto.getItemCount());
		}

		@Test
		public void testSetItemCount3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setItemCount(expected);
			assertEquals(expected, dto.getItemCount());
		}

		@Test
		public void testSetItemCount4() throws Exception {
			CartDTO dto = new CartDTO();
		    try{
		    	int postalMax = Integer.parseInt("2147483648");
		    	dto.setItemCount(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		    }
		}

		@Test
		public void testSetItemCount5() throws Exception {
			CartDTO dto = new CartDTO();
		    try{
		    	int postalMax = Integer.parseInt("-2147483648");
		    	dto.setItemCount(postalMax);

		    } catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		    }
		}

//商品名に関するテスト get
	@Test
	public void testGetItemName1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	//set商品名
		@Test
		public void testSetItemName1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setItemName(expected);
			assertEquals(expected, dto.getItemName());
		}

		@Test
		public void testSetItemName2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setItemName(expected);
			assertEquals(expected, dto.getItemName());
		}

		@Test
		public void testSetItemName3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setItemName(expected);
			assertEquals(expected, dto.getItemName());
		}

		@Test
		public void testSetItemName4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemName12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setItemName(expected);
			String actual = dto.getItemName();
			assertEquals(expected, actual);
		}


//商品名かなに関してのテスト get
	@Test
	public void testGetItemNameKana1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	//get商品名かな
		@Test
		public void testSetItemNameKana1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setItemNameKana(expected);
			assertEquals(expected, dto.getItemNameKana());
		}

		@Test
		public void testSetItemNameKana2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setItemNameKana(expected);
			assertEquals(expected, dto.getItemNameKana());
		}

		@Test
		public void testSetItemNameKana3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setItemNameKana(expected);
			assertEquals(expected, dto.getItemNameKana());
		}

		@Test
		public void testSetItemNameKana4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetItemNameKana12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setItemNameKana(expected);
			String actual = dto.getItemNameKana();
			assertEquals(expected, actual);
		}

//イメージファイルパスに関するテスト get

	@Test
	public void testGetImageFilePath1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//setイメージファイルパス
	@Test
	public void testSetImageFilePath1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
//イメージファイル名に関するテスト get

	@Test
	public void testGetImageFileName1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//setイメージファイル名

		@Test
		public void testSetImageFileName1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setImageFileName(expected);
			assertEquals(expected, dto.getImageFileName());
		}

		@Test
		public void testSetImageFileName2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setImageFileName(expected);
			assertEquals(expected, dto.getImageFileName());
		}

		@Test
		public void testSetImageFileName3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setImageFileName(expected);
			assertEquals(expected, dto.getImageFileName());
		}

		@Test
		public void testSetImageFileName4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

//商品価格に関するテスト get
	@Test
	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 9999999;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -9999999;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMax = 10000000;
		     dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMin = -10000000;
	    	dto.setPrice(postalMin);

	    }catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}

	//set商品価格
	@Test
	public void testSetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 9999999;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -9999999;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMax = 10000000;
		     dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMin = -10000000;
	    	dto.setPrice(postalMin);

	    }catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}

//発売会社に関するテスト get
	@Test
	public void testGetReleaseCompany1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//set発売会社
	@Test
	public void testSetReleaseCompany1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

//発売年月に関するテスト get
	@Test
	public void testGetReleaseDate1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	//set発売年月
	@Test
	public void testSetReleaseDate1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate2() {
		CartDTO dto = new CartDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate3() {
		CartDTO dto = new CartDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate4() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate5() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate6() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate7() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate8() {
		CartDTO dto = new CartDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate9() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate10() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate11() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate12() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	//登録日に関するテスト
		@Test
		public void testGetRegistDate1() {
			CartDTO dto = new CartDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();

			assertEquals(expected,actual);
		}

	//更新日に関するテスト
		@Test
		public void testGetUpdateDate1() {
			CartDTO dto = new CartDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();

			assertEquals(expected,actual);
		}

//合計に関するテスト get
		@Test
		public void testGetTotal1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}

		@Test
		public void testGetTotal2() {
			CartDTO dto = new CartDTO();
			int expected = 9999999;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}
		@Test
		public void testGetTotal3() {
			CartDTO dto = new CartDTO();
			int expected = -9999999;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}
		@Test
		public void testGetTotal4() throws Exception {
			CartDTO dto = new CartDTO();
			try {
			     int postalMax = 10000000;
			     dto.setTotal(postalMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
			}
		}
		@Test
		public void testGetTotal5() throws Exception {
			CartDTO dto = new CartDTO();
		    try{
		    	int postalMin = -10000000;
		    	dto.setTotal(postalMin);

		    }catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		    }
		}

		//setトータル
		@Test
		public void testSetTotal1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}

		@Test
		public void testSetTotal2() {
			CartDTO dto = new CartDTO();
			int expected = 9999999;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}
		@Test
		public void testSetTotal3() {
			CartDTO dto = new CartDTO();
			int expected = -9999999;

			dto.setTotal(expected);
			assertEquals(expected, dto.getTotal());
		}
		@Test
		public void testSetTotal4() throws Exception {
			CartDTO dto = new CartDTO();
			try {
			     int postalMax = 10000000;
			     dto.setTotal(postalMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
			}
		}
		@Test
		public void testSetTotal5() throws Exception {
			CartDTO dto = new CartDTO();
		    try{
		    	int postalMin = -10000000;
		    	dto.setTotal(postalMin);

		    }catch (RuntimeException e) {
		    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		    }
		}
}
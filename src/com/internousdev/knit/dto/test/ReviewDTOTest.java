package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.ReviewDTO;

public class ReviewDTOTest {

	//testGetLoginId
	@Test
	public void testGetUserId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testGetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//tstSetLoginId

	@Test
	public void testSetUserId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}
	@Test
	public void testSetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//testGetItemId
	@Test
	public void testGetItemId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testGetItemId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testGetItemId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testGetItemId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetItemId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}

	//testSetItemId

	@Test
	public void testSetItemId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testSetItemId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testSetItemId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}
	@Test
	public void testSetItemId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetItemId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemId(expected);
		String actual = dto.getItemId();
		assertEquals(expected, actual);
	}

	//testGetReviewBody
	@Test
	public void testGetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testGetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testGetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testGetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewBody11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	//testSetReviewBody

	@Test
	public void testSetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testSetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testSetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setReviewBody(expected);
		assertEquals(expected, dto.getReviewBody());
	}
	@Test
	public void testSetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewBody12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	//testGetReviewStar
	@Test
	public void testGetReviewStar1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testGetReviewStar2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testGetReviewStar3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testGetReviewStar4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewStar7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReviewStar11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewStar12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}

	//testSetReviewStar

	@Test
	public void testSetReviewStar1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testSetReviewStar2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testSetReviewStar3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setReviewStar(expected);
		assertEquals(expected, dto.getReviewStar());
	}
	@Test
	public void testSetReviewStar4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewStar7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReviewStar12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewStar(expected);
		String actual = dto.getReviewStar();
		assertEquals(expected, actual);
	}

	//testGetFirstName
	@Test
	public void testGetFirstName1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testGetFirstName4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//testSetFirstName

	@Test
	public void testSetFirstName1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}
	@Test
	public void testSetFirstName4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//testGetInsertDate
	@Test
	public void testGetInsertDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testGetInsertDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testGetInsertDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testGetInsertDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetInsertDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetInsertDate12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	//testSetInsertDate

	@Test
	public void testSetInsertDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testSetInsertDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testSetInsertDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testSetInsertDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetInsertDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	//testGetReview
	@Test
	public void testGetReview1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}
	@Test
	public void testGetReview2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}
	@Test
	public void testGetReview3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}

	//testSetReview

	@Test
	public void testSetReview1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}
	@Test
	public void testSetReview2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}
	@Test
	public void testSetReview3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setReview(expected);
		assertEquals(expected, dto.getReview());
	}


}

package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.CategoryDTO;

public class CategoryDTOTest {
	//id に関するテスト

	@Test
	public void testGetId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}
	@Test
	public void testGetId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}
	@Test
	public void testGetId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}
	@Test
	public void testGetId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetId12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testSetId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}
	@Test
	public void testSetId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}
	@Test
	public void testSetId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetId12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);

	}

	//CategoryIdに関するテスト

	@Test
	public void testGetCategoryId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());

	}
	@Test
	public void testGetCategoryId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());

	}
	@Test
	public void testGetCategoryId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());

	}
	@Test
	public void testGetCategoryId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryId12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetCategoryId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());
	}
	@Test
	public void testSetCategoryId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());

	}
	@Test
	public void testSetCategoryId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryId(expected);
		assertEquals(expected,dto.getCategoryId());

	}
	@Test
	public void testSetCategoryId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryId12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);

	}

	//CategoryNameに関するテスト

	@Test
	public void testGetCategoryName1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());

	}
	@Test
	public void testGetCategoryName2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());

	}
	@Test
	public void testGetCategoryName3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());

	}
	@Test
	public void testGetCategoryName4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryName12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetCategoryName1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());
	}
	@Test
	public void testSetCategoryName2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());

	}
	@Test
	public void testSetCategoryName3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		assertEquals(expected,dto.getCategoryName());

	}
	@Test
	public void testSetCategoryName4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryName12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected,actual);

	}

	//CategoryDescriptionに関するテスト

	@Test
	public void testGetCategoryDescription1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());

	}
	@Test
	public void testGetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());

	}
	@Test
	public void testGetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());

	}
	@Test
	public void testGetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testGetCategoryDescription12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetCategoryDescription1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());
	}
	@Test
	public void testSetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());

	}
	@Test
	public void testSetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		assertEquals(expected,dto.getCategoryDescription());

	}
	@Test
	public void testSetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}
	@Test
	public void testSetCategoryDescription12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected,actual);

	}



}

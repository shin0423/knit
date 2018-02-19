package com.internousdev.knit.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.knit.dto.BuyItemDTO;

public class BuyItemDTOTest {

//ItemIdに関するテスト get
	@Test
	public void testGetItemId1() {
		BuyItemDTO dto = new BuyItemDTO();
		int expected = 0;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId2() {
		BuyItemDTO dto = new BuyItemDTO();
		int expected = 2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId3() {
		BuyItemDTO dto = new BuyItemDTO();
		int expected = -2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testGetItemId4() throws Exception {
		BuyItemDTO dto = new BuyItemDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testGetId5() throws Exception {
		BuyItemDTO dto = new BuyItemDTO();
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
		BuyItemDTO dto = new BuyItemDTO();
		int expected = 0;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId2() {
		BuyItemDTO dto = new BuyItemDTO();
		int expected = 2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId3() {
		BuyItemDTO dto = new BuyItemDTO();
		int expected = -2147483647;

		dto.setItemId(expected);
		assertEquals(expected, dto.getItemId());
	}

	@Test
	public void testSetItemId4() throws Exception {
		BuyItemDTO dto = new BuyItemDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	@Test
	public void testSetId5() throws Exception {
		BuyItemDTO dto = new BuyItemDTO();
	    try{
	    	int postalMax = Integer.parseInt("-2147483648");
	    	dto.setItemId(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
	    }
	}

//ItemNameに関するテスト get

	@Test
	public void testGetItemName1() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "0";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName2() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName3() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "-2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testGetItemName4() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "null";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName5() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName6() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = " ";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName7() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "　";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName8() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName9() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName10() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName11() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemName12() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

//set ItemName
	@Test
	public void testSetItemName1() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "0";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testSetItemName2() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
		}

	@Test
	public void testSetItemName3() {
	BuyItemDTO dto = new BuyItemDTO();
		String expected = "-2147483647";

		dto.setItemName(expected);
		assertEquals(expected, dto.getItemName());
	}

	@Test
	public void testSetItemName4() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "null";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName5() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName6() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = " ";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName7() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "　";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName8() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName9() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName10() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName11() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName12() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemName(expected);
		String actual = dto.getItemName();
		assertEquals(expected, actual);
	}

//ItemNameKanaに関するテスト get

	@Test
	public void testGetItemNameKana1() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "0";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana2() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana3() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "-2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testGetItemNameKana4() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "null";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana5() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana6() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = " ";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana7() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "　";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana8() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana9() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana10() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana11() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemNameKana12() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

//set ItemNameKana
	@Test
	public void testSetItemNameKana1() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "0";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana2() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana3() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "-2147483647";

		dto.setItemNameKana(expected);
		assertEquals(expected, dto.getItemNameKana());
	}

	@Test
	public void testSetItemNameKana4() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "null";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana5() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana6() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = " ";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana7() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "　";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana8() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana9() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana10() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana11() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemNameKana12() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setItemNameKana(expected);
		String actual = dto.getItemNameKana();
		assertEquals(expected, actual);
	}

//itemDescriptionに関するテスト get

	@Test
	public void testGetItemDescription1() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "0";

		dto.setItemDescription(expected);
		assertEquals(expected, dto.getItemDescription());
	}

	@Test
	public void testGetItemDescription2() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "2147483647";

		dto.setItemDescription(expected);
		assertEquals(expected, dto.getItemDescription());
	}

	@Test
	public void testGetItemDescription3() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "-2147483647";

		dto.setItemDescription(expected);
		assertEquals(expected, dto.getItemDescription());
	}

	@Test
	public void testGetItemDescription4() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "null";

		dto.setItemDescription(expected);
		String actual = dto.getItemDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemDescription5() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "";

		dto.setItemDescription(expected);
		String actual = dto.getItemDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemDescription6() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = " ";

		dto.setItemDescription(expected);
		String actual = dto.getItemDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemDescription7() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "　";

		dto.setItemDescription(expected);
		String actual = dto.getItemDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetItemDescription8() {
		BuyItemDTO dto = new BuyItemDTO();
		String expected = "abc123";

		dto.setItemDescription(expected);
		String actual = dto.getItemDescription();
		assertEquals(expected, actual);
	}

			@Test
			public void testGetItemDescription9() {
				BuyItemDTO dto = new BuyItemDTO();
				String expected = "あいう１２３";

				dto.setItemDescription(expected);
				String actual = dto.getItemDescription();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetItemDescription10() {
				BuyItemDTO dto = new BuyItemDTO();
				String expected = "abc123あいう１２３";

				dto.setItemDescription(expected);
				String actual = dto.getItemDescription();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetItemDescription11() {
				BuyItemDTO dto = new BuyItemDTO();
				String expected = "abc123あいう１２３漢字";

				dto.setItemDescription(expected);
				String actual = dto.getItemDescription();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetItemDescription12() {
				BuyItemDTO dto = new BuyItemDTO();
				String expected = "ａｂｃあいう１２３漢字";

				dto.setItemDescription(expected);
				String actual = dto.getItemDescription();
				assertEquals(expected, actual);
			}

//set ItemDescription
				@Test
				public void testSetItemDescription1() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "0";

					dto.setItemDescription(expected);
					assertEquals(expected, dto.getItemDescription());
				}

				@Test
				public void testSetItemDescription2() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "2147483647";

					dto.setItemNameKana(expected);
					assertEquals(expected, dto.getItemNameKana());
				}

				@Test
				public void testSetItemDescription3() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "-2147483647";

					dto.setItemDescription(expected);
					assertEquals(expected, dto.getItemDescription());
				}

				@Test
				public void testSetItemDescription4() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "null";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription5() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription6() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = " ";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription7() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "　";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription8() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "abc123";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription9() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "あいう１２３";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription10() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "abc123あいう１２３";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription11() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "abc123あいう１２３漢字";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

				@Test
				public void testSetItemDescription12() {
					BuyItemDTO dto = new BuyItemDTO();
					String expected = "ａｂｃあいう１２３漢字";

					dto.setItemDescription(expected);
					String actual = dto.getItemDescription();
					assertEquals(expected, actual);
				}

//categoryIdに関するテスト get
			@Test
			public void testGetCategoryId1() {
				BuyItemDTO dto = new BuyItemDTO();
				int expected = 0;

				dto.setCategoryId(expected);
				assertEquals(expected, dto.getCategoryId());
			}

			@Test
			public void testGetCategoryId2() {
				BuyItemDTO dto = new BuyItemDTO();
				int expected = 2147483647;

				dto.setCategoryId(expected);
				assertEquals(expected, dto.getCategoryId());
			}

			@Test
			public void testGetCategoryId3() {
				BuyItemDTO dto = new BuyItemDTO();
				int expected = -2147483647;

				dto.setCategoryId(expected);
				assertEquals(expected, dto.getCategoryId());
			}

			@Test
			public void testGetCategoryId4() throws Exception {
				BuyItemDTO dto = new BuyItemDTO();
				   try{
			     	int postalMax = Integer.parseInt("2147483648");
				    	dto.setCategoryId(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
				    }
				}

				@Test
				public void testGetCategoryId5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("-2147483648");
				    	dto.setCategoryId(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
				    }
				}

				//set CategoryId
				@Test
				public void testSetCategoryId1() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 0;

					dto.setCategoryId(expected);
					assertEquals(expected, dto.getCategoryId());
				}

				@Test
				public void testSetCategoryId2() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 2147483647;

					dto.setCategoryId(expected);
					assertEquals(expected, dto.getCategoryId());
				}

				@Test
				public void testSetCategoryId3() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = -2147483647;

					dto.setCategoryId(expected);
					assertEquals(expected, dto.getCategoryId());
				}

				@Test
				public void testSetCategoryId4() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("2147483648");
				    	dto.setCategoryId(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
				    }
				}

				@Test
				public void testSetCategoryId5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("-2147483648");
				    	dto.setCategoryId(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
				    }
				}

//Priceに関するテスト get
				@Test
				public void testGetPrice1() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 0;

					dto.setPrice(expected);
					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testGetPrice2() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 9999999;

					dto.setPrice(expected);

					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testGetPrice3() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = -9999999;

					dto.setPrice(expected);

					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testGetPrice4() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
					try {
					     int postalMax = 10000000;
					     dto.setPrice(postalMax);

					} catch (RuntimeException e) {
						assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
					}
				}
				@Test
				public void testGetPrice5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMin = -10000000;
				    	dto.setPrice(postalMin);

				    }catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				    }
				}
//set Price
				@Test
				public void testSetPrice1() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 0;

					dto.setPrice(expected);
					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testSetPrice2() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 9999999;

					dto.setPrice(expected);

					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testSetPrice3() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = -9999999;

					dto.setPrice(expected);

					assertEquals(expected, dto.getPrice());
				}
				@Test
				public void testSetPrice4() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
					try {
					     int postalMax = 10000000;
					     dto.setPrice(postalMax);

					} catch (RuntimeException e) {
						assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
					}
				}
				@Test
				public void testSetPrice5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMin = -10000000;
				    	dto.setPrice(postalMin);

				    }catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				    }
				}

//itemStockに関するテスト get
				@Test
				public void testGetItemStock1() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 0;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testGetItemStock2() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 2147483647;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testGetItemStock3() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = -2147483647;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testGetItemStock4() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("2147483648");
				    	dto.setItemStock(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
				    }
				}

				@Test
				public void testGetItemStock5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("-2147483648");
				    	dto.setItemStock(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
				    }
				}
//set ItemStock
				@Test
				public void testSetItemStock1() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 0;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testSetItemStock2() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = 2147483647;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testSetItemStock3() {
					BuyItemDTO dto = new BuyItemDTO();
					int expected = -2147483647;

					dto.setItemStock(expected);
					assertEquals(expected, dto.getItemStock());
				}

				@Test
				public void testSetItemStock4() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("2147483648");
				    	dto.setItemStock(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
				    }
				}

				@Test
				public void testSetItemStock5() throws Exception {
					BuyItemDTO dto = new BuyItemDTO();
				    try{
				    	int postalMax = Integer.parseInt("-2147483648");
				    	dto.setItemStock(postalMax);

				    } catch (RuntimeException e) {
				    	assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
				    }
				}





	@Test
	public void testGetItemStock() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemStock() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetItemImagePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemImagePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetItemImageName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemImageName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetItemNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetItemNameKana() {
		fail("まだ実装されていません");
	}

}

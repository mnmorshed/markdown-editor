package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HeaderConverterTest {
	
	private HeaderConverter converter = new HeaderConverter();

	@Test
	void testConvert_Header_1() {
		String input = "# Heading 1";
		String expected = "<h1>Heading 1</h1>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void testConvert_Header_2() {
		String input = "## Heading 2";
		String expected = "<h2>Heading 2</h2>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_Header_3() {
		String input = "### Heading 3";
		String expected = "<h3>Heading 3</h3>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_Header_4() {
		String input = "#### Heading 4";
		String expected = "<h4>Heading 4</h4>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_Header_5() {
		String input = "##### Heading 5";
		String expected = "<h5>Heading 5</h5>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_Header_6() {
		String input = "###### Heading 6";
		String expected = "<h6>Heading 6</h6>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_Header_7() {
		String input = "####### Heading 7";
		String expected = "<p>####### Heading 7</p>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_No_Header() {
		String input = "No Heading";
		String expected = "<p>No Heading</p>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
}

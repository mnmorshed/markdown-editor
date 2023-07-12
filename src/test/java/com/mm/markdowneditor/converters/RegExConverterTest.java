package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RegExConverterTest {

	private static final String PATTERN = "\\[([^\\[]+)\\]\\(([^\\)]+)\\)";
	private static final String REPLACEMENT = "<a href=\"$2\">$1</a>";

	RegExConverter converter = new RegExConverter(PATTERN, REPLACEMENT);

	@Test
	void testRegExConverter() {
		assertThat(new RegExConverter(PATTERN, REPLACEMENT)).isNotNull();
	}

	@Test
	void testConvert_Matching() {
		String input = "[Link text](https://www.example.com)";
		String expected = "<a href=\"https://www.example.com\">Link text</a>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_NonMatching() {
		String invaludInput = "[Link text]   (https://www.example.com)";
		String actual = converter.convert(invaludInput);
		
		assertThat(actual).isEqualTo(invaludInput);
	}

}

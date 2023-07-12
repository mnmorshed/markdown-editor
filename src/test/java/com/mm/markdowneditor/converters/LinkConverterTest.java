package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LinkConverterTest {
	
	LinkConverter converter = new LinkConverter();

	@Test
	void testConvert_Valid() {
		String input = "[Link text](https://www.example.com)";
		String expected = "<a href=\"https://www.example.com\">Link text</a>";
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testConvert_InValid() {
		String invaludInput = "[Link text]   (https://www.example.com)";
		String actual = converter.convert(invaludInput);
		
		assertThat(actual).isEqualTo(invaludInput);
	}

}

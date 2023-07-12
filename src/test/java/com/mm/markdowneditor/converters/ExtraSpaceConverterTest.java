package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ExtraSpaceConverterTest {

	ExtraSpaceConverter converter = new ExtraSpaceConverter();

	@Test
	void testConvert() {
		String input = "abc      **Heading    3** xy";
		String expected = "abc **Heading 3** xy";
		
		String actual = converter.convert(input);
		
		assertThat(actual).isEqualTo(expected);
	}

}

package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConverterStreamTest {

	@Autowired
	private ConverterStream converter;

	@Test
	void testConvert_NullInput() {
		String input = null;

		String actual = converter.convert(input);
		assertThat(actual).isNull();
	}

	@Test
	void testConvert_EmptyInput() {
		String input = "";

		String actual = converter.convert(input);
		assertThat(actual).isEmpty();
	}

	@Test
	void testConvert_blankLine() {
		String input = "            ";

		String actual = converter.convert(input);
		assertThat(actual).isEmpty();
	}

	@Test
	void testConvert_SingleLine() {
		String input = "# Heading 1";
		String expected = "<h1>Heading 1</h1>";

		String actual = converter.convert(input);
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void testConvert_MultiLine() {
		String input = "# Heading 1 \n## Heading 2";
		String expected = "<h1>Heading 1</h1>\n<h2>Heading 2</h2>";

		String actual = converter.convert(input);
		assertThat(actual).isEqualTo(expected);
	}
}

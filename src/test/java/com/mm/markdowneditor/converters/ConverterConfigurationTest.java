package com.mm.markdowneditor.converters;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class ConverterConfigurationTest {
	
	private ConverterConfiguration config = new ConverterConfiguration();


	@Test
	void testConverterRegistry() {
		List<MarkdownConverter> converterRegistry = config.converterRegistry();
		assertThat(converterRegistry.size() == 3).isTrue();
		assertThat(converterRegistry.get(0)).isInstanceOf(HeaderConverter.class);
		assertThat(converterRegistry.get(1)).isInstanceOf(LinkConverter.class);
		assertThat(converterRegistry.get(2)).isInstanceOf(ExtraSpaceConverter.class);
	}

}

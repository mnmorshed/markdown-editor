package com.mm.markdowneditor.converters;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfiguration {

    @Bean
    List<MarkdownConverter> converterRegistry() {
		
		return List.of(
				new HeaderConverter(),
				new LinkConverter(),
				new ExtraSpaceConverter());
	}
}

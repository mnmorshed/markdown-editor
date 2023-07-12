/**
 * 
 */
package com.mm.markdowneditor.converters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component 
public class ConverterStream implements MarkdownConverter {

	@Autowired
    private List<MarkdownConverter> converterRegistry;

	@Override
	public String convert(String input) {
		if (null != input && !input.isEmpty()) {
			return Arrays
					.stream(input.split(System.lineSeparator()))
					.parallel()
					.filter(line -> null != line && !line.isBlank())
					.map(this::convertLine)
					.collect(Collectors.joining(System.lineSeparator()));
		}
		return input;
	}
	
	private String convertLine(String input) {
		
		for (MarkdownConverter converter: converterRegistry) {
			input = converter.convert(input);
		}
				
		return input;
	}

}

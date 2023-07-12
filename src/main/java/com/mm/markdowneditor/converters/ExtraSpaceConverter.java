/**
 * 
 */
package com.mm.markdowneditor.converters;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component 
public class ExtraSpaceConverter implements MarkdownConverter {

	private static final String PATTERN = "\\s+";
	private static final String REPLACEMENT = " ";
	private static final RegExConverter DELEGATE = new RegExConverter(PATTERN, REPLACEMENT);


	@Override
	public String convert(String input) {

		return DELEGATE.convert(input);
	}

}

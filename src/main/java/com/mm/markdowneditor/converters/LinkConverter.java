/**
 * 
 */
package com.mm.markdowneditor.converters;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component 
public class LinkConverter implements MarkdownConverter {
	
	private static final String PATTERN = "\\[([^\\[]+)\\]\\(([^\\)]+)\\)";
	private static final String REPLACEMENT = "<a href=\"$2\">$1</a>";
	private static final RegExConverter DELEGATE = new RegExConverter(PATTERN, REPLACEMENT);


	@Override
	public String convert(String input) {

		return DELEGATE.convert(input);
	}

}

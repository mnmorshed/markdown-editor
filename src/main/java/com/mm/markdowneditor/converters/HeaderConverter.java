/**
 * 
 */
package com.mm.markdowneditor.converters;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component 
public class HeaderConverter implements MarkdownConverter {

	public static final char HEADER_INDICATOR = '#';

	@Override
	public String convert(String input) {
		int headerIndecators = indicatorCount(input);
		if (headerIndecators > 0 && headerIndecators <= 6) {
			return String.format("<h%d>%s</h%1$d>", headerIndecators, input.substring(headerIndecators).trim());
		}

		return String.format("<p>%s</p>", input);
	}

	private int indicatorCount(String input) {
		int count = 0;

		while (HEADER_INDICATOR == input.charAt(count) && ++count <= 6)
			;

		return count;
	}
}

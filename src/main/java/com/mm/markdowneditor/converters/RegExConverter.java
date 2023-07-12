package com.mm.markdowneditor.converters;

import java.util.regex.Pattern;

/**
 * RegEx based markdown converter. Uses RegEx pattern matching to replace text
 * inside input strings. Can replace matching RegEx groups inside replacement
 * text.
 */
public class RegExConverter implements MarkdownConverter {

	private Pattern matchingPattern;
	private String replacement;

	/**
	 * Constructs RegExConverter by pre-building the RegEx matching pattern.
	 * 
	 * @param pattern     - RegEx matching pattern
	 * @param replacement - replacement string containing any pattern group matching
	 */
	public RegExConverter(String pattern, String replacement) {
		this.matchingPattern = Pattern.compile(pattern);
		this.replacement = replacement;
	}

	@Override
	public String convert(String input) {
		return matchingPattern.matcher(input).replaceAll(replacement);
	}

}

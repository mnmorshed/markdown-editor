/**
 * 
 */
package com.mm.markdowneditor.converters;

/**
 * Markdown converter interface
 */
public interface MarkdownConverter {
	
	/**
	 * Returns markdown string after all possible conversion. 
	 * 
	 * @param input String to convert all matches 
	 * @return converted String 
	 */
	public String convert(String input);
}

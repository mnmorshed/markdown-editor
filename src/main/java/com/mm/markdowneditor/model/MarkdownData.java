package com.mm.markdowneditor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MarkdownData {

	@Getter
	private String markdownContent;
	
	@Getter
	private String rawContentFileName;
}

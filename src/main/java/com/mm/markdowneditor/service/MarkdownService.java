/**
 * 
 */
package com.mm.markdowneditor.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.markdowneditor.converters.ConverterStream;
import com.mm.markdowneditor.model.MarkdownData;
import com.mm.markdowneditor.storage.FileStorage;

/**
 * 
 */
@Service
public class MarkdownService {

	@Autowired
	private ConverterStream converterStream;
	
	@Autowired
	private FileStorage fileStorage;
	
	public MarkdownData convertContent(String rawContentFileName, String content) {
		if (rawContentFileName == null || rawContentFileName.isBlank()) {
			rawContentFileName = UUID.randomUUID().toString();
		}
		fileStorage.store(rawContentFileName, content);
		
		String markdownContent = converterStream.convert(content);
		MarkdownData data = new MarkdownData(markdownContent, rawContentFileName);
		
		return data;
	}
	
	public String getRawContent(String rawContentFileName) {
		return fileStorage.retrieve(rawContentFileName);
	}
}

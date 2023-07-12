/**
 * 
 */
package com.mm.markdowneditor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mm.markdowneditor.model.MarkdownData;
import com.mm.markdowneditor.service.MarkdownService;

/**
 * 
 */
@Controller
public class MarkdownController {

	@Autowired
	MarkdownService service;
	
	
	@GetMapping("/markdown-editor")
	public String showEditor(ModelMap model, @RequestParam(required = false) String rawContentFileName) {
		
		String rawContent = service.getRawContent(rawContentFileName);

		model.put("rawContent", rawContent);
		model.put("rawContentFileName", rawContentFileName);
		
		return "markdown-editor";
	}

	@PostMapping("/markdown-editor")
	public String showViewer(ModelMap model, @RequestParam String content, @RequestParam(required = false) String rawContentFileName) {
		
		MarkdownData data = service.convertContent(rawContentFileName, content);
 		model.put("markdownContent", data.getMarkdownContent());
 		model.put("rawContentFileName", data.getRawContentFileName());
 		
		return "markdown-viewer";
	}

}

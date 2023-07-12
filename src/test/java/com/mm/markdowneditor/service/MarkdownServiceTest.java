package com.mm.markdowneditor.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mm.markdowneditor.model.MarkdownData;
import com.mm.markdowneditor.storage.FileStorage;

@RunWith(SpringRunner.class)
@SpringBootTest
class MarkdownServiceTest {

	@Autowired
	private MarkdownService service;
	
	@Autowired
	private FileStorage fileStorage;

	@Test
	void testConvertContent() {
		String content = "# Heading 1";
		String markdownContent = "<h1>Heading 1</h1>";
		
		MarkdownData actual = service.convertContent(null, content);
		
		assertThat(actual).isNotNull();
		assertThat(fileStorage.retrieve(actual.getRawContentFileName())).isEqualTo(content);
		assertThat(actual.getMarkdownContent()).isEqualTo(markdownContent);
	}

	@Test
	void testGetRawContent() {
		String fileName = "x";
		String content = "# Heading 1";
		fileStorage.store(fileName, content);
		
		assertThat(service.getRawContent(fileName)).isEqualTo(content);
	}

}

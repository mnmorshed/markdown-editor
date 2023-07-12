package com.mm.markdowneditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mm.markdowneditor")
public class MarkdownEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkdownEditorApplication.class, args);
	}

}

package com.mm.markdowneditor.storage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfiguration {

	@Bean
	FileStorage fileStorage() {
		return new InMemoryFileStorage();
	}
	
}

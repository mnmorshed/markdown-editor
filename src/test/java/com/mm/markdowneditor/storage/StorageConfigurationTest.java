package com.mm.markdowneditor.storage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StorageConfigurationTest {
	
	private StorageConfiguration config = new StorageConfiguration();

	@Test
	void testFileStorage() {
		assertThat(config.fileStorage()).isInstanceOf(InMemoryFileStorage.class);
	}

}

package com.mm.markdowneditor.storage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InMemoryFileStorageTest {

	private InMemoryFileStorage storage = new InMemoryFileStorage();

	@Test
	void testRetrieve_NonExisting() {
		String fileName = "non_existing_File";

		String actual = storage.retrieve(fileName);

		assertThat(actual).isEmpty();
	}
	
	@Test
	void testRetrieve_Existing() {
		String fileName = "existing_File";
		String content = "sample content";
		storage.store(fileName, content);

		String actual = storage.retrieve(fileName);

		assertThat(actual).isEqualTo(content);
	}

	@Test
	void testStore() {
		String fileName = "existing_File";
		String content = "sample content";
		
		storage.store(fileName, content);

		assertThat(storage.retrieve(fileName)).isEqualTo(content);
	}

}

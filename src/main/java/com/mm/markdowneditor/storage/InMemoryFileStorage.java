package com.mm.markdowneditor.storage;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class InMemoryFileStorage implements FileStorage {

	private static final Map<String, String> STORAGE = new HashMap<>();

	@Override
	public String retrieve(String fileName) {
		return STORAGE.getOrDefault(fileName, "");
	}

	@Override
	public void store(String fileName, String content) {
		STORAGE.put(fileName, content);
	}

}

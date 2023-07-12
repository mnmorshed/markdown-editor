package com.mm.markdowneditor.storage;

public interface FileStorage {

	/**
	 * Returns the file content for provided fileName.
	 * 
	 * @param fileName file name
	 * @return file content if found
	 */
	public String retrieve(String fileName);

	/**
	 * Stores the content with provided file name. If the file already exists it
	 * will overwrite the content.
	 * 
	 * @param fileName file name
	 * @param content  file content
	 */
	public void store(String fileName, String content);

}

package org.dipdivDB.BufferManager;
/**
 * @author Diptanshu Kakwani
 */

/**
 * BufferPool represents the memory. It is an array of frames. 
 */
public class BufferPool {
	int bufferSize;
	int frameCount;
	Frame[] bufferPool;
	
	BufferPool(int frames) {
		frameCount = frames; 
		bufferPool = new Frame[frames];
		for (int i = 0; i < frameCount; i++) {
			bufferPool[i].dirty = false;
			bufferPool[i].frameId = -1;
			bufferPool[i].lastAccessTime = 0.0;
			bufferPool[i].pinCount = 0;
			bufferPool[i].page.pageId = -1;
			bufferPool[i].page.nextPage = -1;
		}
	}
}

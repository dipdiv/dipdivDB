package org.dipdivDB.BufferManager;
import java.nio.ByteBuffer;
/**
 * @author Diptanshu Kakwani
 */

/**
 * A Page is the minimum transfer unit from the disk to memory. The Page size should not exceed 4096. 
 */
public class Page {
	int pageId;
	int nextPage;
	ByteBuffer data = ByteBuffer.allocate(4088);	// (4096 - 8), 8 bytes for two int fields.
	Page() {
		
	}
}

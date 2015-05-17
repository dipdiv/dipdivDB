package org.dipdivDB.BufferManager;
/**
 * @author Diptanshu Kakwani
 */

/**
 * Frame contains a page and the info associated with the page.
 * It keeps track of how many times the page has been requested (pinCount) and
 * if there are any changes made since it was fetched from the memory (dirty).
 * The client which requests a page, makes the page pinned. It has to unpin the page in order to write it back to the disk.
 */
public class Frame {
	int frameId;
	int pinCount;
	boolean dirty;
	double lastAccessTime;
	Page page;
}

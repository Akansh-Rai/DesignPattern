/**
 * 
 */
package com.designPattern.structuralPatterns.composite;

/**
 * @author Akansh_Rai
 *
 */
public class DiscJockey {

	private SongComponent songList;

	public DiscJockey(SongComponent newSongList) {
		songList = newSongList;
	}

	public void getSongList() {
		songList.displaySongInfo();
	}
}

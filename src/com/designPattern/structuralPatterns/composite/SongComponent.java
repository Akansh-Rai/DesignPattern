/**
 * 
 */
package com.designPattern.structuralPatterns.composite;

/**
 * @author Akansh_Rai
 *
 */
public abstract class SongComponent {

	public void add(SongComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(SongComponent component) {
		throw new UnsupportedOperationException();
	}

	public SongComponent getComponent(int componentIndex) {
		throw new UnsupportedOperationException();
	}

	public String getSongName(int componentIndex) {
		throw new UnsupportedOperationException();
	}

	public String getBandName(int componentIndex) {
		throw new UnsupportedOperationException();
	}

	public int releaseYear() {
		throw new UnsupportedOperationException();
	}

	public void displaySongInfo() {
		throw new UnsupportedOperationException();
	}

}

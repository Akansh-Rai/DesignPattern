/**
 * 
 */
package com.designPattern.structuralPatterns.composite;

/**
 * @author Akansh_Rai
 *
 */
public class Song extends SongComponent {

	private String name;
	private String band;
	private int releaseYear;

	/**
	 * @param name
	 * @param band
	 * @param releaseYear
	 */
	public Song(String name, String band, int releaseYear) {
		super();
		this.name = name;
		this.band = band;
		this.releaseYear = releaseYear;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the band
	 */
	public String getBand() {
		return band;
	}

	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public void displaySongInfo() {
		System.out.println(getName() + " was recorded  by " + getBand() + " in " + getReleaseYear() + "year.");
	}

}

/**
 * 
 */
package com.designPattern.structuralPatterns.composite;

/**
 * @author Akansh_Rai
 *
 */
public class SongListGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial Music", "");
		SongComponent heavyMetalMusic = new SongGroup("Heavy metal music", "");
		SongComponent sufiMusic = new SongGroup("Sufi music", "");

		SongComponent everySong = new SongGroup("Song List", "Every Song Available");
		everySong.add(industrialMusic);
		industrialMusic.add(new Song("industrialMusic song 1", "MyBand", 19080));
		industrialMusic.add(new Song("industrialMusic song 2", "Your Band", 1980));

		industrialMusic.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("heavyMetalMusic song 1", "MyBand", 19080));
		heavyMetalMusic.add(new Song("heavyMetalMusic song 2", "Your Band", 1980));

		DiscJockey crayList = new DiscJockey(everySong);
		crayList.getSongList();

	}

}

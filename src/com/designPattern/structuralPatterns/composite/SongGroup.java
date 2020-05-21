/**
 * 
 */
package com.designPattern.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Akansh_Rai
 *
 */
public class SongGroup extends SongComponent {

	ArrayList<SongComponent> songComponent = new ArrayList<SongComponent>();
	String groupName;
	String groupDescription;

	public SongGroup(String groupName, String groupDes) {
		this.groupName = groupName;
		this.groupDescription = groupDes;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	@Override
	public void add(SongComponent component) {
		songComponent.add(component);
	}

	@Override
	public void remove(SongComponent component) {
		songComponent.remove(component);
	}
	
	@Override
	public SongComponent getComponent(int componentIndex) {
		return songComponent.get(componentIndex);
	}
	
	@Override
	public void displaySongInfo() {
		System.out.println(getGroupName() + " " + getGroupDescription());
		Iterator<SongComponent> songIterator = songComponent.iterator();
		while(songIterator.hasNext()) {
			SongComponent song = songIterator.next();
			song.displaySongInfo();
		}
	}
}

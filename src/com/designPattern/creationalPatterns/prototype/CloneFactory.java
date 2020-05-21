package com.designPattern.creationalPatterns.prototype;

public class CloneFactory {

	public Animal getClone(Animal animal) {
		return animal.makeCopy();
	}
}

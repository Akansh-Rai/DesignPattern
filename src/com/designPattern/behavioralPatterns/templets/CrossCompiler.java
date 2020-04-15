package com.designPattern.behavioralPatterns.templets;

public abstract class CrossCompiler {

	public final void compile() {
		collectSource();
		compileToTarget();
	}

	// Template methods
	protected abstract void collectSource();

	protected abstract void compileToTarget();

}

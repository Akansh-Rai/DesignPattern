/**
 * 
 */
package com.designPattern.behavioralPatterns.templets;

/**
 * @author Akansh_Rai
 *
 */
public class AndroidPhoneCompiler extends CrossCompiler {

	/* (non-Javadoc)
	 * @see com.designPattern.behavioralPatterns.templets.CrossCompiler#collectSource()
	 */
	@Override
	protected void collectSource() {
		System.out.println("Collected All code related to Android Phone");
	}

	/* (non-Javadoc)
	 * @see com.designPattern.behavioralPatterns.templets.CrossCompiler#compileToTarget()
	 */
	@Override
	protected void compileToTarget() {
		System.out.println("Compiling All code related to Android Phone");
	}

}

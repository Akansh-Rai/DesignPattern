/**
 * 
 */
package com.arai.designPattern.creationalPatterns.builder.RobotExample;

/**
 * @author Akansh_Rai
 *
 */
public interface RobotBuilder {

	public void buildRobotHead ();
	
	public void buildRobotTorso ();
	
	public void buildRobotArms ();
	
	public void buildRobotLegs ();
	
	public Robot getRobot();
}

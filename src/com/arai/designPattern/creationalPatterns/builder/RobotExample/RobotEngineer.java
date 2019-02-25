/**
 * 
 */
package com.arai.designPattern.creationalPatterns.builder.RobotExample;

/**
 * @author Akansh_Rai
 *
 */
public class RobotEngineer {
	
	private RobotBuilder builder;
	
	public RobotEngineer(RobotBuilder builder) {
		this.builder = builder;
	}
	
	public Robot getRobot () {
		return this.builder.getRobot();
	}
	

	public void buildRobot() {
		builder.buildRobotHead();
		builder.buildRobotLegs();
		builder.buildRobotTorso();
		builder.buildRobotArms();		
	}
	
}

/**
 * 
 */
package com.arai.designPattern.creationalPatterns.builder.RobotExample;

/**
 * @author Akansh_Rai
 *
 */
public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		robot = new Robot();
	}
	
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}


	@Override
	public Robot getRobot() {
		buildRobotHead();
		buildRobotLegs();
		buildRobotTorso();
		buildRobotArms();
		return robot;
	}

}

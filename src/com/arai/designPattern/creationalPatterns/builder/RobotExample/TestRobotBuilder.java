/**
 * 
 */
package com.arai.designPattern.creationalPatterns.builder.RobotExample;

/**
 * @author Akansh_Rai
 *
 */
public class TestRobotBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RobotBuilder builder = new OldRobotBuilder();
		RobotEngineer engineer = new RobotEngineer(builder);
		engineer.buildRobot();
		Robot robot = engineer.getRobot();

		System.out.println("Robot Build");
		System.out.println("Robot head : " + robot.getRobotHead());
		System.out.println("Robot torso : " + robot.getRobotTorso());
		System.out.println("Robot arms : " + robot.getRobotArms());
		System.out.println("Robot legs : " + robot.getRobotLegs());

	}

}

/**
 * 
 */
package com.arai.designPattern.creationalPatterns.builder.RobotExample;

/**
 * @author Akansh_Rai
 *
 */
public interface RobotPlan {

	public void setRobotHead(String head);

	public void setRobotTorso(String torso);

	public void setRobotArms(String arms);

	public void setRobotLegs(String legs);

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.pickup;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class StopHoldBall extends CommandBase{
    public StopHoldBall(double timeout) {
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickup.stopHoldBall();
        System.out.println("Holding Ball");
    }

    protected boolean isFinished() {
        //pickup.isBallHeld = false;
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

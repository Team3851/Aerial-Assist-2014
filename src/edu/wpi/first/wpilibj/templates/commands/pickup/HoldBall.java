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
public class HoldBall extends CommandBase{    
    public HoldBall(double timeout) {
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickup.holdBall();
        System.out.println("Holding Ball");
    }

    protected boolean isFinished() {
        //pickup.isBallHeld = true;
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

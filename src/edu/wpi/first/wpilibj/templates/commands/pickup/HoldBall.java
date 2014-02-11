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
    public HoldBall() {
        requires(pickup);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickup.doNothing();
        System.out.println("Pickup doing nothing");
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

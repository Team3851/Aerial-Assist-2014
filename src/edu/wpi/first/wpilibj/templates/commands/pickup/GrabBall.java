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
public class GrabBall extends CommandBase{
    public GrabBall() {
        requires(pickup);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickup.grabBall();
        System.out.println("Pickup Grabbing+++++++++++++++++++++++++++++++++++++++++++++++");
    }

    protected boolean isFinished() {
        return !io.getButtonL2();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

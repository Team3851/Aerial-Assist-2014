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
public class ReleaseBall extends CommandBase{
    public ReleaseBall() {
        requires(pickup);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickup.releaseBall();
        System.out.println("Pickup Releasing Ball");
    }

    protected boolean isFinished() {
        return !io.getButtonL3();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

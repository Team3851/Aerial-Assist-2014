/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drivetrain;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class DriveBackXSeconds extends CommandBase{
    public DriveBackXSeconds (double timeout) {
        requires(drivetrain);
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        //drive back until timeout is called
        //at 25% speed
        drivetrain.basicDrive((-1)*.25, (-1)*.25);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveBackXSeconds;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveStraightXSeconds;

/**
 *
 * @author 3851
 */
public class AutonomousMoveForward extends CommandGroup {
    public AutonomousMoveForward() {
        addSequential(new DriveBackXSeconds(0.75));
        addSequential(new WaitCommand(1.0));
        
        addSequential(new DriveStraightXSeconds(.75));
    }
}

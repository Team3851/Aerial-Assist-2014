/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.templates.commands.ballista.EnableShootingPosition;
import edu.wpi.first.wpilibj.templates.commands.ballista.PinRelease;
import edu.wpi.first.wpilibj.templates.commands.ballista.PrepareShot;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveStraightXSeconds;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DrivetrainDoNothing;

/**
 *
 * @author 3851
 */
public class AutonomousMoveForward extends CommandGroup {
    //robot moves back, then goes straight
    public AutonomousMoveForward() {        
        addSequential(new PrepareShot());
        addSequential(new WaitCommand(0.5));
        
        addSequential(new DriveStraightXSeconds(0.5));
        addSequential(new WaitCommand(0.5));
        addParallel(new DrivetrainDoNothing());
        
        addSequential(new EnableShootingPosition(2.0));
        addSequential(new WaitCommand(0.5));
        
        addSequential(new PinRelease(1.5));
    }
}

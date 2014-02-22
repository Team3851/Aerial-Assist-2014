/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.ballista;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.templates.commands.pickup.StopHoldBall;

/**
 *
 * @author 3851
 */
public class BallistaFireBall extends CommandGroup{
    public BallistaFireBall() {
        addSequential(new StopHoldBall(1.0));
        addSequential(new PinRelease(1.5));
        addSequential(new WaitCommand(1.0));
        
        addSequential(new PrepareShot());
        addSequential(new WaitCommand(4.0));
    }
    
}

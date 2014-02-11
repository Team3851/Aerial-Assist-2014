/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.ballista;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author 3851
 */
public class PrepareShot extends CommandGroup{
    //drawback, wait a second
    //push the pin in to hold, wait a second
    //release the drawback, wait a second
    //now ready to fire, seperate command
    public PrepareShot() {
        addSequential(new Drawback(2.0));
        
        addSequential(new PinHold(1.0));
        
        addSequential(new Release(1.0));
    }
}

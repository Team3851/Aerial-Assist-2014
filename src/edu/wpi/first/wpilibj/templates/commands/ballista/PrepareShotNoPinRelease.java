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
public class PrepareShotNoPinRelease extends CommandGroup{
    //drawback, wait a second
    //push the pin in to hold, wait a second
    //release the drawback, wait a second
    //now ready to fire, seperate command
    public boolean isDrawnback;
    public PrepareShotNoPinRelease() {
        //set boolean to init false,
        //default to drawnback position
        isDrawnback = false;
        System.out.println("Is Drawnback: "+isDrawnback);
        addSequential(new Drawback(2.5));
                
        addSequential(new Release(1.0));
        
        //boolean true, allow fire
        //prevent firing without drawing back
        isDrawnback = true;
        System.out.println("Is Drawnback: "+isDrawnback);
    }
}

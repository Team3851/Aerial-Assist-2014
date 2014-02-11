/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.ballista;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class BallistaDoNothing extends CommandBase{
    public BallistaDoNothing() {
        requires(ballista);
    }

    protected void initialize() {
    }

    protected void execute() {
        ballista.doNothing();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

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
public class Release extends CommandBase{
    public Release(double timeout) {
        requires(ballista);
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        ballista.releaseBallista();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        ballista.doNothing();
    }

    protected void interrupted() {
    }
    
}

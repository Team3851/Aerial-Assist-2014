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
public class EnableTrussPosition extends CommandBase{
    public EnableTrussPosition(double timeout) {
        requires(ballista);
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        ballista.enableTrussPosition();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

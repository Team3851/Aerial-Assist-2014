package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ballista.BallistaDoNothing;



import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ballista.BallistaDoNothing;
import edu.wpi.first.wpilibj.templates.commands.pickup.HoldBall;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveWithJoysticks;

/**
 * Drivetrain subsystem
 * <p>Recommended next step: fix gyro values
 *
 * @author 3851
 */
public class Ballista extends Subsystem { 
    Relay drawback_release;
    Relay pin_hold_release;
    
    Relay ballista_init_pos;
    Relay ballista_shooting_pos;
    

    // Initialize your subsystem here
    public Ballista() {
        drawback_release = new Relay(RobotMap.drawback_release_relay);
        pin_hold_release = new Relay(RobotMap.pin_push_pull_relay);
        
        ballista_shooting_pos = new Relay(RobotMap.ballista_shooting_pos);
        ballista_init_pos = new Relay(RobotMap.ballista_init_pos);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new BallistaDoNothing());
    }

    //two directions on each pneumatic
    //forward and reverse change polarity, 
    //assign positive charge to either piston
    public void drawbackBallista() {
        drawback_release.set(Relay.Value.kReverse);
    }
    
    public void releaseBallista() {
        drawback_release.set(Relay.Value.kForward);
    }
    
    public void pinHold() {
        pin_hold_release.set(Relay.Value.kForward);
    }
    
    public void pinRelease() {
        pin_hold_release.set(Relay.Value.kReverse);
    }
    
    public void disableInitPosition() {
        ballista_init_pos.set(Relay.Value.kReverse);
    }
    
    public void enableInitPosition() {
        ballista_init_pos.set(Relay.Value.kForward);
        ballista_shooting_pos.set(Relay.Value.kForward);
    }
    
    public void enableShootingPosition() {
        ballista_shooting_pos.set(Relay.Value.kForward);
    }
    
    public void enablePickupPosition() {
        ballista_shooting_pos.set(Relay.Value.kReverse);
    }
    
    public void doNothing() {
        drawback_release.set(Relay.Value.kOff);
        pin_hold_release.set(Relay.Value.kOff);
        ballista_init_pos.set(Relay.Value.kOff);
        ballista_shooting_pos.set(Relay.Value.kOff);
    }
}
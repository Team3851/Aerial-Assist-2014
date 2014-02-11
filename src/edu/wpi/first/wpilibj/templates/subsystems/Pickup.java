package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.pickup.HoldBall;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveWithJoysticks;
import edu.wpi.first.wpilibj.templates.commands.pickup.GrabBall;

/**
 * Drivetrain subsystem, using polar mecanum drive as of now seeing as how gyro is 
 * giving wonky values
 * 
 * <p>Recommended next step: fix gyro values
 *
 * @author 3851
 */
public class Pickup extends Subsystem { 
    Relay pickup_mot1;
    Relay pickup_mot2;
    Relay air_compressor;

    // Initialize your subsystem here
    public Pickup() {
        pickup_mot1 = new Relay(RobotMap.pickupMotor1);
        pickup_mot2 = new Relay(RobotMap.pickupMotor2);
        air_compressor = new Relay(RobotMap.airCompressor);
    }
    
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new HoldBall());
    }

    //standard tank drive 
    public void grabBall() {
        //pickup motor 2 is backwards, set forward to pickup
        //motor is actually in reverse
        pickup_mot2.set(Relay.Value.kReverse);
        pickup_mot1.set(Relay.Value.kForward);
        
        
    }
    
    public void releaseBall() {
        //pickup motor 2 is backwards, set forward to pickup
        //motor is actually in reverse
        pickup_mot1.set(Relay.Value.kForward);
        pickup_mot2.set(Relay.Value.kReverse);
    }
    
    public void doNothing() {
        pickup_mot1.set(Relay.Value.kOff);
        pickup_mot2.set(Relay.Value.kOff);
    }
    
    public void runCompressor() {
        air_compressor.set(Relay.Value.kForward);
    }
    
    public void stopCompressor() {
        air_compressor.set(Relay.Value.kOff);
    }
}


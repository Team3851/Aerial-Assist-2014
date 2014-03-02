package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.pickup.PickupDoNothing;
import edu.wpi.first.wpilibj.templates.subsystems.Ballista;

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
    Relay pickup_holdball_piston;
    
    Relay air_compressor;
            
    public boolean isBallHeld;

    // Initialize your subsystem here
    public Pickup() {
        pickup_mot1 = new Relay(RobotMap.pickupMotor1);
        pickup_mot2 = new Relay(RobotMap.pickupMotor2);
        pickup_holdball_piston = new Relay(RobotMap.pickup_holdball);
        
        air_compressor = new Relay(RobotMap.airCompressor);
        
        LiveWindow.addActuator("Pickup", "HoldBall Relay", pickup_holdball_piston);
        LiveWindow.addActuator("Pickup", "Pickup Motor 1 Relay", pickup_mot1);
        LiveWindow.addActuator("Pickup", "Pickup Motor 2 Relay", pickup_mot2);

    }
    
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new PickupDoNothing());
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
    
    public void holdBall() {
        pickup_holdball_piston.set(Relay.Value.kForward);
    }
    
    public void stopHoldBall() {
        pickup_holdball_piston.set(Relay.Value.kReverse);
    }
    
    public void doNothing() {
        pickup_mot1.set(Relay.Value.kOff);
        pickup_mot2.set(Relay.Value.kOff);
        pickup_holdball_piston.set(Relay.Value.kOff);
    }
    
    public void runCompressor() {
        air_compressor.set(Relay.Value.kForward);
    }
    
    public void stopCompressor() {
        air_compressor.set(Relay.Value.kOff);
    }
}


package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveWithJoysticks;

/**
 * Drivetrain subsystem, using polar mecanum drive as of now seeing as how gyro is 
 * giving wonky values
 * 
 * <p>Recommended next step: fix gyro values
 *
 * @author 3851
 */
public class DriveTrain extends Subsystem { 
    RobotDrive tank_Drive;
    //AnalogChannel driveGyro;

    // Initialize your subsystem here
    public DriveTrain() {
        tank_Drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
        tank_Drive.setSafetyEnabled(true);
    }
    
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }

    //standard tank drive 
    public void basicDrive(double x, double y) {
        tank_Drive.tankDrive(x, y);
    }
}


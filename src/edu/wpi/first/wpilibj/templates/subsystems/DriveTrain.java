package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Watchdog;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
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
    RobotDrive tank_Drive1;
    RobotDrive tank_Drive2;
    //AnalogChannel driveGyro;

    // Initialize your subsystem here
    public DriveTrain() {
        //tank_Drive1 = new RobotDrive(4, 1);
        tank_Drive2 = new RobotDrive(RobotMap.leftFrontMotor, RobotMap.leftRearMotor,
                RobotMap.rightFrontMotor, RobotMap.rightRearMotor);
        //tank_Drive1.setSafetyEnabled(true);
        tank_Drive2.setSafetyEnabled(false);
        Watchdog.getInstance().kill();
    }
    
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }

    //standard tank drive 
    public void basicDrive(double x, double y) {
        //tank_Drive1.tankDrive(x, y);
        tank_Drive2.tankDrive(x, y);
    }
}


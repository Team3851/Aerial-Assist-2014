package edu.wpi.first.wpilibj.templates.commands.drivetrain;
import edu.wpi.first.wpilibj.DriverStationEnhancedIO;
import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.templates.IO;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;


/**
 * <p>The default command for the drive train. When no other command is running,
 * the robot can be driven using the joysticks.</p>
 * 
 * <p>Recommended next step: {@link DriveToDistance}
 *
 * @author 3851
 */
public class DriveWithJoysticks extends CommandBase {
    /**
     * Requires the drive train
     */
    public DriveWithJoysticks() {
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //drivetrain.initGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    /**
     * Have the drivetrain drive mecanum drive with the latest values from joysticks.
     */
    protected void execute() {
        //magnitude uses circle formula to get value between 1.0<->-1.0
        //left direction gets values from 0 degrees to 180degrees, -180degrees to 0 degrees clockwise
        //right speed is joystick axis value between 1.0<->-1.0
        drivetrain.basicDrive(io.getLeftY(), (-1)*io.getRightY());
        System.out.println("Joystick LEFT :"+io.getLeftY()+"  Joystick RIGHT :"+io.getRightY());
        //DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser5, 1, "Magnitude"+io.getLeftMagnitude());
        //DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser4, 1, "Direction"+io.getLeftDirection());
        //DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "RightX"+io.getRightX());
        //DriverStationLCD.getInstance().updateLCD();
        //System.out.println("Gyro Angle: "+drivetrain.getAngle());
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return false, so that it executes forever or until another command
     *         interrupts it.
     */
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    public static final int
            leftFrontMotor = 1,
            leftRearMotor = 2,
            rightFrontMotor = 3,
            rightRearMotor = 4;
    
    //Connected to RELAY outputs on Sidecar
    //Ensure cable is OK, should have lights on Relay Outputs
    //GREEN for forward
    public static final int
            pickupMotor1 = 2,
            pickupMotor2 = 3, 
            airCompressor = 1,
            drawback_release_relay = 7,
            pin_push_pull_relay = 6,
            ballista_init_pos = 4,
            ballista_shooting_pos = 5;
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}


package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.ballista.*;
import edu.wpi.first.wpilibj.templates.commands.pickup.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class IO {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    Joystick leftJoy = new Joystick(1);
    Joystick rightJoy = new Joystick(2);
    Joystick pickupJoy = new Joystick(3);
    PrepareShot prepareShot = new PrepareShot();
    Command prepareShotCommand = new PrepareShot();
            
            //left joystick buttons
    Button buttonL1 = new JoystickButton(leftJoy, 1),
            buttonL2 = new JoystickButton(leftJoy, 2),
            buttonL3 = new JoystickButton(leftJoy, 3),
            buttonL4 = new JoystickButton(leftJoy, 4),
            buttonL5 = new JoystickButton(leftJoy, 5),
            buttonL6 = new JoystickButton(leftJoy, 6),
            buttonL7 = new JoystickButton(leftJoy, 7),
            buttonL8 = new JoystickButton(leftJoy, 8),
            buttonL9 = new JoystickButton(leftJoy, 9),
            buttonL10 = new JoystickButton(leftJoy, 10),
            buttonL11 = new JoystickButton(leftJoy, 11);
    
    Button buttonP2 = new JoystickButton(pickupJoy, 2),
            buttonP3 = new JoystickButton(pickupJoy, 3),
            buttonP1 = new JoystickButton(pickupJoy, 1), 
            buttonP7 = new JoystickButton(pickupJoy, 7),
            buttonP6 = new JoystickButton(pickupJoy, 6),
            buttonP4 = new JoystickButton(pickupJoy, 4),
            buttonP9 = new JoystickButton(pickupJoy, 9),
            buttonP8 = new JoystickButton(pickupJoy, 8),
            buttonP11 = new JoystickButton(pickupJoy, 11),
            buttonP10 = new JoystickButton(pickupJoy, 10);
    
    public IO() {
        //BALLISTA CONTROLS
        /*
         * Position
         */
        buttonP2.whenPressed(new EnablePickupPosition(1.0));
        buttonP3.whenPressed(new EnableShootingPosition(1.0));
        buttonP9.whenPressed(new EnableTrussPosition(1.0));
        buttonP8.whenPressed(new DisableInitPosition(1.0));
        
        /*
         * Shooting
         */
        buttonP11.whenPressed(new PrepareShot());
        buttonP10.whenPressed(new EnableInitPosition(1.0));
        buttonP1.whenPressed(new BallistaFireBall());
        
        
        /*
         * Pickup
         */
        buttonP6.whileHeld(new GrabBall());
        buttonP7.whenPressed(new HoldBall(1.0));
        
        
        //DEBUG ON LEFT JOYSTICK
        buttonL7.whenPressed(new PinHold(1.0));
        buttonL6.whenPressed(new PinRelease(1.0));
        
        buttonL10.whenPressed(new PrepareShotNoPinRelease());
        buttonL11.whenPressed(new Release(2.0));
    }
    
    public boolean getButtonL2() {
        return buttonL2.get();
    }
    
    public boolean getButtonL3() {
        return buttonL3.get();
    }
    
    public double getLeftY() {
        //set threshold value to 0.09
        if (Math.abs(leftJoy.getY()) <= 0.09) {
            return 0;
        }
        else {
            SmartDashboard.putNumber("SPEED LEFT TRAIN", (-1)*leftJoy.getY());
            return (-1)*leftJoy.getY();
        }
    }
    public double getLeftX() {
        return leftJoy.getX();
    }
    
    public double getRightY() {
        //set threshold value to 0.09
        if (Math.abs(rightJoy.getY()) <= 0.09) {
            return 0;
        }
        SmartDashboard.putNumber("SPEED RIGHT TRAIN", (-1)*rightJoy.getY());
        return (-1)*rightJoy.getY();
    }
    
    public double getRightX() {
        return rightJoy.getX();
    }
    
    public Joystick leftJoy() {
        return leftJoy();
    }
    
    public Joystick rightJoy() {
        return rightJoy();
    }
}


package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team484.robot.commands.ExampleCommand;
import org.usfirst.frc.team484.robot.commands.PIDRotate;
import org.usfirst.frc.team484.robot.commands.RotateDoNothing;
import org.usfirst.frc.team484.robot.commands.RotateFullSpeed;
import org.usfirst.frc.team484.robot.commands.ValveDoNothing;
import org.usfirst.frc.team484.robot.commands.ValveShoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

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

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	Button shootButton = new JoystickButton(Robot.io.controlStick, 1);
	Button rotateButton = new JoystickButton(Robot.io.controlStick, 2);
	public OI() {
		shootButton.whileHeld(new ValveShoot());
		shootButton.whenReleased(new ValveDoNothing());
		rotateButton.whileHeld(new PIDRotate());
		rotateButton.whenReleased(new RotateDoNothing());
	}
}

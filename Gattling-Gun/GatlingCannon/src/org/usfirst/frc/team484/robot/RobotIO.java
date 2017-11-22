package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;

public class RobotIO {
	
	public Relay valve;
	public Relay compressorA;
	public Relay compressorB;
	public Talon turnMotor;
	public Joystick controlStick;
	public Encoder encoder;
	public DigitalInput compSensor;

	public RobotIO() {
		valve = new Relay(RobotMap.valveRelay);
		compressorA = new Relay(RobotMap.compressRelayA);
		compressorB = new Relay(RobotMap.compressRelayB);
		turnMotor = new Talon(RobotMap.turnMotor);
		controlStick = new Joystick(RobotMap.controlStick);
		encoder = new Encoder(RobotMap.encoderA, RobotMap.encoderB);
		compSensor = new DigitalInput(RobotMap.limitSensor);
		
	}
}

package org.usfirst.frc.team484.robot.subsystems;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Valve extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void valve(Boolean on) {
    	if(on) {
    		Robot.io.valve.set(Relay.Value.kOn);
    	}else{
    		Robot.io.valve.set(Relay.Value.kOff);
    	}
    	
    }
    
}


package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PIDRotate extends Command {

	PIDController pid;
    public PIDRotate() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.rotator);
    	pid = new PIDController(0.1, 0.0, 0.0, new PIDSource() {
			
			@Override
			public void setPIDSourceType(PIDSourceType pidSource) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public double pidGet() {
				// TODO Auto-generated method stub
				return Robot.io.encoder.get();
			}
			
			@Override
			public PIDSourceType getPIDSourceType() {
				// TODO Auto-generated method stub
				return PIDSourceType.kDisplacement;
			}
		}, new PIDOutput() {
			
			@Override
			public void pidWrite(double output) {
				// TODO Auto-generated method stub
				Robot.rotator.rotate(output);
				
			}
		});
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.io.encoder.reset();
    	pid.setSetpoint(60.0);
    	pid.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return 89 <= Robot.io.encoder.get() && Robot.io.encoder.get() <= 91;
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.rotator.rotate(0.0);
    }
}

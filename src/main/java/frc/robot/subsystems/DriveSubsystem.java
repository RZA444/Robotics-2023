// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  public static final TalonFX _talon1 = new TalonFX(1);
  public static final TalonFX _talon2 = new TalonFX(2);
  public static final TalonFX _talon3 = new TalonFX(3);
  public static final TalonFX _talon4 = new TalonFX(4);
  public static final TalonFX _talon5 = new TalonFX(5);
  public static final TalonFX _talon6 = new TalonFX(6);

 
  
  // double speed = -joystick1.getRawAxis(1) * 0.6;
  // double turn = joystick1.getRawAxis(4) * 0.3;

  // double leftSpeed = speed + turn;
  // double rightSpeed = speed - turn;
  
  public static final int XBOX_LEFT_Y_AXIS = 1;
  public static final int XBOX_LEFT_X_AXIS = 0;

    DifferentialDrive drive;

  //   //_talon1.setInverted(false);
  //   //_talon4.setInverted(true);
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
    
  public void rightMotorGroupings(){
    _talon2.follow(_talon1);
    _talon3.follow(_talon1);
  }


  public void leftMotorGroupings(){
    _talon5.follow(_talon4);
    _talon6.follow(_talon4);
  }
  
  public void setMotors(double leftSpeed, double rightSpeed) {
  _talon1.set(ControlMode.PercentOutput, leftSpeed);
  _talon4.set(ControlMode.PercentOutput, -rightSpeed);
  } 


// public void driveWithJoysticks(XboxController controller, double speed){
//   drive.arcadeDrive(controller.getRawAxis(XBOX_LEFT_Y_AXIS)*speed, controller.getRawAxis(XBOX_LEFT_X_AXIS)*speed);
// }

// public void driveForward(double speed){
//   drive.tankDrive(speed, speed);
// }
  }
  // @Override
  // public void simulationPeriodic() {
  //   // This method will be called once per scheduler run during simulation
  // }


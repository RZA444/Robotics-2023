// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class IntakeSubsystem extends SubsystemBase {
 
  private final VictorSPX VictorSPX_1 = new VictorSPX(1);
  private final VictorSPX VictorSPX_2 = new VictorSPX(2);
  
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {}

  
  
  public void setPosition(boolean open) {
    intakeMotorGrouping(); //come back to check that the follow actusally happens
        if (open) {
              VictorSPX_1.set(VictorSPXControlMode.PercentOutput, -.7);
              
          } else {
               VictorSPX_1.set(VictorSPXControlMode.PercentOutput, 0);
               
          }
        }
  //@Override
  public void periodic() {}
  
  public void intakeMotorGrouping(){
      VictorSPX_2.follow(VictorSPX_1);
  }
   
}

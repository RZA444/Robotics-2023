package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class ShooterSubsystem extends SubsystemBase {
    public static final TalonFX _talon7 = new TalonFX(7);
    public static final TalonFX _talon8 = new TalonFX(8);

//we will need encoder here

    public void setMotors(double speed){
        _talon7.set(ControlMode.PercentOutput, speed);
        _talon8.set(ControlMode.PercentOutput, -speed);
    }

}
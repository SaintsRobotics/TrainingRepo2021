// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareMap.IntakeHardware;

public class IntakeSubsystem extends SubsystemBase {

  private VictorSPX m_intake_arm, m_intake_motor; 
  

  /** Creates a new IntakeSubsystem. */
  
  public IntakeSubsystem(IntakeHardware intake_Hardware){
      m_intake_arm = intake_Hardware.intake_arm; 
      m_intake_motor = intake_Hardware.intake_motor; 
      

  }

  @Override
  public void periodic() {
    
  }

  public void setSpeedArm(double speed){
    m_intake_arm.set(ControlMode.PercentOutput, speed);
  }

  public void setSpeedMotor(double speed){
    m_intake_motor.set(ControlMode.PercentOutput,speed);
  }
}

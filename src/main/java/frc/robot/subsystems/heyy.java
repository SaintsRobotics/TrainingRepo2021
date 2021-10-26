// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class heyy extends SubsystemBase {
  /** Creates a new heyy. */
  public double motorSpeed;
  public CANSparkMax firstMotor;

  public heyy() {
      firstMotor = new CANSparkMax(14, MotorType.kBrushless);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    firstMotor.set(motorSpeed);
    
  }
  public void setSpeed(double speed){
    motorSpeed = speed;
  }
  
}

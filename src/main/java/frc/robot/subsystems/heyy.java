// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class heyy extends SubsystemBase {
  /** Creates a new heyy. */
  public double motorSpeed;
  

  public heyy(double theoreticalMotorSpeed) {
      motorSpeed = theoreticalMotorSpeed;
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setSpeed(1.0);
    
  }
  public void setSpeed(double speed){
    motorSpeed = speed;
  }
  
}

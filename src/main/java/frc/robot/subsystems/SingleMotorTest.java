// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SingleMotorTest extends SubsystemBase {
  CANSparkMax m_motor = new CANSparkMax(3, MotorType.kBrushless);
  double targetSpeed = 0;
  /** Creates a new SingleMotorTest. */
  public SingleMotorTest() {}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_motor.set(targetSpeed);
  }
  
  public void setSpeed(double speed) {
    if(speed > 1){
      speed = 1;
    }
    if(speed < -1){
      speed = -1;
    }
    targetSpeed = speed;
  }
}

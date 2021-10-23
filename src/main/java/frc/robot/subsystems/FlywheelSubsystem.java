// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FlywheelSubsystem extends SubsystemBase {
  private CANSparkMax m_motor;
  public double m_velocity;
  public boolean m_IsRunning = false;
  /** Creates a new NEOMOTORS. */
  public FlywheelSubsystem() {
    m_motor = new CANSparkMax(Constants.MotorConstants.portNumber, MotorType.kBrushless);
  }
  public void SetMotorSpeed(double speed) {
    m_velocity= speed;
    m_IsRunning = speed != 0;
  }

  @Override
  public void periodic() {
    m_motor.set(m_velocity);
    // This method will be called once per scheduler run
  }
}

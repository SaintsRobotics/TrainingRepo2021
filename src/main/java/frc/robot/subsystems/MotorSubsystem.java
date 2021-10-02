// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class MotorSubsystem extends SubsystemBase {
  private CANSparkMax m_motor;
  public boolean isRunning = false;
  public double velocity = 0; // positive speed is moving forward and negative speed is moving backwards

  /** Creates a new MotorSubsystem. */
  public MotorSubsystem() {
    m_motor = new CANSparkMax(Constants.MotorConstants.portNumber, MotorType.kBrushless);
  }

  public void setMotorSpeed(double speed) {
    velocity = speed;  
    isRunning = speed != 0;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_motor.set(velocity);
  }
}

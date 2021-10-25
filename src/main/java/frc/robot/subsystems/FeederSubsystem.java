// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.HardwareMap.ShooterHardware;

public class FeederSubsystem extends SubsystemBase {
  // fields
  private SpeedControllerGroup m_feeder;

  private double m_feederSpeed; // might need this in the future

  /** Creates a new feederSubsystem. */
  public FeederSubsystem(ShooterHardware shooterHardware) {
    m_feeder = shooterHardware.feeder;
    m_feederSpeed = 0;
  }

  public void turnOn() {
    m_feederSpeed = 1;
    m_feeder.set(1);
  }

  public void turnOff() {
    m_feederSpeed = 0;
    m_feeder.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.HardwareMap.ShooterHardware;

public class FlywheelSubsystem extends SubsystemBase {
  // fields
  private SpeedControllerGroup m_flywheel;

  private double m_flywheelSpeed; // might need this in the future

  /** Creates a new FlywheelSubsystem. */
  public FlywheelSubsystem(ShooterHardware shooterHardware) {
    m_flywheel = shooterHardware.flywheel;
    m_flywheelSpeed = 0;
  }

  public void setPower(double power) {
    m_flywheelSpeed = power;
    m_flywheel.set(power);  // if something doesn't work, move this to periodic
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

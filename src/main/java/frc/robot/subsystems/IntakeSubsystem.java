// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  private SpeedController m_intakeMotor, m_armMotor;

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem(SpeedController intakeMotor, SpeedController armMotor) {
    m_intakeMotor = intakeMotor;
    m_armMotor = armMotor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setIntakeSpeed(double intakeSpeed) {
    m_intakeMotor.set(intakeSpeed);
  }

  public void setArmSpeed(double armSpeed) {
    m_armMotor.set(armSpeed);
  }

}

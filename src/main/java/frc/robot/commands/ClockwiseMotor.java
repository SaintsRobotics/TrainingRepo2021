// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ClockwiseMotor extends CommandBase {
  private final MotorSubsystem m_motorsubsystem;
  /** Creates a new ClockwiseMotor. */
  public ClockwiseMotor(MotorSubsystem subsystem) {
    m_motorsubsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  /**
   * Sets motor speed to half speed clockwise (0.5) if speed is not already set (not tested)
   */
  @Override
  public void execute() {
    if(m_motorsubsystem.m_velocity != 0.5) {
      m_motorsubsystem.setMotorSpeed(0.5);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_motorsubsystem.setMotorSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

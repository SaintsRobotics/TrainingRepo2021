// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.FlywheelSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class FlywheelCommand extends CommandBase {
  // fields
  private FlywheelSubsystem m_flywheelSubsystem;

  /** Creates a new FlywheelCommand. */
  public FlywheelCommand(FlywheelSubsystem flywheelSubsystem) {
    m_flywheelSubsystem = flywheelSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(flywheelSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_flywheelSubsystem.setPower(0.5);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_flywheelSubsystem.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

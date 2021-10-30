// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends CommandBase {
  IntakeSubsystem m_subsystem;
  DoubleSupplier m_intakeSupplier;
  DoubleSupplier m_armSupplier;
  /** Creates a new IntakeCommand. */
  
  public IntakeCommand(IntakeSubsystem subsystem, DoubleSupplier intakeSupplier, DoubleSupplier armSupplier) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
    m_subsystem = subsystem;
    m_intakeSupplier = intakeSupplier;
    m_armSupplier = armSupplier;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.setIntakeSpeed(m_intakeSupplier.getAsDouble());
    m_subsystem.setArmSpeed(m_armSupplier.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.setIntakeSpeed(0);
    m_subsystem.setArmSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

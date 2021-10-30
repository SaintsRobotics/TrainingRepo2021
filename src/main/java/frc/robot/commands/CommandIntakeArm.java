// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class CommandIntakeArm extends CommandBase {

  private IntakeSubsystem subsystem;
  private XboxController m_xbox;

  /** Creates a new CommandIntakeArm. */
  public CommandIntakeArm(IntakeSubsystem subsystemIntake, XboxController xbox_x) {
    // Use addRequirements() here to declare subsystem dependencies.
    subsystem = subsystemIntake;
    m_xbox = xbox_x;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    subsystem.setSpeedArm(m_xbox.getY(Hand.kRight)); 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

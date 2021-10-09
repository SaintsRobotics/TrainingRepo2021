// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SingleMotorTest;

public class SingleMotorForward extends CommandBase {
  SingleMotorTest m_commandTest;
  /** Creates a new SingleMotorForward. */
  public SingleMotorForward(SingleMotorTest SMT) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_commandTest = new SingleMotorTest();
    addRequirements(m_commandTest);
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_commandTest.setSpeed(0.5);
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_commandTest.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

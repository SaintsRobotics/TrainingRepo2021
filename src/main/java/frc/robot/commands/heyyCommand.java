// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.heyy;

public class heyyCommand extends CommandBase {
  private heyy lol;
  /** Creates a new heyyCommand. */
  public heyyCommand(heyy a) {
    lol = a;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(a);
    
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    lol.setSpeed(0.5);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    lol.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

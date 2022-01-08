// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import frc.robot.subsystems.SwerveDrivetrainSubsystem;

public class AutonMoveCommand extends CommandBase {

  
  // member vars
  private SwerveDrivetrainSubsystem m_swerveDriveSubsystem;
  private double m_x;
  private double m_y;
  private double m_rot;
  private boolean m_fieldRelative;

  // Pid
  private PIDController m_xPID;
  private PIDController m_yPID;
  private PIDController m_rotPID;

  

  /** Creates a new AutonMoveCommand. */
  public AutonMoveCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    m_x = SwerveDrivetrainSubsystem.getPose2D().getTranslation().getX();
    m_y = SwerveDrivetrainSubsystem.getPose2D().getTranslation().getY();
    m_rot = SwerveDrivetrainSubsystem.getPose2D().getRotation().getRadians();
    m_fieldRelative = true;

    m_xPID = new PIDController(0.5, 0, 0);
    m_yPID = new PIDController(0.5, 0, 0);
    m_rotPID = new PIDController(-0.7, 0, 0);

    m_xPID.setTolerance(0.05);
    m_yPID.setTolerance(0.05);
    m_rotPID.setTolerance(Math.PI / 24);
    m_rotPID.enableContinuousInput(-Math.PI, Math.PI);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

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

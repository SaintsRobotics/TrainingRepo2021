// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareMap.SwerveDrivetrainHardware;

public class SwerveDrivetrainSubsystem extends SubsystemBase {
  private SwerveModule m_frontLeftWheel;
  private SwerveModule m_frontRightWheel;
  private SwerveModule m_rearLeftWheel;
  private SwerveModule m_rearRightWheel;

  private ChassisSpeeds m_chassisSpeeds;
  private SwerveDriveKinematics m_kinematics;

  /** Creates a new SwerveDrivetrainSubsystem. */
  public SwerveDrivetrainSubsystem(SwerveDrivetrainHardware hardware) {
    m_frontLeftWheel = hardware.frontLeft;
    m_frontRightWheel = hardware.frontRight;
    m_rearLeftWheel = hardware.rearLeft;
    m_rearRightWheel = hardware.rearRight;

    m_kinematics = new SwerveDriveKinematics(m_frontLeftWheel.getLocation(), m_frontRightWheel.getLocation(), m_rearLeftWheel.getLocation(), m_rearRightWheel.getLocation());
  }

  public void drive(double xSpeed, double ySpeed, double rotSpeed) {
    m_chassisSpeeds = new ChassisSpeeds(xSpeed, ySpeed, rotSpeed);
    SwerveModuleState[] swerveModuleArray = m_kinematics.toSwerveModuleStates(m_chassisSpeeds);
    m_frontLeftWheel.setState(swerveModuleArray[0]);
    m_frontRightWheel.setState(swerveModuleArray[1]);
    m_rearLeftWheel.setState(swerveModuleArray[2]);
    m_rearRightWheel.setState(swerveModuleArray[3]);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}

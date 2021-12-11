// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import frc.robot.AbsoluteEncoder;
import frc.robot.HardwareMap.SwerveModuleHardware;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj.controller.PIDController;

/** Add your docs here. */
public class SwerveModule {
    // fields
    private AbsoluteEncoder m_absoluteEncoder;
    private CANSparkMax m_driveMotor;
    private CANSparkMax m_turningMotor;
    private PIDController m_pidController;
    private Translation2d m_location;

    /** Creates a new SwerveDrivetrainSubsystem. */
    public SwerveModule(SwerveModuleHardware hardware, CANSparkMax driveMotor, CANSparkMax turningMotor, double x, double y, AbsoluteEncoder absEncoder) {
        m_absoluteEncoder = absEncoder;
        m_pidController = new PIDController(0.3, 0, 0);
        m_driveMotor = driveMotor;
        m_turningMotor = turningMotor;
        m_location = new Translation2d(x, y);
        m_driveMotor.setIdleMode(IdleMode.kCoast);
        m_turningMotor.setIdleMode(IdleMode.kCoast);
    }

    public void setState (SwerveModuleState desiredState) {
        m_turningMotor.set(m_pidController.calculate(m_absoluteEncoder.getAngleRadians(), desiredState.angle.getRadians()));
        m_driveMotor.set(desiredState.speedMetersPerSecond);
    }

    public Translation2d getLocation () {
        return m_location;
    }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import frc.robot.HardwareMap.SwerveModuleHardware;

/** Add your docs here. */
public class SwerveModule {
    /** Creates a new SwerveDrivetrainSubsystem. */
    public SwerveModule(SwerveModuleHardware hardware) {
    
    }

    public void setState (SwerveModuleState desiredState) {

    }

    public Translation2d getLocation () {
        return new Translation2d();
    }
}

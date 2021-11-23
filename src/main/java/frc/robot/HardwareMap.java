// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.SwerveModule;

/** Add your docs here. */
public class HardwareMap {
    public class SwerveDrivetrainHardware {
        public SwerveModule frontLeft = new SwerveModule(swerveModuleHardware);
        public SwerveModule frontRight = new SwerveModule(swerveModuleHardware);
        public SwerveModule rearLeft = new SwerveModule(swerveModuleHardware);
        public SwerveModule rearRight = new SwerveModule(swerveModuleHardware);
    }

    public class SwerveModuleHardware {
        
    }

    SwerveModuleHardware swerveModuleHardware = new SwerveModuleHardware();
}

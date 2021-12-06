// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class MotorConstants {
        public static final int portNumber = 2;
    }

    public static final class XboxControllerConstants {
        public static final int idNumber = 1;
    }

    public static final class SwerveConstants {
        /** Distance between centers of front and back wheels on robot. */
        public static final double WHEEL_BASE = 0.67;

        /** Distance between right and left wheels on robot. */
        public static final double TRACK_WIDTH = 0.5;

        public static final class AbsoluteEncoderConstants {
            public static final int frontLeftEncoder = 0;
            public static final int frontRightEncoder = 1;
            public static final int rearLeftEncoder = 2;
            public static final int rearRightEncoder = 3;
        }

        public static final class MotorConstants {
            public static final int frontLeftTurningMotor = 0;
            public static final int frontLeftDriveMotor = 1;

            public static final int frontRightTurningMotor = 2;
            public static final int frontRightDriveMotor = 3;

            public static final int rearLeftTurningMotor = 4;
            public static final int rearLeftDriveMotor = 5;

            public static final int rearRightTurningMotor = 6;
            public static final int rearRightDriveMotor = 7;
        }
    }
}

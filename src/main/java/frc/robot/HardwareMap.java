package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.subsystems.SwerveModule;
import frc.robot.Constants;

/** Add your docs here. */
public class HardwareMap {
        public class SwerveDrivetrainHardware {

                public SwerveModule frontLeft = new SwerveModule(swerveModuleHardware,
                                swerveModuleHardware.frontLeftDriveMotor, swerveModuleHardware.frontLeftTurningMotor,
                                Constants.SwerveConstants.WHEEL_BASE / 2, Constants.SwerveConstants.TRACK_WIDTH / 2, new AbsoluteEncoder(0));
                public SwerveModule frontRight = new SwerveModule(swerveModuleHardware,
                                swerveModuleHardware.frontRightDriveMotor, swerveModuleHardware.frontRightTurningMotor,
                                Constants.SwerveConstants.WHEEL_BASE / 2, -Constants.SwerveConstants.TRACK_WIDTH / 2, new AbsoluteEncoder(1));
                public SwerveModule rearLeft = new SwerveModule(swerveModuleHardware,
                                swerveModuleHardware.rearLeftDriveMotor, swerveModuleHardware.rearLeftTurningMotor,
                                -Constants.SwerveConstants.WHEEL_BASE / 2, Constants.SwerveConstants.TRACK_WIDTH / 2, new AbsoluteEncoder(2));
                public SwerveModule rearRight = new SwerveModule(swerveModuleHardware,
                                swerveModuleHardware.rearRightDriveMotor, swerveModuleHardware.rearRightTurningMotor,
                                -Constants.SwerveConstants.WHEEL_BASE / 2, -Constants.SwerveConstants.TRACK_WIDTH / 2, new AbsoluteEncoder(3));
        }

        public class SwerveModuleHardware {
                public CANSparkMax frontLeftTurningMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.frontLeftTurningMotor, MotorType.kBrushless);
                public CANSparkMax frontLeftDriveMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.frontLeftDriveMotor, MotorType.kBrushless);
                public AbsoluteEncoder frontLeftAbsoluteEncoder = new AbsoluteEncoder(
                                Constants.SwerveConstants.AbsoluteEncoderConstants.frontLeftEncoder);

                public CANSparkMax frontRightTurningMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.frontRightTurningMotor, MotorType.kBrushless);
                public CANSparkMax frontRightDriveMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.frontRightDriveMotor, MotorType.kBrushless);
                public AbsoluteEncoder frontRightAbsoluteEncoder = new AbsoluteEncoder(
                                Constants.SwerveConstants.AbsoluteEncoderConstants.frontRightEncoder);

                public CANSparkMax rearLeftTurningMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.rearLeftTurningMotor, MotorType.kBrushless);
                public CANSparkMax rearLeftDriveMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.rearLeftDriveMotor, MotorType.kBrushless);
                public AbsoluteEncoder rearLeftAbsoluteEncoder = new AbsoluteEncoder(
                                Constants.SwerveConstants.AbsoluteEncoderConstants.rearLeftEncoder);

                public CANSparkMax rearRightTurningMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.rearRightTurningMotor, MotorType.kBrushless);
                public CANSparkMax rearRightDriveMotor = new CANSparkMax(
                                Constants.SwerveConstants.MotorConstants.rearRightDriveMotor, MotorType.kBrushless);
                public AbsoluteEncoder rearRightAbsoluteEncoder = new AbsoluteEncoder(
                                Constants.SwerveConstants.AbsoluteEncoderConstants.rearRightEncoder);
        }

        public SwerveModuleHardware swerveModuleHardware;
        public SwerveDrivetrainHardware swerveDrivetrainHardware;

        public HardwareMap() {
                swerveModuleHardware = new SwerveModuleHardware();
                swerveDrivetrainHardware = new SwerveDrivetrainHardware();
        }
}
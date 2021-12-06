package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.subsystems.SwerveModule;
import frc.robot.Constants;

/** Add your docs here. */
public class HardwareMap {
    public class SwerveDrivetrainHardware {
        public SwerveModule frontLeft = new SwerveModule(swerveModuleHardware);
        public SwerveModule frontRight = new SwerveModule(swerveModuleHardware);
        public SwerveModule rearLeft = new SwerveModule(swerveModuleHardware);
        public SwerveModule rearRight = new SwerveModule(swerveModuleHardware);
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

    SwerveModuleHardware swerveModuleHardware = new SwerveModuleHardware();
}
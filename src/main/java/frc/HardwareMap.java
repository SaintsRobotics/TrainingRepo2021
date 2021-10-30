package frc;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.Constants;

public class HardwareMap {
    public class ShooterHardware {
        private CANSparkMax leftFlywheel;
        private CANSparkMax rightFlywheel;
        public SpeedControllerGroup flywheel;

        private WPI_VictorSPX wheels;
        private WPI_VictorSPX kicker;
        public SpeedControllerGroup feeder;

        public ShooterHardware() {
            leftFlywheel = new CANSparkMax(Constants.ShooterConstants.leftFlywheelPort, MotorType.kBrushless);
            leftFlywheel.setInverted(true);
            rightFlywheel = new CANSparkMax(Constants.ShooterConstants.rightFlywheelPort, MotorType.kBrushless);
            flywheel = new SpeedControllerGroup(leftFlywheel, rightFlywheel);

            wheels = new WPI_VictorSPX(Constants.ShooterConstants.wheelsPort);
            kicker = new WPI_VictorSPX(Constants.ShooterConstants.kickerPort);
            wheels.setInverted(true);
            feeder = new SpeedControllerGroup(wheels, kicker);
        }
    }
    
    public ShooterHardware shooterHardware;

    public HardwareMap() {
        shooterHardware = new ShooterHardware();
    }
}

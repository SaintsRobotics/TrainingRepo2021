package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;

public class HardwareMap {
    public class FeederHardware {

        private WPI_VictorSPX wheel;
        private WPI_VictorSPX kicker;

        public SpeedControllerGroup feeder;

        public FeederHardware() {
            wheel = new WPI_VictorSPX(5); // 5 is the port number
            kicker = new WPI_VictorSPX(6); // 6 is the port number

            feeder = new SpeedControllerGroup(wheel, kicker);
        }
    }

    public class FlywheelHardware {

        private CANSparkMax leftFlywheelMotor;
        private CANSparkMax rightFlywheelMotor;
        public SpeedControllerGroup flywheel;

        public FlywheelHardware() {
            leftFlywheelMotor = new CANSparkMax(7);
            rightFlywheelMotor = new CANSparkMax(8);
            flywheel = new SpeedControllerGroup(leftFlywheelMotor, rightFlywheelMotor);
        }
    }

    public FeederHardware feederHardware;
    public FlywheelHardware flywheelHardware;

    public HardwareMap() {
        feederHardware = new FeederHardware();
        flywheelHardware = new FlywheelHardware();
    }
}
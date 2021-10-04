package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SingleMotorSubsystem extends SubsystemBase {
    CANSparkMax motor = new CANSparkMax(1, MotorType.kBrushless);
    double targetSpeed = 0;
    public SingleMotorSubsystem() {
    }

    @Override
    public void periodic() {
        motor.set(targetSpeed);
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }

    
    public void setMotor(double speed) {
        this.targetSpeed = speed;
    }
}



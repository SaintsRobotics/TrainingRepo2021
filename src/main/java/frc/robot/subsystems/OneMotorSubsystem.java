package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class OneMotorSubsystem extends SubsystemBase{
    /** Creates a new ExampleSubsystem. */

     private CANSparkMax motor = new CANSparkMax(1,MotorType.kBrushless);
     private double speed;
  public OneMotorSubsystem() {
    
  }

  @Override
  public void periodic() {
    motor.set(speed); 

  }

  public void setSpeed(double x) {
    speed = x;
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
    
}

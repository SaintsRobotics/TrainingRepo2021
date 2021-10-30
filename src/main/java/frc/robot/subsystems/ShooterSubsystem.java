// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareMap.ShooterHardware;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  private SpeedControllerGroup m_feeder, m_flywheel;    

  
  


  public ShooterSubsystem(ShooterHardware shooter_hardware) {
    m_feeder = shooter_hardware.feeder; 
    m_flywheel = shooter_hardware.flywheel; 
  } 

  public void setFlywheelSpeed(double speed){ 
    m_flywheel.set(speed);

  }

  public void setFeederSpeed(double speed){
    m_feeder.set(speed);
  }




  @Override
  public void periodic() {
    
  } 

  
}

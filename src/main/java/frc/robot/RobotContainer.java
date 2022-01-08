// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import frc.robot.subsystems.MotorSubsystem;
// import frc.robot.commands.ClockwiseMotor;
// import frc.robot.commands.CounterclockwiseMotor;
import frc.robot.commands.JoystickControllerCommand;
import frc.robot.subsystems.SwerveDrivetrainSubsystem;
import frc.robot.Constants;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private XboxController m_driveController = new XboxController(Constants.XboxControllerConstants.idNumber);
  // private MotorSubsystem m_motorsubsystem = new MotorSubsystem();

  private SwerveDrivetrainSubsystem m_drivetrainSubsystem = new SwerveDrivetrainSubsystem(new HardwareMap().swerveDrivetrainHardware);

  private JoystickControllerCommand m_command = new JoystickControllerCommand(m_drivetrainSubsystem, m_driveController);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    m_drivetrainSubsystem.setDefaultCommand(m_command);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   * 
   * <p>Configure buttons such that button A moves motor clockwise and button B moves motor counterclockwise</p>
   */
  private void configureButtonBindings() {
    // new JoystickButton(m_driveController, Button.kA.value) // Code for single motor
    //   .whileHeld(new ClockwiseMotor(m_motorsubsystem));

    // new JoystickButton(m_driveController, Button.kB.value) // Code for single motor
    //   .whileHeld(new CounterclockwiseMotor(m_motorsubsystem));



  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    
    return m_autoCommand;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.CommandIntakeArm;
import frc.robot.commands.CommandIntakeMotor;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.FeederCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);  
  private XboxController m_xbox = new XboxController(0);
  private HardwareMap m_hardwareMap = new HardwareMap(); 
  private IntakeSubsystem m_intakeSubsystem = new IntakeSubsystem(m_hardwareMap.Intake_Hardware);  
  private CommandIntakeArm m_commandIntakeArm = new CommandIntakeArm(m_intakeSubsystem, m_xbox);
  private ShooterSubsystem m_shooterSubsystem = new ShooterSubsystem(m_hardwareMap.Shooter_Hardware);
   
  


  

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings(); 
    //m_intakeSubsystem.setDefaultCommand(m_commandIntakeArm);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //new JoystickButton(m_xbox, Button.kBumperLeft.value).whileHeld(new CommandIntakeMotor(m_intakeSubsystem));  
    new JoystickButton(m_xbox, Button.kBumperRight.value).whileHeld(new FeederCommand(m_shooterSubsystem));  
    new JoystickButton(m_xbox,Button.kA.value).toggleWhenPressed(new ShooterCommand(m_shooterSubsystem));

    
    
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

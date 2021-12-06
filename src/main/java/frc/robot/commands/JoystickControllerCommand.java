// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.security.spec.DSAGenParameterSpec;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveDrivetrainSubsystem;

/** An example command that uses an example subsystem. */
public class JoystickControllerCommand extends CommandBase {
    private final SwerveDrivetrainSubsystem m_subsystem;
    private final XboxController m_xboxController;

    public JoystickControllerCommand(SwerveDrivetrainSubsystem subsystem, XboxController xboxController) {
        m_subsystem = subsystem;
        m_xboxController = xboxController;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double y = -m_xboxController.getX(Hand.kLeft);
        double x = m_xboxController.getY(Hand.kLeft);
        double rotation = -m_xboxController.getX(Hand.kRight);

        m_subsystem.drive(x, y, rotation);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
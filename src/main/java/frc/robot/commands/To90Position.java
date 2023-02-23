package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.ClawConsts;
import frc.robot.subsystems.ClawSubsystem;

public class To90Position extends CommandBase {

  private ClawSubsystem clawSubsystem;

  public To90Position(ClawSubsystem claw) {
    clawSubsystem = claw;
    addRequirements(claw);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    clawSubsystem.rotateTo90();
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return Math.abs(ClawConsts.rotationTo90Count - clawSubsystem.getEncoder()) <= 10;
    //return 90 <= clawSubsystem.getEncoder() && clawSubsystem.getEncoder() <= 110;
  }
}

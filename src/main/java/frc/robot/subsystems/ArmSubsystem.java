// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
  public ArmSubsystem() {}

  public Command setArmAngle(Rotation2d angle) {
    return  run(()->{

    });
  }

  public boolean getHighLimit() {
    return false;
  }

  public boolean getLowLimit () {
    return false;
  }

  public Rotation2d getArmAngle() {
    return Rotation2d.fromDegrees(0);
  }

  public Trigger armBetweenAngles(Rotation2d startAngle, Rotation2d endAngle) {
    return new Trigger(()-> {
      return (this.getArmAngle().getDegrees() > startAngle.getDegrees()) &&
            (this.getArmAngle().getDegrees() < endAngle.getDegrees());
    });
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

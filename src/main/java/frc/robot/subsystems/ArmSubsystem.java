// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.units.Angle;
import edu.wpi.first.units.Measure;
import edu.wpi.first.units.Units;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class ArmSubsystem extends SubsystemBase
{

  /**
   * Creates a new ArmSubsystem.
   */
  public ArmSubsystem()
  {
  }

  public Command setArmAngle(Rotation2d angle)
  {
    return run(() -> {

    });
  }

  public boolean getHighLimit()
  {
    return false;
  }

  public boolean getLowLimit()
  {
    return false;
  }

  public Measure<Angle> getArmAngle()
  {
    return Units.Degrees.of(0);
  }

  public Trigger armBetweenAngles(Measure<Angle> startAngle, Measure<Angle> endAngle)
  {
    return new Trigger(() -> {
      return this.getArmAngle().lte(endAngle) && this.getArmAngle().gte(startAngle);
    });
  }


  @Override
  public void periodic()
  {
    // This method will be called once per scheduler run
  }
}

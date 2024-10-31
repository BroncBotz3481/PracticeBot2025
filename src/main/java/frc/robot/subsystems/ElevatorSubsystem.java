// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.units.Distance;
import edu.wpi.first.units.Measure;
import edu.wpi.first.units.Unit;
import edu.wpi.first.units.Units;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ElevatorSubsystem. */
  public ElevatorSubsystem() {

  }

  public Command setHeight(Measure<Distance> height){
    return  run(()->{

    });
  }

  public boolean elevatorLowLimit(){
    return false;
  }

  public boolean elevatorHighLimit(){
    return false;
  }

  public Trigger rightHeight(){
    return new Trigger(()-> {
      return ());
    });
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

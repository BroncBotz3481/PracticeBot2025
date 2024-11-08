package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.units.Units;

public class ScoringSuperstructure {
    private ArmSubsystem arm;
    private ElevatorSubsystem elevator;
    private IntakeSubsystem intake;

    public ScoringSuperstructure(ArmSubsystem arm, ElevatorSubsystem elevator, IntakeSubsystem intake)
    {
        this.arm = arm;
        this.elevator = elevator;
        this.intake = intake;
    }

    public void setupArmAutoIntake()
    {
        arm.armBetweenAngles(Units.Degrees.of(100), Units.Degrees.of(150))
                .whileTrue(intake.intake());
    }
}

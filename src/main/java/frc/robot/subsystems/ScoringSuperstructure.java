package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;

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
        arm.armBetweenAngles(Rotation2d.fromDegrees(100), Rotation2d.fromDegrees((150)))
                .whileTrue(intake.intake());
    }
}

package frc.robot.generated;

import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.FeedbackConfigs;
import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.MotorOutputConfigs;
import com.ctre.phoenix6.configs.Pigeon2Configuration;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.SoftwareLimitSwitchConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.MotionMagicExpoVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrainConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstantsFactory;
import com.ctre.phoenix6.signals.GravityTypeValue;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModule.ClosedLoopOutputType;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants.SteerFeedbackType;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.util.Units;
import frc.robot.subsystems.CommandSwerveDrivetrain;

// Generated by the Tuner X Swerve Project Generator
// https://v6.docs.ctr-electronics.com/en/stable/docs/tuner/tuner-swerve/index.html
public final class TunerConstants {
    // Both sets of gains need to be tuned to your individual robot.

    // The steer motor uses any SwerveModule.SteerRequestType control request with the
    // output type specified by SwerveModuleConstants.SteerMotorClosedLoopOutput
    private static final Slot0Configs steerGains = new Slot0Configs()
        .withKP(100).withKI(0).withKD(0.2)
        .withKS(0).withKV(1.5).withKA(0);
    // When using closed-loop control, the drive motor uses the control
    // output type specified by SwerveModuleConstants.DriveMotorClosedLoopOutput
    private static final Slot0Configs driveGains = new Slot0Configs()
        .withKP(3).withKI(0).withKD(0)
        .withKS(0).withKV(0).withKA(0);

    // The closed-loop output type to use for the steer motors;
    // This affects the PID/FF gains for the steer motors
    private static final ClosedLoopOutputType steerClosedLoopOutput = ClosedLoopOutputType.Voltage;
    // The closed-loop output type to use for the drive motors;
    // This affects the PID/FF gains for the drive motors
    private static final ClosedLoopOutputType driveClosedLoopOutput = ClosedLoopOutputType.Voltage;

    // The stator current at which the wheels start to slip;
    // This needs to be tuned to your individual robot
    private static final double kSlipCurrentA = 150.0;

    // Initial configs for the drive and steer motors and the CANcoder; these cannot be null.
    // Some configs will be overwritten; check the `with*InitialConfigs()` API documentation.
    private static final TalonFXConfiguration driveInitialConfigs = new TalonFXConfiguration();
    private static final TalonFXConfiguration steerInitialConfigs = new TalonFXConfiguration()
        .withCurrentLimits(
            new CurrentLimitsConfigs()
                // Swerve azimuth does not require much torque output, so we can set a relatively low
                // stator current limit to help avoid brownouts without impacting performance..
                .withStatorCurrentLimit(60)
                .withStatorCurrentLimitEnable(true)
        );
    private static final CANcoderConfiguration cancoderInitialConfigs = new CANcoderConfiguration();
    // Configs for the Pigeon 2; leave this null to skip applying Pigeon 2 configs
    private static final Pigeon2Configuration pigeonConfigs = null;

    // Theoretical free speed (m/s) at 12v applied output;
    // This needs to be tuned to your individual robot
    public static final double kSpeedAt12VoltsMps = 5.21;

    // Every 1 rotation of the azimuth results in kCoupleRatio drive motor turns;
    // This may need to be tuned to your individual robot
    private static final double kCoupleRatio = 3.5714285714285716;

    private static final double kDriveGearRatio = 6.122448979591837;
    private static final double kSteerGearRatio = 21.428571428571427;
    private static final double kWheelRadiusInches = 2;

    private static final boolean kInvertLeftSide = true;
    private static final boolean kInvertRightSide = false;

    private static final String kCANbusName = "rio";
    private static final int kPigeonId = 0;



    public static final double kConfigTimeoutSeconds = 0.1;

    // These are only used for simulation
    private static final double kSteerInertia = 0.00001;
    private static final double kDriveInertia = 0.001;
    // Simulated voltage necessary to overcome friction
    private static final double kSteerFrictionVoltage = 0.25;
    private static final double kDriveFrictionVoltage = 0.25;

    private static final SwerveDrivetrainConstants DrivetrainConstants = new SwerveDrivetrainConstants()
            .withCANbusName(kCANbusName)
            .withPigeon2Id(kPigeonId)
            .withPigeon2Configs(pigeonConfigs);

    private static final SwerveModuleConstantsFactory ConstantCreator = new SwerveModuleConstantsFactory()
            .withDriveMotorGearRatio(kDriveGearRatio)
            .withSteerMotorGearRatio(kSteerGearRatio)
            .withWheelRadius(kWheelRadiusInches)
            .withSlipCurrent(kSlipCurrentA)
            .withSteerMotorGains(steerGains)
            .withDriveMotorGains(driveGains)
            .withSteerMotorClosedLoopOutput(steerClosedLoopOutput)
            .withDriveMotorClosedLoopOutput(driveClosedLoopOutput)
            .withSpeedAt12VoltsMps(kSpeedAt12VoltsMps)
            .withSteerInertia(kSteerInertia)
            .withDriveInertia(kDriveInertia)
            .withSteerFrictionVoltage(kSteerFrictionVoltage)
            .withDriveFrictionVoltage(kDriveFrictionVoltage)
            .withFeedbackSource(SteerFeedbackType.FusedCANcoder)
            .withCouplingGearRatio(kCoupleRatio)
            .withDriveMotorInitialConfigs(driveInitialConfigs)
            .withSteerMotorInitialConfigs(steerInitialConfigs)
            .withCANcoderInitialConfigs(cancoderInitialConfigs);


    // Front Left
    private static final int kFrontLeftDriveMotorId = 8;
    private static final int kFrontLeftSteerMotorId = 11;
    private static final int kFrontLeftEncoderId = 12;
    private static final double kFrontLeftEncoderOffset = 0.1357421875;
    private static final boolean kFrontLeftSteerInvert = true;

    private static final double kFrontLeftXPosInches = 8.375;
    private static final double kFrontLeftYPosInches = 8.375;

    // Front Right
    private static final int kFrontRightDriveMotorId = 1;
    private static final int kFrontRightSteerMotorId = 3;
    private static final int kFrontRightEncoderId = 2;
    private static final double kFrontRightEncoderOffset = -0.151611328125;
    private static final boolean kFrontRightSteerInvert = true;

    private static final double kFrontRightXPosInches = 8.375;
    private static final double kFrontRightYPosInches = -8.375;

    // Back Left
    private static final int kBackLeftDriveMotorId = 13;
    private static final int kBackLeftSteerMotorId = 6;
    private static final int kBackLeftEncoderId = 5;
    private static final double kBackLeftEncoderOffset = -0.316162109375;
    private static final boolean kBackLeftSteerInvert = true;

    private static final double kBackLeftXPosInches = -8.375;
    private static final double kBackLeftYPosInches = 8.375;

    // Back Right
    private static final int kBackRightDriveMotorId = 7;
    private static final int kBackRightSteerMotorId = 10;
    private static final int kBackRightEncoderId = 9;
    private static final double kBackRightEncoderOffset = 0.330322265625;
    private static final boolean kBackRightSteerInvert = true;

    private static final double kBackRightXPosInches = -8.375;
    private static final double kBackRightYPosInches = -8.375;


    private static final SwerveModuleConstants FrontLeft = ConstantCreator.createModuleConstants(
            kFrontLeftSteerMotorId, kFrontLeftDriveMotorId, kFrontLeftEncoderId, kFrontLeftEncoderOffset, Units.inchesToMeters(kFrontLeftXPosInches), Units.inchesToMeters(kFrontLeftYPosInches), kInvertLeftSide)
            .withSteerMotorInverted(kFrontLeftSteerInvert);
    private static final SwerveModuleConstants FrontRight = ConstantCreator.createModuleConstants(
            kFrontRightSteerMotorId, kFrontRightDriveMotorId, kFrontRightEncoderId, kFrontRightEncoderOffset, Units.inchesToMeters(kFrontRightXPosInches), Units.inchesToMeters(kFrontRightYPosInches), kInvertRightSide)
            .withSteerMotorInverted(kFrontRightSteerInvert);
    private static final SwerveModuleConstants BackLeft = ConstantCreator.createModuleConstants(
            kBackLeftSteerMotorId, kBackLeftDriveMotorId, kBackLeftEncoderId, kBackLeftEncoderOffset, Units.inchesToMeters(kBackLeftXPosInches), Units.inchesToMeters(kBackLeftYPosInches), kInvertLeftSide)
            .withSteerMotorInverted(kBackLeftSteerInvert);
    private static final SwerveModuleConstants BackRight = ConstantCreator.createModuleConstants(
            kBackRightSteerMotorId, kBackRightDriveMotorId, kBackRightEncoderId, kBackRightEncoderOffset, Units.inchesToMeters(kBackRightXPosInches), Units.inchesToMeters(kBackRightYPosInches), kInvertRightSide)
            .withSteerMotorInverted(kBackRightSteerInvert);

    public static final CommandSwerveDrivetrain DriveTrain = new CommandSwerveDrivetrain(DrivetrainConstants, FrontLeft,
            FrontRight, BackLeft, BackRight);



    public static final class ShooterConstants {

              public static final int shooterTalonLeaderID = 20; 
              public static final int shooterTalonFollowerID = 15;
              public static final String shooterTalonCANBus = "rio";
          
              //public static final double shooterGearRatio = 0.5; // Sensor to Mechanism Ratio
              public static final double shooterGearRatio = 0.5;
          
              public static final double shooterVelocityTolerance = 250; // RPM
          
              public static final TalonFXConfiguration kShooterConfiguration = new TalonFXConfiguration()
                .withCurrentLimits(new CurrentLimitsConfigs()
                  .withStatorCurrentLimit(80)
                  .withSupplyCurrentLimit(60)
                  .withStatorCurrentLimitEnable(true)
                  .withSupplyCurrentLimitEnable(true))
                .withMotorOutput(new MotorOutputConfigs()
                  .withNeutralMode(NeutralModeValue.Coast)
                  .withInverted(InvertedValue.Clockwise_Positive))
                .withSlot0(new Slot0Configs()
                  //.withKS(1) 4499: s=1, v=.2, p=12, 
                  .withKV(.075) // 0.075
                  .withKP(.205) // 0.125
                  .withKI(0)
                  .withKD(0))
                .withFeedback(new FeedbackConfigs()
                  .withSensorToMechanismRatio(shooterGearRatio));
          
              public static final VelocityVoltage shooterControl = new VelocityVoltage(0, 0, false, 0, 0, false, false, false);
              public static final Follower followerControl = new Follower(shooterTalonLeaderID, true);
              public static final double kShooterVelocityUpdateFrequency = 10; // Hertz
            }
          


  }
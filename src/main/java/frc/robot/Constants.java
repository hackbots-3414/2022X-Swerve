package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {

    public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        public static final double kDriveMotorGearRatio = 5.8462;
        public static final double kTurningMotorGearRatio = 18.0;
        public static final double kPTurning = 0.5;
        public static final double kRadToTicks = 1024 / Math.PI;
        public static final double kTicksToRad = Math.PI / 1024;
        public static final double kMeterToTicks = 1024;
        public static final double kDriveMotorPositionConversion = kWheelDiameterMeters * Math.PI / 2048 / kDriveMotorGearRatio;
        public static final double kDriveMotorVelocityConversion = kDriveMotorPositionConversion * 10;
        public static final double kTurningMotorPositionConversion = 2048 / kTurningMotorGearRatio / 1024 * Math.PI;
        public static final double kTurningMotorVelocityConversion = kTurningMotorPositionConversion * 10;
    }

    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(21); // TODO
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(25.5); // TODO
        // Distance between front and back wheels
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        public static final int kFrontLeftDriveMotorPort = 8; // TODO
        public static final int kBackLeftDriveMotorPort = 2; // TODO
        public static final int kFrontRightDriveMotorPort = 6; // TODO
        public static final int kBackRightDriveMotorPort = 4; // TODO

        public static final int kFrontLeftTurningMotorPort = 7; // TODO
        public static final int kBackLeftTurningMotorPort = 1; // TODO
        public static final int kFrontRightTurningMotorPort = 5; // TODO
        public static final int kBackRightTurningMotorPort = 3; // TODO

        public static final boolean kFrontLeftTurningEncoderReversed = true; // TODO
        public static final boolean kBackLeftTurningEncoderReversed = true; // TODO
        public static final boolean kFrontRightTurningEncoderReversed = true; // TODO
        public static final boolean kBackRightTurningEncoderReversed = true; // TODO

        public static final boolean kFrontLeftDriveEncoderReversed = true; // TODO
        public static final boolean kBackLeftDriveEncoderReversed = true; // TODO
        public static final boolean kFrontRightDriveEncoderReversed = false; // TODO
        public static final boolean kBackRightDriveEncoderReversed = false; // TODO

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 0; // TODO
        public static final int kBackLeftDriveAbsoluteEncoderPort = 2; // TODO
        public static final int kFrontRightDriveAbsoluteEncoderPort = 1; // TODO
        public static final int kBackRightDriveAbsoluteEncoderPort = 3; // TODO

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false; // TODO
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false; // TODO
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false; // TODO
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = false; // TODO

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -0.254; // TODO
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -1.252; // TODO
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -1.816; // TODO
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -4.811; // TODO

        public static final double kPhysicalMaxSpeedMetersPerSecond = 5; // TODO
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI; // TODO

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 4; // TODO
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 4; // TODO
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3; // TODO
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3; // TODO
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4; // TODO
        public static final double kMaxAngularSpeedRadiansPerSecond = DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10; // TODO
        public static final double kMaxAccelerationMetersPerSecondSquared = 3; // TODO
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4; // TODO
        public static final double kPXController = 1.5; // TODO
        public static final double kPYController = 1.5; // TODO
        public static final double kPThetaController = 3; // TODO

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = new TrapezoidProfile.Constraints(kMaxAngularSpeedRadiansPerSecond, kMaxAngularAccelerationRadiansPerSecondSquared);  // TODO
    }

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0; // TODO

        public static final int kDriverYAxis = 1; // TODO
        public static final int kDriverXAxis = 0; // TODO
        public static final int kDriverRotAxis = 4; // TODO
        public static final int kDriverFieldOrientedButtonIdx = 1; // TODO

        public static final double kDeadband = 0.05; // TODO
    }
}

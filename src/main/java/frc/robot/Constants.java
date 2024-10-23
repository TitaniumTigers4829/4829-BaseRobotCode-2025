package frc.robot;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.util.Units;
import frc.robot.subsystems.swerve.SwerveConstants.*;

public final class Constants {

  public class LogPaths {
    public static final String SYSTEM_PERFORMANCE_PATH = "SystemPerformance/";
    public static final String PHYSICS_SIMULATION_PATH = "MaplePhysicsSimulation/";
    public static final String APRIL_TAGS_VISION_PATH = "Vision/AprilTags/";
  }

  public static final Mode currentMode = Mode.REAL;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }

  public static final class HardwareConstants {
    public static final double TIMEOUT_S = 0.05;

    public static final double SIGNAL_FREQUENCY = 250;

    public static final String CANIVORE_CAN_BUS_STRING = "canivore 1";
    public static final String RIO_CAN_BUS_STRING = "rio";

    public static final double MIN_FALCON_DEADBAND = 0.001;

    public static final double DEADBAND_VALUE = 0.05;
  }

  public static final class FieldConstants {
    public static final double FIELD_LENGTH_METERS = Units.inchesToMeters(653);
    public static final double FIELD_WIDTH_METERS = Units.inchesToMeters(325);

    public static final double RED_AMP_X = 14.82218074798584;
    public static final double RED_AMP_Y = 8.197;

    // TODO: tune
    public static final double RED_AMP_SHOOT_X = 14.82218074798584; // 14.77
    public static final double RED_AMP_SHOOT_Y = 7.774723052978516;

    public static final double BLUE_AMP_X = 1.9;
    public static final double BLUE_AMP_Y = 8.161;

    // TODO: tune
    public static final double BLUE_AMP_SHOOT_X = 1.9;
    public static final double BLUE_AMP_SHOOT_Y = 7.42;

    public static final Rotation2d RED_AMP_ROTATION = Rotation2d.fromDegrees(-90);
    public static final Rotation2d BLUE_AMP_ROTATION = Rotation2d.fromDegrees(-90);

    public static final double RED_SPEAKER_X = 16.511;
    public static final double RED_SPEAKER_Y = 5.55;

    public static final double BLUE_SPEAKER_X = 0;
    public static final double BLUE_SPEAKER_Y = 5.55;

    public static final double RED_LOADING_STATION_X = 1.1;
    public static final double RED_LOADING_STATION_Y = 1.169;

    public static final double BLUE_LOADING_STATION_X = 15.41;
    public static final double BLUE_LOADING_STATION_Y = 1.13;

    // ShootPassing constants
    public static final double RED_PASSING_X = 16.039363861083984;
    public static final double RED_PASSING_Y = 7.130331993103027;

    public static final double BLUE_PASSING_X = 1.343673825263977;
    public static final double BLUE_PASSING_Y = 6.969234943389893;
  }

  public static final class JoystickConstants {
    public static final int DRIVER_JOYSTICK_ID = 0;
    public static final int OPERATOR_JOYSTICK_ID = 1;

    public static final int LEFT_STICK_X_ID = 0;
    public static final int LEFT_STICK_Y_ID = 1;
    public static final int RIGHT_STICK_X_ID = 4;

    public static final int A_BUTTON_ID = 1;
    public static final int B_BUTTON_ID = 2;
    public static final int X_BUTTON_ID = 3;
    public static final int Y_BUTTON_ID = 4;

    public static final int LEFT_BUMPER_ID = 5;
    public static final int RIGHT_BUMPER_ID = 6;
    public static final int RIGHT_D_PAD_ID = 90;
    public static final int LEFT_TRIGGER_ID = 2;
    public static final int RIGHT_TRIGGER_ID = 3;
    public static final int RIGHT_STICK_Y_ID = 5;
  }
}

package frc.robot.subsystems.swerve.gyroIO;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.SPI;
import frc.robot.extras.util.AllianceFlipper;
// import frc.robot.extras.util.FieldMirroringUtils;
import frc.robot.subsystems.swerve.gyroIO.GyroInterface.GyroInputs;
import frc.robot.subsystems.swerve.odometryThread.OdometryThread;
import java.util.function.Supplier;

public class PhysicalGyro implements GyroInterface {
  private final AHRS gyro = new AHRS(SPI.Port.kMXP, (byte) 250);

  public PhysicalGyro() {
    OdometryThread.registerInput(getAngle());
  }

  @Override
  public void updateInputs(GyroInputs inputs) {
    inputs.isConnected = gyro.isConnected();
    inputs.yawDegrees = getGyroRotation2d();
    inputs.yawVelocity = getRate();
  }

  // @Override
  public void zeroHeading() {
    gyro.reset();
  }

  public void setOffset(double offset) {
    gyro.setAngleAdjustment(offset);
  }

  public Supplier<Double> getAngle() {
    return () -> -gyro.getAngle();
  }

  public double getYaw() {
    return -gyro.getAngle();
  }

  public Rotation2d getGyroRotation2d() {
    return gyro.getRotation2d();
  }

  public double getRate() {
    return -gyro.getRate();
  }

  public Rotation2d getGyroFieldRelativeRotation2d() {
    if (AllianceFlipper.isBlue()) {
      return getGyroRotation2d();
    }
    return AllianceFlipper.flipRotation(getGyroRotation2d());
  }
}

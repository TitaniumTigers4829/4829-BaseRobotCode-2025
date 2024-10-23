package frc.robot.subsystems.swerve.gyroIO;

import frc.robot.extras.simulation.OdometryTimestampsSim;
import frc.robot.extras.simulation.physicsSim.GyroSimulation;

public class SimulatedGyro implements GyroInterface {
  private final GyroSimulation gyroSimulation;

  public SimulatedGyro(GyroSimulation gyroSimulation) {
    this.gyroSimulation = gyroSimulation;
  }

  @Override
  public void updateInputs(GyroInputs inputs) {
    inputs.isConnected = true;
    inputs.odometryYawPositions = gyroSimulation.getCachedGyroReadings();
    inputs.odometryYawTimestamps = OdometryTimestampsSim.getTimeStamps();
    inputs.yawDegrees = gyroSimulation.getGyroReading();
    inputs.yawVelocity = gyroSimulation.getMeasuredAngularVelocityRadPerSec();
  }
}

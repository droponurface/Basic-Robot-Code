package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PortConstants;

public class ArmSubsystem extends SubsystemBase {
 private final CANSparkMax motor1;
 private final CANSparkMax motor2;
//creating objects of CANSparkMax class

 public ArmSubsystem() {
   this.motor1 = new CANSparkMax(PortConstants.ARM_MOTOR_PORT_1, MotorType.kBrushless);
   this.motor2 = new CANSparkMax(PortConstants.ARM_MOTOR_PORT_2, MotorType.kBrushless);
 }//initializing it

 public void motor1_speed(double speed) {
  this.motor1.set(speed);
 }

 public void motor2_speed(double speed) {
  this.motor2.set(speed);
 }

 public void motor1_motor2_speed(double motor1speed, double motor2speed) {
  this.motor1.set(motor1speed);
  this.motor2.set(motor2speed);
 }
 
 public void stopAllMotors() {
  motor1_motor2_speed(0.0, 0.0);
 }
}


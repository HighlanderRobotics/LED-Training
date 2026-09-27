// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.util.Color;

public class LEDSubsystem extends SubsystemBase {
  private AddressableLED aLed = new AddressableLED(3);
  private AddressableLEDBuffer aLedBuffer = new AddressableLEDBuffer(36);
  /** Creates a new LEDSubsystem. */
  private int incrementor = 1;
  public LEDSubsystem() {
    int aLedBufferLength = aLedBuffer.getLength();
    aLed.setLength(aLedBufferLength);
    aLed.start();
  }
  public void colorLED(int index, Color color){
      aLedBuffer.setLED(index, color);
  }
  public void colorAllLEDS(Color color) {
    for (int i=0; i < aLedBuffer.getLength(); i++) {
        aLedBuffer.setLED(i, color);
    }
  }
  public void colorPurpleWhite(){
    for (int i=0; i < aLedBuffer.getLength(); i++){
      if (i % 2 == 0 ){
        aLedBuffer.setLED(i, Color.kPurple);
        // Even becomes purple
      } else {
        aLedBuffer.setLED(i, Color.kWhite);
        // Odd becomes white
      }
    }
  }
  public void staticRainbow() {
    for (int i = 0; i < aLedBuffer.getLength(); i++) {
        aLedBuffer.setHSV(i, 180 / aLedBuffer.getLength() * i, 255, 128);
    }
  }
  public void dynamicRainbow(){
    incrementor++;
    System.out.println("test");
      for (int i = 0; i < aLedBuffer.getLength(); i++) {
        aLedBuffer.setHSV(i, 180 / aLedBuffer.getLength() * i + incrementor, 255, 128); // the mod 180 acts like a clamp so that it loops back
    }
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // dynamicRainbow();
    dynamicRainbow();
    aLed.setData(aLedBuffer);
  }
}

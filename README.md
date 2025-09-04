# LED Project

## Instructions
Here's your chance to make something that actually runs on the robot (and hopefully looks pretty slick)!

The goal is to assess your knowledge of Java and programming fundamentals, **not** robot code.
When you've completed an exercise, call over a lead so they can check you off.
You're welcome to work with teammates, as long as you understand why your code works.
Ask for help if you get stuck!

You may find [this](https://htmlcolorcodes.com/) helpful.

## Exercises
1. Clone this repository.
2. Create a new branch with your name.
3. Create a new `LEDSubsystem` class.
- Go to `src/main/java/frc/robot`.    
    Right-click on the `subsystems` folder in the VSCode sidebar and scroll until you see the "Create new class/command" button.
    Click that and select Subsystem from the dropdown.
    Name it `LEDSubsystem`.
    (This is still a class, it just has some boilerplate code filled out for us already)

<img alt="screenshot of creating a new class" src="assets/makeNewClass.png" width="400">

4. Declare one `AddressableLED` and one `AddressableLEDBuffer` member variable.
- These are the WPILib classes that let us control LEDs.
  You should be prompted to import them once you start typing.
  Initialize the `AddressableLED` with an ID of **2??** and the `AddressableLEDBuffer` with a length of **70??**
5. In the `LEDSubsystem` constructor, get the length of the `AddressableLEDBuffer` and set the length of the `AddressableLED` to it.
Then, start the `AddressableLED`.
6. Make a new method that sets an individual LED in the buffer to a `Color` (a WPILib class) from its index.
7. Make a method that sets all the LEDs in the buffer to a certain color.
8. Call the method you just created in `periodic()` in the `LEDSubsystem` file and declare a new `LEDSubsystem` member variable in `Robot.java`.
9. Make a method that sets every other LED to purple or white.
10. Make a method that sets the LEDs to a (static) rainbow, then make one that cycles through the rainbow.
11. Make a method that sets a short segment of purple lights to "run along" a background of white
12. Make something fun! :D

## Deploying Instructions
Connect to the robot wifi network.
Then, open the WPILib Command Palette (the little WPILib logo in the upper right corner of VSCode) and select `WPILib: Deploy Robot Code`.
This sends the code to the robot.
Then, use the NI Driver Station app to enable the robot, which you can download on your device or use the designated driver station laptop.
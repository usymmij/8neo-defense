package raidzero.frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class Robot extends IterativeRobot {
  private static XboxController control;
  private static PowerDistributionPanel pdp;

  private static final int MAX_MOTOR_CURRENT = 20;
  public static boolean safetyTripped = false;

  public static boolean getSafety() {
    return safetyTripped;
  }

  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    Base.init();
    pdp = new PowerDistributionPanel();
    control = new XboxController(0);
  }

  @Override
  public void teleopPeriodic() {
    Base.run(control.getY(Hand.kLeft),control.getY(Hand.kRight));
    //System.out.println(control.getY(Hand.kLeft) + " " + control.getY(Hand.kRight));
  }

  
  /*
  nothing beyond this point is of use
  */

  @Override
  public void testPeriodic() {
  }
}

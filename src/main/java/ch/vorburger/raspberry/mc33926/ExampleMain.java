package ch.vorburger.raspberry.mc33926;

import ch.vorburger.raspberry.motors.TwoMotors;


public class ExampleMain {

	public static void main(String[] args) throws Exception {
		TwoMotors twoMotors = new TwoMotorsProvider().get();
		// This is just to initially stop it.. handy if things went out of control! ;)
//		SafeMotors.move(motors -> { });
//		System.out.println("Hit Enter when ready for Rover to moving?");
//		System.console().readLine();

//		TurtleCalibration.main(args);

//		SafeTurtle.move(twoMotors, turtle -> {
//			triangle(turtle);
//			dance(turtle);
//		});
		twoMotors.motor1().setSpeed(480);
		//twoMotors.motor2().setSpeed(480);
		Thread.sleep(10000);
		twoMotors.motor1().setSpeed(0);
		Thread.sleep(10000);
		twoMotors.motor1().setSpeed(-480);
		Thread.sleep(10000);


	}


}

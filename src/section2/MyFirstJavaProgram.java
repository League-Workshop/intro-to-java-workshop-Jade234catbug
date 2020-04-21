package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot coolbean = new Robot();
		coolbean.penDown();
		coolbean.setSpeed(100);
		
		coolbean.move(54);
		coolbean.turn(90);
		coolbean.move(54);
		coolbean.turn(90);
		coolbean.move(54);
		coolbean.turn(90);
		coolbean.move(54);;
	
		
		
	}
}

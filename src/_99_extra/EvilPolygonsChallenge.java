package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		Robot rob=new Robot ();

		//2. Set the speed to 100
		rob.setSpeed(100);

		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color!", "Color Choosing", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Teal",}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		

		if (colorChoice==1) {
			rob.setPenColor(255, 0, 0);
		}
		else if (colorChoice==2) {
			rob.setPenColor(0, 255, 0);
		}
		else if(colorChoice==3) {
			rob.setPenColor(15, 249, 210);
		}
		
		
		//4. Ask the use how many polygons they want to be drawn.
		String poly= JOptionPane.showInputDialog("How many polygons do you want to be drawhn" );
		
		
		//5. Use the robot to draw the number of polygons the user requested.
		int drawn=Integer.parseInt(poly);
		for(int i=0; i<drawn; i++) {
			rob.penDown();
			rob.setAngle(350);
			rob.move(100);
			rob.setAngle(45);
			rob.move(100);
			rob.setAngle(135);
			rob.move(100);
			rob.setAngle(190);;
			rob.move(100);
			rob.setAngle(270);
			rob.move(105);
		//6. Make it so your shapes do not overlap
			rob.penUp();
			rob.move(5);

		//7. Challenge: add more colors to the Option Dialog.
	}
}
}

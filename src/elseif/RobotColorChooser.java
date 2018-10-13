//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
//package extra;
package elseif;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
//import java.awt.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot(); 
		//3. Ask the user what color they would like the robot to draw
		for(int i=0;i<134;i++) {
		String save=JOptionPane.showInputDialog(null,"what color would u like?? only red green and blue pls");
		
		//5. Use an if/else statement to set the pen color that the user requested
		
		 
		if(save.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if(save.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else 	if(save.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		
		else { 
			rob.setRandomPenColor();
			
			
		}
		
		
		
		
        //6. If the user doesn’t enter anything, choose a random color
     
    	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int j=0;j<4;j++) {
			rob.penDown();
			rob.setSpeed(23);
			rob.move(150);
			rob.turn(90);
		}
	}
			
		}
		
	}


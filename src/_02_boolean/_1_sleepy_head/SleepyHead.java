package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");

		// Set the boolean isWeekend based on the value they enter
		isWeekend=day.equals("saturday")||day.equals("sunday");
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend) {JOptionPane.showMessageDialog(null,"rest assured theres no school...");}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else{JOptionPane.showMessageDialog(null, "GET TO CLASS ALREADY ITS 7:40!");}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String grade = JOptionPane.showInputDialog("whats was the grade you got in your last exam?");
		int score = Integer.parseInt(grade);
		// If they scored more than 70, they passed the exam.
passedExam=score >= 70;
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		if(passedExam) {JOptionPane.showMessageDialog(null,"Congrats!" );}
		// otherwise, wish them better luck next time.
		else {JOptionPane.showMessageDialog(null, "better luck nextime");}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		JOptionPane.showInputDialog("What colo(u)r should we draw with?");
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		JOptionPane.showInputDialog("what shape should we draw with?");
		
		// Now you MUST use the && operator to join the booleans for this code. 
		&&
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}

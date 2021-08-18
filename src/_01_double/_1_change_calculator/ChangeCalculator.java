package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick =JOptionPane.showInputDialog("How many nickels do you have?   ");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nik = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dimm =JOptionPane.showInputDialog("How many dimes do you have?   ");
int dim = Integer.parseInt(dimm);
		// Ask the user how many quarters they have, and convert their answer
String quart =JOptionPane.showInputDialog("How many quarters do you have?   ");
int quar = Integer.parseInt(quart);
		//Ask the user how many pennies they have, and convert their answer
String penni =JOptionPane.showInputDialog("How many pennies do you have?   ");
int penn = Integer.parseInt(penni);
		// Calculate how much money the user has.  Hint: Use a double variable 
double change = 0.05*nik + 0.10*dim + 0.25*quar + 0.01*penn;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}


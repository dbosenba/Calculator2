package edu.ycp.cs320.calculator;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");
		System.out.println("Fasten your seatbelt!");
		
		Random rand = new Random();
		String name = new String();
		int keepGoing = 1;
		
		
		while(keepGoing==1){
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter your name and prepare for random pick up line. ");
			name = keyboard.next();
			int choice = rand.nextInt(4);
			switch(choice){
				case 0: System.out.print("How you doin, "+name+"?\n");
					break;
				case 1: System.out.print(name+", do you want me on you?\n");
					break;
				case 2: System.out.print("Hey "+name+", you DTF?\n");
				break;
				case 3: System.out.print("Yes? " +name + " Yes!\n" );
				break;
			}
			System.out.print("enter 1 to keep going");
			keepGoing = keyboard.nextInt();
		}
	}
}

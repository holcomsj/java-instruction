package ui;

import util.Console;

public class Challange_2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the ArrowHead Challange");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			int size = Console.getInt("How big is the arrowhead?");
			
			if (size % 2 != 0) {
				size++;
			}
			for (int i = 0; i < size ; i ++) {
				for (int j = 1; j < i +1; j++) {
					System.out.print(">");
				}
				System.out.println();
			}
			for (int i = (size -1); i> 0; i--) {
				for (int j = 1; j < i +1; j++) {
					System.out.print(">");
				}
				System.out.println();
			}
			choice = Console.getString("Continue?(y/n)");
		}

	}

}

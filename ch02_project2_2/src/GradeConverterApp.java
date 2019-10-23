import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter!\n");
		
		String cont = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(cont.equalsIgnoreCase("y")) {
		
			System.out.print("Enter Numerical Grade: ");
			int numGrade = sc.nextInt();
			if (numGrade < 60) {
				System.out.println("Letter Grade: F");
			}
			else if (numGrade < 68) {
				System.out.println("Letter Grade: D");
			}
			else if (numGrade < 80) {
				System.out.println("Letter Grade: C");
			}
			else if (numGrade < 88) {
				System.out.println("Letter Grade: B");
			}
			else if (numGrade < 101) {
				System.out.println("Letter Grade: A");
			}
			else {
				System.out.println("Please enter a valid grade.");
			}
			
			System.out.print("Continue?(y/n)");
			cont = sc.next();
		}
		sc.close();
		
		System.out.println("BYE!");
	} 

}

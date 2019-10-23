import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to the Table Of Powers");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an interger");
			int number = sc.nextInt();
			
			System.out.println("Number"+"\t"+ "Squared" +"\t"+"Cubed");
			System.out.println("======"+ "\t"+"=======" + "\t"+ "=====");
			for (int i = 1; i <= number; i++) {
				System.out.println(i + "\t" + i*i + "\t" + i*i*i);
			}
			
			
			
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}

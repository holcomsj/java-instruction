import java.util.Scanner;

public class TimeTravelCalc {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		
		String choice = "y";
		
		//Input
		Scanner sc = new Scanner(System.in);
			
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double milesTravelled = sc.nextDouble();
			
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			
			int hours = (int) (milesTravelled/mph);
			double mod = milesTravelled % mph;
			int minutes = (int) Math.round((mod/mph)*60);
			System.out.println("Estimated Travel Time\n"
								+ "--------------\n" +
								"Hours: " + hours + "\n"
								+ "Minutes " + minutes);
			
			
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
			
			
		}
		sc.close();
		System.out.println("Bye!");
	}

}

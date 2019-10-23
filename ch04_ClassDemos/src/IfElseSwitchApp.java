
public class IfElseSwitchApp {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		if (a<3) {
			System.out.println("a less than 3");
		}
		
		else if (a < 10) {
			System.out.println("a less than 10");
		}
		else {
			System.out.println("a is 10 or greater");
		}
		
		if ((a<10) && (b==10)) {
			System.out.println("hello");
		}
		
		if ((a>10) || (b<20)) {
			System.out.println("woohoo");
		}
		
		// nested statements
		if (a<10) {
			if (b<10) {
				System.out.println("b less than 10");
			}
			else {
				System.out.println("b greater than or equal to 10");
			}
			
		// demo of switch statement
			switch (a) {
				case 1:
					System.out.println("a is one");
					break;
				case 2:
					System.out.println("a is two");
					break;
				case 3:
					System.out.println("a is three");
					break;
				case 4:
					System.out.println("a is four");
					break;
				case 5:
					System.out.println("a is five");
					break;
				default:
					break;
				
					
				
			}
		}
	}

}

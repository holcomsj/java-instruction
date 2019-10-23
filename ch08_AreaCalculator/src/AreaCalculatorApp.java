
public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator!");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			String crs = Console.getString("Calculate the are of a circle, rectangle, or square (c/r/s)");
			if (crs.equalsIgnoreCase("c")) {
				Circle c = new Circle();
				c.setRadius(Console.getDouble("Enter a radius:  "));
				
				System.out.println("The area of the circle you entered is "+c.getArea());
				
			} else if (crs.equalsIgnoreCase("s")) {
				Square s = new Square();
				s.setWidth(Console.getInt("Enter a width:  "));
				
				System.out.println("The area of the square you entered is "+s.getArea());
				
			} else if (crs.equalsIgnoreCase("r")) {
				Rectangle r = new Rectangle();
				r.setHeight(Console.getDouble("Enter a height:  "));
				r.setWidth(Console.getDouble("Enter a width: "));
				
				System.out.println("The area of the circle you entered is "+r.getArea());
				
			}
			
			
			choice = Console.getYOrN("Continue?(y/n)");
		}
	
		
		System.out.println("Bye");
	}

}


public class PersonManagerApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the Person Manager App");
	
	String choice = "y";
	
	while(choice.equalsIgnoreCase("y")) {
		
		String cOrE = Console.getCOrE("Create customer or employee? (c/e)");
		
		if (cOrE.equalsIgnoreCase("c")) {
			Customer c = new Customer();
			c.setFirstName(Console.getString("First Name:  "));
			c.setLastName(Console.getString("Last Name:   "));
			c.setCustomerNumber(Console.getString("Customer Number:   "));
			
			System.out.println(c.toString());
		}
		else if (cOrE.equalsIgnoreCase("e")) {
			Employee e = new Employee();
			e.setFirstName(Console.getString("First Name:  "));
			e.setLastName(Console.getString("Last Name:   "));
			e.setSsn(Console.getString("Social Security Number(no dashes):   "));
			
			System.out.println(e.toString());
		}
		choice = Console.getYOrN("Do you wish to continue?(y/n)");
		
	}
	System.out.println("Bye");

	}

}

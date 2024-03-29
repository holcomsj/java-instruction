
public class PMApp_2 {

	public static void main(String[] args) {
		System.out.println("Welcome");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getCOrE("Create customer or employee?(c/e)");

			String firstName = Console.getString("First Name:  ");
			String lastName = Console.getString("Last Name:  ");

			Person p = null;
			if (type.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer Number:  ");
				Customer c = new Customer(firstName, lastName, customerNumber);
				p = c;
			} else if (type.equalsIgnoreCase("e")) {
				String ssn = Console.getString("SSN:  ");
				Employee e = new Employee(firstName, lastName, ssn);
				p = e;
			}
			System.out.println("You entered a new " +p.getClass().getName());
			System.out.println(p);
			
			Console.getYOrN("Continue?(y/n)");
		}

		System.out.println("Bye");

	}

}


public class ContactApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List Application");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			String firstName = Console.getString("Enter first name:   ");
			String lastName = Console.getString("Enter last name:   ");
			String email = Console.getString("Enter email:   ");
			String phoneNumber = Console.getString("Enter phone number:   ");
			
			Contact contact = new Contact(firstName, lastName, email, phoneNumber);
			
			System.out.println(contact.displayContact());
			
			choice = Console.getYOrN("Continue?(y/n)");
		}
	}
	


}

package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import business.Contact;
import business.TestContact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Contact Manager App");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		int command = 0;
		while (command != 99) {
			command = Console.getInt(getMenu(), 0, 100);
			switch (command) {
			case 1:
				System.out.println("List all contacts:");
				for (Contact c: contacts) {
					System.out.println(c);
				}
				break;
			case 2:
				// List w/o phone
				System.out.println("Contacts without phone numbers");
				List<Contact> contactsWithoutPhone = filterContactsWithoutPhone(contacts);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 3:
				// List w/o email
				System.out.println("Contacts without email");
				List<Contact> contactsWithoutEmail = filterContactsWithoutEmail(contacts);
				for (Contact c: contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 4:
				// List w/o phone: Lambda
				System.out.println("Contacts without phone numbers");
				contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() == null);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 5:
				// List w/o email: Lambda
				System.out.println("Contacts without email");
				contactsWithoutEmail = filterContacts(contacts, c -> c.getEmail() == null);
				for (Contact c: contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 6:
				// List named Mike Murach: Lambda
				System.out.println("Contacts named Mike Murach");
				List<Contact >contactMike = filterContacts(contacts, c -> c.getName().equals("Mike Murach"));
				for (Contact c: contactMike) {
					System.out.println(c);
				}
				break;
			case 7:
				//Lambda Predicate: no phone
				System.out.println("Contacts no phone");
				contactsWithoutPhone = filterContacts2(contacts, c -> c.getPhone()==null);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 8:
				//Lambda Consumer: print names
				System.out.println("Lambda Consumer print name");
				processContacts(contacts, c -> System.out.println(c.getName()));
				
				break;
			case 9: 
				System.out.println("Streams - list names for each contact missing phone");
				contacts.stream().filter(c -> c.getPhone()==null).
											forEach(c -> System.out.println(c.getName()));
				break;
			case 10:
				System.out.println("Map and reduce to a single string");
				String csv =  contacts.stream().map(c -> c.getName()).
									reduce("", (a,b)-> a + b + ", "	);
				csv =csv.substring(0, csv.length()-2);
				System.out.println("All contacts: "+csv);
				
			case 99:
				// exit
				break;
			default:
				System.out.println("Please enter a valid command");
				break;
			}
		}
		System.out.println("Peace");

	}

	private static String getMenu() {
		String msg = "\n1 = List Contacts" +
					 "\n2 = List Contacts without phone" +
					 "\n3 = List Contacts without email" +
					 "\n4 = Lambda: List Contacts without phone" +
					 "\n5 = Lambda: List Contacts without email" +
					 "\n6 = Lambda: Contact Mike Murach" +
					 "\n7 = Predicate: List Contacts without phone" +
					 "\n8 = Consumer: Print Names" +
					 "\n9 = Stream of contacts without phone" +
					 "\n10 = Map and reduce names to a single string" +
					 "\n99 = Exit\n" +
					 "\nCOMMAND: ";
		return msg;
	}
	
	public static List<Contact> filterContactsWithoutPhone(List<Contact> contacts){
		List<Contact> contactsWithoutPhone =  new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}
	
	public static List<Contact> filterContactsWithoutEmail(List<Contact> contacts){
		List<Contact> contactsWithoutEmail =  new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}
		return contactsWithoutEmail;
	}
	//make one method that can replace the above 2 methods
	public static List<Contact> filterContacts(List<Contact> contacts,
											   TestContact condition){
		List<Contact> filteredContacts =  new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	public static List<Contact> filterContacts2(List<Contact> contacts, 
											   Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	public static void processContacts(List<Contact> contacts,
								  Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
}

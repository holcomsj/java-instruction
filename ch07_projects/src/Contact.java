
public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	

	public Contact() {
		super();
	}

	public Contact(String firstName, String lastName, String email, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public String displayContact() {
		String s = "--------------------------------------------------------\n";
		s += "--------Contact Card------------------------------------\n"	;
		s += "Name:\t" + this.firstName + " " + this.lastName + "\nEmail:\t" + this.email + "\nPhone:\t"
				+ this.phoneNumber + "\n";
		s += "--------------------------------------------------------\n";
		return s;
	}

}

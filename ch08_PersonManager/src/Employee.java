
public class Employee extends Person {
	private String ssn;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

//	public String getSsn() {
//		return ssn.substring(5);
//	}
	
	public String getSsn() {
		return ssn.substring(5);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSSN: xxx-xx- " + getSsn();
	}
	
	
	
	
}

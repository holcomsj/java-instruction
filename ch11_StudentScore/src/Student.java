
public class Student implements Comparable {
	private String lastName;
	private String firstName;
	private int score;
	
	public Student() {
		super();
	}

	public Student(String lastName, String firstName, int score) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return lastName +", " +
				firstName + ": " +
				score;}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		int sortedResult = this.getLastName().compareToIgnoreCase(s.getLastName());
		if (sortedResult < 0) {
			return -1;
		} else if(sortedResult >0) {
			return 1;
		}else {
			sortedResult = this.getFirstName().compareToIgnoreCase(s.getFirstName());
			if (sortedResult < 0) {
				return -1;
			}else if (sortedResult > 0) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	
}

import java.util.Arrays;

public class StudentScoreApp {

	public static void main(String[] args) {
		System.out.println("The Student Scores App");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			int studNum = Console.getIntWithinRange("\nNumber of students: ", 0, 501);
			Student[] students = new Student[studNum];

			for (int i = 0; i < studNum; i++) {
				System.out.println("\nSTUDENT "+ (i+1));
				String firstName = Console.getString("Enter student first name: ");
				String lastName = Console.getString("Enter student last name: ");
				int score = Console.getIntWithinRange("Enter student score: ", -1, 101);

				students[i] = new Student(lastName, firstName, score);
			}
			Arrays.sort(students);
			System.out.println("\nSummary");
			for (Student s : students) {
				System.out.println(s);
			}
			choice = Console.getYOrN("Continue?(y/n)");

		}

	}
}

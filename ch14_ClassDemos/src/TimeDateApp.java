import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeDateApp {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		System.out.println(currentDate + "\n" + currentTime + "\n" + currentDateTime);

		LocalDate halloween2019 = LocalDate.of(2019, 10, 31);
		System.out.println(halloween2019);
		LocalDate christmas2019 = LocalDate.of(2019, 12, 25);
		System.out.println(christmas2019);
		
		LocalDateTime demoDay2019 = LocalDateTime.parse("2019-12-17T14:00:00");
		System.out.println(demoDay2019);
		
		System.out.println("Day of Christmas: "+christmas2019.getDayOfMonth());
		
		System.out.println("Compare dates/times");
		System.out.println(halloween2019.isBefore(christmas2019));
		System.out.println(christmas2019.compareTo(halloween2019));
		
		LocalDate newDate = halloween2019.withMonth(11);
		System.out.println(newDate);
		
		LocalDate date1 = LocalDate.of(2017, 2, 28);
		// throws exception LocalDate newDate1 = date1.withDayOfMonth(29);
		
		//adding and subtracting
		//date1 and adjust it to current date???
		LocalDate newDate2 = date1.plusYears(2).plusMonths(8).minusDays(6);
		System.out.println(newDate2);
		
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(df.format(newDate2));
		
	}

}

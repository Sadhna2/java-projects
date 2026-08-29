package day10;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateExamples {

	public static void main(String[] args) {
		System.out.println("default date using util.Date : "+new Date());
		LocalDate date1=LocalDate.now();
		System.out.println("default date using LocalDate: "+ date1);
		System.out.println("default datetime: "+LocalDateTime.now());
		System.out.println("default date plus 2 days: "+LocalDateTime.now().plusDays(2));
		System.out.println("default date plus 2 months: "+LocalDateTime.now().plusMonths(2));
		System.out.println("default date plus 3 years: "+LocalDateTime.now().plusYears(3));
		
		LocalDate dateBirth = LocalDate.of(2024,06,16);
		System.out.println(dateBirth);
		System.out.println(dateBirth.getDayOfMonth());
		System.out.println(dateBirth.getDayOfWeek());
		System.out.println(dateBirth.getDayOfYear());
		
		LocalDate cdate=LocalDate.now();
		System.out.println(cdate.compareTo(dateBirth));
		System.out.println(cdate.equals(cdate));
		String strdate="20-03-2025";
		LocalDate ld=LocalDate.parse(strdate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(ld);

	}

}

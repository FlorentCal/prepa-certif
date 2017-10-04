package questions.thirty;

import java.time.LocalDate;

public class Q31 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.ofYearDay(2015, 363);
		
		date.plusWeeks(2);
		
		System.out.println(date + " : " + date.isLeapYear());
	}

}

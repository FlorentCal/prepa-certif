package questions.one;

import java.time.format.DateTimeFormatter;

public class Q9 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y MM dd");
		
		String s1 = "2015 12 10";
		String s2 = "2015 3 1";
		String s3 = "2015 11 2";
		String s4 = "2015 4 12";
		
		formatter.parse(s1);
//		formatter.parse(s2);
//		formatter.parse(s3);
//		formatter.parse(s4);

	}

}

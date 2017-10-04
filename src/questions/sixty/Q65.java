package questions.sixty;

public class Q65 {

	public static void main(String[] args) {
		int marks = 77;
		
		String s = "Result ";
		
		if(marks > 75){
			s.concat("A");
		} else if(marks > 65){
			s.concat("B");
		} else if(marks > 65){
			s.concat("C");
		} else {
			s.concat("D");
		}
		
		System.out.println(s);

	}

}

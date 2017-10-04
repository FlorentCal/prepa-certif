package questions.thirty;

class Whiz{
	private String code = "IZ0-808";

	{ System.out.print(code + " ");}

	private static int QUESTIONS = 90;
	
	static{System.out.print(QUESTIONS + " ");}

	static{QUESTIONS -= 13; System.out.print(QUESTIONS + " ");}

	public Whiz(){
		System.out.print("constructor ");
	}
	
}

public class Q32 {

	public static void main(String[] args) {
		Whiz wh = new Whiz();
	}

}

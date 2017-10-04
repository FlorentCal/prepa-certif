package questions.one;

class Sup{
	String s = "";
	
	Sup(){
		s += "sup ";
	}
}

class Sub extends Sup{
	
	Sub(){
		s += "sub ";
	}
}

public class Q6 extends Sup {
	
	Q6(){
		s += "subsub ";
	}

	public static void main(String[] args) {
		System.out.print(new Q6().s);

	}

}

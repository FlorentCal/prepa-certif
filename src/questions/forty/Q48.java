package questions.forty;

public class Q48 {

	public static void main(String[] args) {
		
		int y =5;
		
		if (false && y++==11)
			System.out.println(y);
		else if(true || --y==4)
			System.out.println(y);
		// Erreur else avec paramètre
		//else(y==5){}

	}

}

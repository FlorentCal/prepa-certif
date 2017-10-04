package questions.thirty;

public class Q37 {
	
	int x = y;
	
	static int y = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print(new Q37().x + " ");
		
		System.out.print(y);

	}

	static{ y = 15; }
	
}

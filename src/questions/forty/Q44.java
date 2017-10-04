package questions.forty;

public class Q44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int x = Integer.parseInt("one");
		} catch (IllegalArgumentException e) {
			System.out.println("coucou");
			System.out.println(e.getMessage());
		}
	}

}

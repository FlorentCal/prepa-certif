package questions.forty;

import java.util.Arrays;

public class Q49 {

	public static void main(String[] args) {
		String[] strings = {"N", "L", "n", "O", "S"};
		
		Arrays.sort(strings);
		
		for (String string : strings) {
			System.out.print(string);
		}

	}

}

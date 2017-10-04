package questions.thirty;

import java.util.Arrays;

public class Q36 {

	public static void main(String[] args) {
		int[] a1 = {2, -1, 4, 5, 3};
		int[] a2 = {2, -1, 4, 5, 3};
		
		System.out.print((a1 == a2) + " ");
		System.out.print(Arrays.equals(a1, a2) + " ");
		// A décommenter pour tester
		//System.out.print(Arrays.deepEquals(a1, a2) + " ");
	}

}

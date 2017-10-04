package questions.seventy;

import java.util.Arrays;

public class Q71 {

	public static void main(String[] args) {
		int array[][][] = new int[1][2][3];
		
		array [0][0][0] = 8;
		array [0][0][2] = 12;
		array [0][0][1] = 10;
		array [0][1][0] = 40;
		array [0][1][2] = 11;
		array [0][1][1] = 21;
		
		int arr[][][] = {{{8, 10, 12}, {40, 21, 11}}};
		
		// Les autres sont pas égaux
		
		System.out.println(Arrays.deepEquals(array, arr));

	}

}

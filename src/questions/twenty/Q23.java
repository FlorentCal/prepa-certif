package questions.twenty;

public class Q23 {

	public static void main(String[] args) {
		L1:for(int i = 5, j = 0; i > 0; i--){
			L2:for(;j<5;j++){
				System.out.println(i + "" + j + " ");
				
				if(j == 0) continue L1;
			}
		}

	}

}

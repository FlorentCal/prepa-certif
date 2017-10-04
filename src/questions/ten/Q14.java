package questions.ten;

public class Q14 {

	static String out = "";
	
	public static void main(String[] args) {
		int x = 5, y = 8;
		
		if(x ++== 5)
			out += "1";
		if(x != 6){}
		else if(x > 9){ out += "2";}
		else if(y < 9){ out += "3";}
		else if(x == 6){ out += "4";}
		else{ out += "5";}
	
		System.out.println(out);
	}
}

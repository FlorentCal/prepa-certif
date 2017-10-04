package questions.one;

public class Q8 {
	
	public static void main(String[] args) {
		char c[] = new char[]{'a','b','c'};
		
		String cd = "abcdef".substring(4);
		
		String s1 = new String(c);
		System.out.println(s1);		
		
		s1 += cd;
		
		System.out.println(cd);
		System.out.println(s1);

	}
}

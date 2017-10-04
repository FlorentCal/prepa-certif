package questions.twenty;

public class Q25 {

	public static void main(String[] args) {
		Employer p = new Employer("Livera", 22);
		
		System.out.print(p.age + " ");
		
		updateAge(p, 30);
		
		System.out.print(p.age);

	}
	
	public static void updateAge(Employer ps, int a){
		ps.age = a;
	}

}

class Employer {
	Employer(String s, int i){
		name = s;
		age = i;
	}
	
	String name; 
	int age;
}

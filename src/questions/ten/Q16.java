package questions.ten;

public class Q16 {

	public static void main(String[] args) {
		try {
			print();
		} catch (Exception e) {	}

	}
	
	static void print(){
		try {
			throw new NullPointerException();
		} catch(ClassCastException e){
			System.out.println("Class Cast");
		}finally{
			System.out.println("Final");
		}
		System.out.println("OCAJP");
	}

}

package questions.thirty;

interface I{ void meth();}

class A implements I {
	void A(String s){
		
	}
	public void meth(){
		System.out.print("A");
	}
}

class C extends A implements I {
	public void meth(){
		System.out.print("C");
	}
}

public class Q33 {

	public static void main(String[] args) {
		A a = new A();
		C c1 = (C)a;
		c1.meth();
	}

}

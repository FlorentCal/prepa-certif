package questions.ten;

class A{
	// line 2
	A method(){
		return new A();
	}
}

class B extends A {
	// line 8
	B method(){
		return new B();
	}
}

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

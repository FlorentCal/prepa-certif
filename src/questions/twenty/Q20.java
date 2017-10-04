package questions.twenty;

public class Q20 {

	public static void main(String[] args) {

		// ClassCastException
		//Object o = new Object();
		
		// NullPointerException
		Object o = null;
		
		int size = size(o);
	}
	
	public static int size(Object obj){
		return ((int[])obj).length;
	}

}

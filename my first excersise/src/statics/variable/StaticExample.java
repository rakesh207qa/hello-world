package statics.variable;

public class StaticExample {
	
	public static int a=100;
	public int b=200;

	public static void main(String[] args) {
		a = 10;
	}
	
	public static void testStatic() {
		System.out.println("I'm in static method!!");
	}

}

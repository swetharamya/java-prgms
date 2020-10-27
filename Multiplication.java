package firstproject;

public class Multiplication {
	private int a = 40;
	private int b = 20;
	
	
	public Multiplication() {
		System.out.println("This is constructor class");

	}
	public int mult() {
		int mul = a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		
		Multiplication mulref = new Multiplication();
		
		int mult = mulref.mult();
		
		System.out .println("Multiplication of two num is = "+ mult);
		
	}


}

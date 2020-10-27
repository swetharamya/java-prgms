package firstproject;

public class Division {
	
	private int a = 40;
	private int b = 20;
	
	
	public Division() {
		System.out.println("This is constructor class");

	}
	public int div() {
		int div = a/b;
		return div;
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		
		Division divref = new Division(); 
		
		int div = divref.div();
		
		System.out .println("Division of two num is = "+ div);
		
	}

}

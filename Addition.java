package firstproject;

public class Addition {


	private int a = 10;
	private int b = 20;
	private int c = 30;
	
	public Addition() {       //constructor class
		System.out.println("This is constructor class");
		//a=10;
		//b=20;
		//c=30;

	}
	public int add() {         //method
		int sum = a+b+c;
		return sum;
	}
	
	public static void main(String[] args) {             //main method
		
		System.out.println("This is main method");
		Addition addref = new Addition();
		//int a=10;
		//int b=20;
		int sum = addref.add();
		System.out .println("sum of three num is "+ sum);
		
	}

}

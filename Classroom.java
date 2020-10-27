package firstproject;

public class Classroom {

	private String benches;
	private String blackboard;
	private String chalk;
	private String students;
	private String books;
	public void constructClass() {
		System.out.println("This is a class room");
	}
	public static void main(String[] args) {
		System.out.println("This is project1");
	    Classroom objectReference = new Classroom();
	    objectReference.constructClass();
		
	}

}

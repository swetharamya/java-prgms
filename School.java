package firstproject;

public class School {
	private String staff;
	private String books;
	private String students;
	private String benches;
	
	public  void constructRoom() {
		System.out.println("This is a class room");
	}
	public void constructBenches() {
		System.out.println("These are benches");
	}
	public  void constructblackBoard() {
		System.out.println("This is a blackboard");
	}
	public  void constructplayGround() {
		System.out.println("This is a play ground");
	}
	public  void constructPrincipal() {
		System.out.println("He is the principal");
	}
	
	public static void main (String[] args) {                     
		System.out.println("This is a main Class");
		School objectReference = new School();      //--->creating a space for a school
		objectReference.constructRoom();           //--->calling the object	
		objectReference.constructBenches();
		objectReference.constructblackBoard();
		objectReference.constructplayGround();
		objectReference.constructPrincipal();
	}


}

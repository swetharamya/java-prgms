package firstproject;

public class Grocery {
	//These are attributes
			private String Dairy;
			private String species;
			private String fruits;
			private String vegtables;
			private String panetry;
			
			public void constructGrocery() {
				System.out.println("This is a grocery store");
				
			}
			public static void main(String[] args) {
				System.out.println("This is project1");
			    Grocery objectReference = new Grocery();
			    objectReference.constructGrocery();   //calling attributes and methods
			
		}


}

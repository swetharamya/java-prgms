package firstproject;

public class Bus {
	//These are attributes
			private String Driver;
			private String diesel;
			private String seats;
			private String conductor;
			private String people;
			
			//actions being performed
			public void constructBus() {
				System.out.println("This is a bus");
			}
			
			//main function
			public static void main(String[] args) {
				System.out.println("This is project1");
			    Bus objectReference = new Bus();
			    objectReference.constructBus();   //calling attributes and methods
			}


}

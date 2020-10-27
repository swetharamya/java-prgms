package firstproject;

public class ClassA {

    private String var1 = "swetha";
    private int var2 = 10;
    
   public String method() {
   	System.out.println("this is calss a ");
   	return var1;
   }
   
    public static void main(String[] args) {
   	 ClassA aref = new ClassA(); 
        int integervar = aref.var2;
        System.out.println("this is an integer");
        System.out.println("integer value = "+integervar);
        
        String stringvar = aref.var1;
        System.out.println("This is a string");
        System.out.println("string name = " + stringvar);
        
        
    
    }


}

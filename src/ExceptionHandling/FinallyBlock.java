package ExceptionHandling;

public class FinallyBlock {
	static int i;

public static void main(String[] args) {
      System.out.println("A");
      
      try {
    	  i = 9/3;
      }	  
//      }catch(ArithmeticException e) {
//    	  System.out.println("AE is Coming...");
//    	  e.printStackTrace();
//      }
      finally {
    	  System.out.println("this is finally block.....");
    	  System.out.println(i);
    	  try {
    	  int k = 9/0;
      }catch(ArithmeticException e){
    	  System.out.println("ArithmeticException is coming");
    	  
      }
	}
}
}

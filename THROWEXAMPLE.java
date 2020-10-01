import java.util.Scanner;
public class THROWEXAMPLE {
	 public static void checkAge(int age)
	 {  
	     if(age<18)  
	      throw new ArithmeticException("Not eligible.");  
	     else  
	      System.out.println("You are eligible for voting.");  
	   }  
	   public static void main(String[] args)
	   {  
		  System.out.println("Please enter your age: ");
		  Scanner sc=new Scanner(System.in);
	      int a=  sc.nextInt(); 
	      checkAge(a); 
	  }  

}

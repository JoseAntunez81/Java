import java.util.Scanner;
public class NumberTypeSign {

	
	public static void main(String[] args) {
		
	
		Scanner cinput = (new Scanner(System.in));
		
		System.out.print("Please enter a number: ");
		int num = (cinput.nextInt());

		 if (num % 2 == 0)
			 System.out.println("Your number is even!");
		 else
			 System.out.println("Your number is odd!");	
		 
		 if (num > 0)
			 System.out.println("Your number is positive!");
		 else
			 System.out.println("Your number is negative!");
		 }
	
	}



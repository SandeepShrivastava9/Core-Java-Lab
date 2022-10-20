
/* Write a program : WAP to find the 1.square
2. cube 
3. check number is even or odd using switch case."
@author: Sandeep Shrivastava
@date: 20 0ct
*/

//importing scanner
import java.util.Scanner;

// declaring class
class SquareCubeOdd

{
	// method for square
	static void square(int num1)
	{
		int square = num*num;
		System.out.println("Square of number is : "+square);
	}
	// end of method
	
	//method for cube
	static void cube(int num1)
	{
		int cube = num*num*num;
		System.out.println("Cube of number is : "+cube);
	}
	// end of method
	
	//method for ODD & EVEN
	static void EvenOdd(int num1)
	{
		if(n1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	//  end of method
	
	// main started
	public static void main (String args[])
	
	{
		// creating object for scanner
		Scanner sc = new Scanner(System.in);
		
		// taking input
		System.out.println("Enter the Value ");
		int num = sc.nextInt();
		
		// switch case menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even/Odd");
		System.out.println("4. Exit");
		
		int choice= sc.nextInt();
		
		// starting of switch case
		switch(choice)
		{
			case '1': square(int num1);
			break;
			case '2': cube(int num1);
			break;
			case '3': EvenOdd(int num1);
			break;
			case '4': System.exit(0);
			break;
		  default : System.out.println("Wrong Input");	
		}
		// end of switch case
		
	}
	// end of main
}
// end of class SquareCubeOdd
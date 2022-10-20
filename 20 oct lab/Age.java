
/* Write a program : Take input of age of 3 people by user and determine oldest and youngest among them.
@author: Sandeep Shrivastava
@date: 20 0ct
*/

// importing package
import java.util.Scanner;

// declaring age
class Age
{
	
	// method to find the oldest
	static void old (int age1, int age2, int age3)// formal / dummy arrgument
	{                     
		// using of else if 
		 if((age1>age2) && (age1>age3))
            System.out.println("First Person is the Oldest."+age1);
		     
           			 else if(age2>age3 )
                       System.out.println("Second Person is the Oldest."+age2);
				   
				        else 
                          System.out.println("Third Person is the Oldest."+age3);
       
    	                                     
		     // end of if else
	}
     // end of method
	 
	 // method to find the Youngest
	static void young (int age4, int age5, int age6)// formal / dummy arrgument
	{
		  if((age4<age5) && (age4<age6))

           System.out.println("First Person is the Youngest."+age4);

       else if(age5<age6)

           System.out.println("Second Person is the Youngest."+age5);

       else 

           System.out.println("Third Person is the Youngest."+age6);                     // using of else if 
		     // end of if else
	}
     // end of method
	 
	 // main started
       public static void main(String args[])
	  {
         //Creating Scanner Class Object
		 Scanner sc=new Scanner(System.in);
		 
		 int age1,age2,age3;
		 System.out.println("Enter the Age of First Person:");
		 age1=sc.nextInt();
		 
		 System.out.println("Enter the Age of Second Person:");
		 age2=sc.nextInt();
		 
		 System.out.println("Enter the Age of Third Person:");
		 age3=sc.nextInt();
		 
		 Old(age1,age2,age3);
		 Young(age1,age2,age3);
		 
		 
	 }
	  
	  // end of main
}
// end of class Age 
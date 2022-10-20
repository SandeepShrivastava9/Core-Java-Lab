
/*
 WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
 @author: Sandeep Shrivastava
 @date: 20 oct
 Java lab test
 */
 
 //importing package
 import java.util.Scanner;
 
 //declaring class
 class Discount
 {    
     // method for calculating amount
	 static void calcPrice(float amount, float quantites)// formal arrgument
	 {
		 float price;
		 
		price= amount*quantites;
		 
		 //calling method to calculating
		calcPrice(price);
	 }	 
		 // end of method
 
     // method for giving discount 
	 static void calcPrice(float price, float discount) // formal / dummy arrgument
	 { 
		 float finalPrice= (price * discount) / 100;
		 
		 if (finalPrice>=2000)
			System.out.println("Congratulation!!! you have given discount of 10%..!!!");
		   
		 else
			System.out.println("Sorry, Better luck next time"); 
				
				 
	 }
	   // end of method
	   
	   // main started
	  public static void main(String args[])
	  {
        // declaring the object for scanner
		Scanner sc = new Scanner(System.in);

        ////declaring  variables 
		float price,discount,amount,quantites,finalPrice;		
		
		//taking input
		System.out.println("Enter the Amount:");
		amount= sc.nextFloat();
		
		System.out.println("Enter the Quantites:");
		quantites= sc.nextFloat();
		
	 //calling methd of to discountedPrice
		finalPrice(price,discount);
	  }
// end of main
 }
//end of class Discount
	 
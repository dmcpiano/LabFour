package LabFour;

import java.util.Scanner;

public class SquaresNCubes {
	
	public static void main (String[] args)  {
		
		Scanner scnr = new Scanner (System.in);
		
		String userSays = "y";
		int userInput = 0;
		
		do {
			System.out.print("Enter a number. ");
			userInput = scnr.nextInt();
			System.out.println();
			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "======", "=======", "=====");
			
		for (int i = 1; i <= userInput; i++) {
			    
			System.out.printf("%-10s %-10s %-10s\n", (int) i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			    
		}  
		
			System.out.println();
			System.out.println("Continue y/n? ");
			userSays = scnr.next();
			System.out.println();
				
		
		} while (userSays.equals("y"));
		}
		
		
	} 

/* CodingBat Assignment: 
  
    public boolean nearHundred(int n) {

	int subtraction1 = Math.abs(n - 100);
	int subtraction2 = Math.abs(n - 200);

	if (subtraction1 <= 10 || subtraction2 <= 10)
    	return true;
	else {
  		return false;
	  }
	}
*/
 




			
		
		
	
	

				
				
		
	
			    
        
            
        
	
	


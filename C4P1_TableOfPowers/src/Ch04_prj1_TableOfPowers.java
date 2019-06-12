import java.util.Scanner;
import java.lang.Math;
public class Ch04_prj1_TableOfPowers { 

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
			
		///Welcome
			System.out.println("Welcome to the Squares and Cubes table");		
				
			while (choice.equalsIgnoreCase("y")) {	
				
				//Prompt
				System.out.println("Enter an integer: ");
				int getnumber 	= 	sc.nextInt();
							
				//Bus Logic	
				 System.out.println("Number	" + "Squared	" + "Cubed");
				 System.out.println("======	" + "=======	" + "=====");
				 for(int i = 1; i <= getnumber; i++) {		
					double squared 	= 	Math.pow(i,2);
					double cubed 	= 	Math.pow(i,3);
					int s			=	(int)Math.round(squared);
					int c			=	(int)Math.round(cubed);
					System.out.println(i + "	" + s + "	" + c);
				 }	
				 System.out.print("Continue? (y/n): ");
			     choice = sc.next();
			     
			}
								
	//Bye			
		
        System.out.println("Bye");
               

	}
}


	


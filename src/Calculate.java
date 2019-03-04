import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		//Goal: have user enter values of length & width
		//Display the perimeter of the perimeter
		//Ask if the user wants to continue
		
		double length;
		double width; 
		double perimeter;
		String answer;
		
		Scanner scnr = new Scanner (System.in);
		
		do {
			
		System.out.println("Enter Length:");
		length = scnr.nextDouble();
		System.out.println("Enter Width:");
		width = scnr.nextDouble();
		
		perimeter = length * width;
		System.out.println(perimeter);
		
		System.out.println("Continue? (Y/N)");
		answer = scnr.next();
		
		}while(answer.equalsIgnoreCase("Y"));
		
	}
	
//	public double perimeter (double length, double width) {
//
//		double perimeter;
//		Scanner scnr = new Scanner (System.in);
//		System.out.println("Enter length:");
//		System.out.println("Enther width:");
//		perimeter = length * width;
//		
//		return perimeter;
//}
}

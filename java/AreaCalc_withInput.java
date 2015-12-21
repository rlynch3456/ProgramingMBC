import java.util.Scanner;

/** 
 * Demonstration of simple functions to 
 * calculate the area of simpel geometric shapes.
 * This version is interactive, using Scanner class
 * to take user input.</br></br>
 * 
 * Created for merit badge college. </br></br> 
 * Released to the public under the MIT license.
 *
 * @author Rich Lynch
 * @version 10.
 */ 
public class AreaCalc_withInput {
	/* This is the main function of the program, all executable programs have a main */
	public static void main(String[] args) {
		double radius;
		double area;
		Scanner scannerDouble = new Scanner(System.in);
	
		/*
			Use the Scanner object to get user input from the keyboard.
			In this case we are looking for a double
		*/
		System.out.print("Enter radius: ");
		if(scannerDouble.hasNextDouble()){
			radius = scannerDouble.nextDouble();
			area = calculateCircleArea(radius);
			
			/* We only want a radius that is positive */
			if(area != 0)
				System.out.println("Area = " + area);
			else
				System.out.println("Invalid radius");
		}
		else{
			System.out.println("Invalid input, please try again.");
			return;
		}
		
		/* It is up to the student to expand this to support rectangles */
		
	}
	/**
	 * Calculate the area of a circle.
	 * @param radius The radius of the circle.
	 * @return The area of the circle if radius is greater than zero, otherwise returns zero.
	 */ 
	public static double calculateCircleArea(double radius){
		if(radius <= 0){

			return 0;
		}
		else{
			double area = radius * radius * Math.PI;
			return area;
		}
		
	}

}

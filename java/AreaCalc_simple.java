import java.util.Scanner;

/** 
 * Demonstration of simple functions to 
 * calculate the area of simpel geometric shapes.</br></br>
 * 
 * Created for merit badge college. </br></br> 
 * Released to the public under the MIT license.
 *
 * @author Rich Lynch
 * @version 10.
 */ 
public class AreaCalc_simple {

	/* This is the main function of the program, all executable programs have a main function.s*/
	public static void main(String[] args) {
		
		/* Local variables used in the program */
		double radius = 10;	/* Here we initilize the redius to a value of 10 */
		double area;
		
		/* Get the area of a circle with the radius supplied */
		area = calculateCircleArea(radius);
			
		/* 
			If the area is zero, something went wrong, inform the user and end. 
			Otherwise, print out the area.
		*/	
		if(area != 0)
			System.out.println("Area of a circle with radius of " + radius + " is " + area);
		else
			System.out.println("Invalid radius");
		
		/* Now it is up to the student to do the same for a rectangle. */

	}
	/**
	 * Calculate the area of a circle.
	 * @param radius The radius of the circle.
	 * @return The area of the circle if radius is greater than zero, otherwise returns zero.
	 */ 	
	public static double calculateCircleArea(double radius){

		/* If the radius is less than or equal to zero, consider this an error. */ 
		if(radius <= 0){
			return 0;
		}
		/* Otherwise, calculate the area of the circle, and return. */
		else{
			double area = radius * radius * Math.PI;
			return area;
		}
		
	}

}

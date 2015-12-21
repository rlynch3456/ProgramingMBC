import java.lang.Math;
import java.util.*;

 /**
  * Implementation of a basic circle object.
  */ 
 public class Circle extends Shape {
    private double radius;
    final double PI = Math.PI;
    
    /**
     * @param x X-coordinate of circle center
     * @param y Y-coordinate of circle center
     * @param radius Radius of circle, mus be greater than zero, otherwise will be set to default of 1.0.  A circle with zero of negative 
     * radius just does not make sense.
     */ 
    public Circle(double x, double y, double radius) {
        if(radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
            
        this.moveTo(x, y);
    }
    
    /**
     * Returns the area of the circle
     * @return The area of the circle
     */  
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    
    /**
     * Returns the perimeter of the circle
     * @return The perimeter of the circle.
     */  
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    
    /**
     * Set the radius of the circle.  New radius must be greater than zero,
     * otherwise radius will remain unchanged.
     * @param radius New radius of cricle.
     */ 
    public void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
    }
    
    /**
     * Get the radius of the circle
     * @return The radius of the circle.
     */ 
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * Output basic information about the circle.
     * @return x/y position of circle and radius.
     */ 
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.getClass().getName() + " Object { \n");
        result.append("  Radius: " + this.radius + "\n");
        result.append("  Position: [" + this.getX() + ", " + this.getY() + "]\n");
        result.append("}\n");
        return result.toString();
    }
    
}
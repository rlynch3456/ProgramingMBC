public class ShapeTest {
    
    public static void main( String[] args ) {
        
        /* create a circle at 1, 1 with a radius of 10. */
        Circle circle = new Circle(1, 1, 10);
        
        /* get the area */
        System.out.println("Area: " + circle.getArea());
        
        /* Test printing the object.  This will call the toString method. */
        System.out.println(circle);
        
        /* Now move the circle and print */
        circle.moveTo(10,10);
        System.out.println(circle);
        
        /* Try to move the circle by specifing a new Point object and print */
        Point point = new Point(100.0, 100.0);
        circle.moveTo(point);
        System.out.println(circle);
        
        /* Now change the radius and see the results */
        circle.setRadius(2);
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle);
        
        /*  
            Just for fun, create a Rectangle object 
            It is left to the student to implement the Rectangle class and add
            some more testing here.
        */
        Rectangle rectangle = new Rectangle();

        return;
        
    }
}
/**
 * Abstract Class Shape
 * Defines a base class for 2-d geometric shapes.
 */
  public abstract class Shape {

     private Point origin;
     
     public Shape() {
      origin = new Point();
     }

     /**
      * Returns area of shape.  To be implemented by the derived class.
      * @return Area of shape.
      */ 
     public abstract double getArea();
     
     /**
      * Returns perimeter of shape.  To be implemented by the derived class.
      * @return Perimeter of shape.
      */
     public abstract double getPerimeter();


     /**
      * Move to new position.
      * @param x X-coordinate of center of shape.
      * @param y Y-coordinate of center of shape.
      */ 
     public void moveTo(double x, double y) {
      origin.moveTo(x,y);
     }
     
     /**
      * Move to new position.
      * @param point The new position.
      */ 
     public void moveTo(Point point) {
      origin.moveTo(point);
     }
     
     /**
      * Move to new position.
      * @param dx X direction delta.
      * @param dy Y direction delta.
      */ 
     public void move(double dx, double dy) {
      origin.move(dx, dy);
     }
     
     /**
      * Return X-coordinate of the center of the shape.
      * @return X-coordinate of the center of the shape.
      */
     public double getX() {
      return origin.getX();
     }
     
     /**
      * Return Y-coordinate of the center of the shape.
      * @return Y-coordinate of the center of the shape.
      */ 
     public double getY() {
      return origin.getY();
     }
     
 }

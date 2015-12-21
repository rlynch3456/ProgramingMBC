/**
 * Implementation of a basic 2-dimensional point class.
 */ 

public class Point {
    protected double x,y;
    /**
     * Defaults to position of [0, 0]
     */ 
    public Point() {
        moveTo(0,0);
    }
    
    /**
     * @param x x-coordinate of point.
     * @param y y-coordinate of point.
     */ 
    public Point(double x, double y) {
        moveTo(x, y);
    }
    
    
    /**
     * Returns the x-coordinate of the position.
     * @return x-Coordinate of the point position.
     */ 
    public double getX() {
        return x;
    }
    
    /**
     * Returns the y-coordinate of the position.
     * @return y-Coordinate of the point position.
     */
    public double getY() {
        return y;
    }
    
    /**
     * Move the point by delta.
     * @param dx Delta to move in x direction.
     * @param dy Delto to move in y direction.
     */ 
    public void move(double dx, double dy) {
        x+= dx;
        y+= dy;
    }
    
    /**
     * Move point to new position.
     * @param x New x position.
     * @param y New y position.
     */ 
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Move point to new position.
     * @param point Point object to define new position.
     */ 
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
    
    /**
     * Implementation of toString method, use in System.out.println etc...
     * @return Formatted string with x and y coordinates.
     */ 
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

}
README for java_advanced files

For the the merit badge college, Danvers MA

The files in this folder are released to the public under the MIT license.

These files are intended for the advanced student to allow them to explore
object oriented programming concepts.  Here we create several classes related to 
simple 2D geometry; creating a Point, Shape and Circle class.  It is left to 
the student to create a Rectangle class.

Directory contents:

    README - This file
    
    makefile - The make file that will build the .java programs in to .class files.
    
    Point.java - simple implementation of a 2D point class.  We also could have just
    imported java.awt.geom.Point class.
    
    Shape.java - An abstract base class used in Circle.  Defines API for basic shape
    methods such as getArea and getPerimeter.
    
    Circle.java - Completed implementation (at least for this example) of the Circle class, 
    this extends the Point class and serves as an example for the student to implement the 
    Rectangle class.
    
    Rectangle.java - Stub class, implentation is left to the student.  Use Circle.java
    as an example of the methods to be implemented.
    
    ShapeTest.java - A driver program to utilize the Circle object.  This is the program
    that the student should run to see how everything works together.
    
    /docs/* - Documentation for the classes.  These were generatated
    using javadoc.  The student will notice liberal comments in the sample java files.
    
    To build the programs, simply type make at the command line.  This will rebuild any
    of the .java programs if they have been modified.
    
    Or, to clean everything, type make clean all and the existing classes will be deleted and
    rebuilt.
    
    To run the ShapeTest program , type in java ShapTest.  Do NOT add any extension.
    
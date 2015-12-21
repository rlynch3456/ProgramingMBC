# A simple makefile for compiling three java classes

# define a makefile variable for the java compiler

JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information

JFLAGS = -g

# typing 'make' will invoke the first target entry in the makefile 
# (the default one in this case)

all: Point.class Circle.class Rectangle.class ShapeTest.class

Circle: Circle.class
Point: Point.class
ShapeTest: ShapeTest.class
Rectangle: Rectangle.class


Circle.class: Circle.java
	$(JCC) $(JFLAGS) Circle.java

Rectangle.class: Rectangle.java
	$(JCC) $(JFLAGS) Rectangle.java

Point.class: Point.java
	$(JCC) $(JFLAGS) Point.java

ShapeTest.class: ShapeTest.java
	$(JCC) $(JFLAGS) ShapeTest.java

# To start over from scratch, type 'make clean'.  
# Removes all .class files, so that the next make rebuilds them

clean: 
	$(RM) *.class
	

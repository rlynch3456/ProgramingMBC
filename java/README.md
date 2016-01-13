README for java files
===

For the the merit badge college, Danvers MA

The files in this folder are released to the public under the MIT license.

Directory contents:

**README.md** - This file
    
**makefile** - The make file that will build the .java programs in to .class files.
    
**HelloWorld.java** - Simple demonstration program shows a very simple
main fucntion that displays "Hello World" to the console.  This type
of program is considered to be the first program that anyone would write
when learning a new language.
    
**AreaCalc_simple.java** - This is one of the program that we will use in class.  The first
part of the program demonstrates a simiple function to calculate the area of a circle.
It is up to the student to expand upon this program to add a function to calculate the are
of a rectangle.
    
**AreaCalc_withInput.java** - This is one of the program that we will use in class.  The first
part of the program demonstrates a simiple function to calculate the area of a circle.
It is up to the student to expand upon this program to add a function to calculate the are
of a rectangle.  This is similar to AreaCalc_simple.java, with the exception that the user
is prompted for input.  This makes the program more flexible, but a little more confusing.
    
To build the programs, simply type `make` at the command line.  This will rebuild any
of the .java programs if they have been modified.

Or, to clean everything, type `make clean all` and the existing classes will be deleted and
rebuilt.
    
To run the HelloWorld program, type in `java HelloWorld`.  Do NOT add any extension.
    
README for c files
---

For the the merit badge college, Danvers MA

The files in this folder are released to the public under the MIT license.

Directory contents:

**README.md** - This file
    

**makefile** - The make file to build the .c files into executable programs.
    
**helloworld.c** - Simple demonstration program shows a very simple
main fucntion that displays "Hello World" to the console.  This type
of program is considered to be the first program that anyone would write
when learning a new language.
    
**dice.c** - Program that will be used in class.  This uses random numbers to simulate
dice tossing.  The first implementation picks random numbers from 2 to 12, simulating
the sum of two dice tosses.  This is completely coded.  It is up to the student to expand 
this to simulate tossing two separate dice and look at the results.

To build the programs, simply type `make` at the command line.  This will rebuild either
of the .c programs if they have been modified.

Or, to clean everything, type `make clean all` and the existing binaries will be deleted and
rebuilt.

To run the helloworld, type in `./helloworld`
for dice, type in `./dice`
    
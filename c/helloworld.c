/*
	helloworld.c

	Author: Rich Lynch
	For the programming merit badge class

	Released to the public under the MIT license

	The purpose of this program is to demonstrate the most basic of any program.

	helloworld is considered to be the starting program when learing any new language,
	what does it take to create a program that simply displays "Hello World" on 
	a display screen.
*/


/* 	stdio.h is a header file that describes the function to print something
	to the screen.  By this #include statement, we are telling the compiler
	where to find information about the function.
*/
#include <stdio.h>

/*	
	Every C program that executes has a function called main.  This is the entry
	point into the program.
*/
int main(void)
{
	/* print a couple lines of text to the display. */
	printf("Hello World\n");
	printf("Goodby World\n");
	
	/*
		Exit the program and return a value of zero.  This usually indicates
		that everything went OK.
	*/
	return 0;
}

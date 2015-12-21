/*
    dice.c

    Author: Rich Lynch
    For the programming merit badge class.
  
    Released to the public under the MIT license.

    The purpose of this program is to demonstrate using generated random
    to simulate the tossing of a pair of dice.

    The first approach is to generate random numbers between 2 and 12 to
    simulate adding up two dice.  What should be seen here is that the 
    number of each sum (2 - 12) should be fairly uniform.

    But, in reality, 2 and 12 should come up less often as the odds of
    rolling 2 or 12 is less than, let's say 7 as there are several ways to
    roll a 7 with a pair of dice:
    (1 and 6), (2 and 5), (3 and 4), (4 and 3), (5 and 2), (6 and 1).

    The first simulation is completely codded.  The exercise for the student
    is to build on the existing code, and show how to simulate tossing a pair
    of dice and adding them up.
*/

/* These are standard includes (pulling in standard c libraries) */
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <string.h>

/* 
    Define how many roll simulations we will be making. 
    This is a build time option and as such is typically written in all upper case.
*/
#define NUM_ROLLS 100000

/*  Return an integer between min and max inclusive */
int rollDie(int min, int max)
{
    return rand()%(max + 1-min)+min;
}

/* 
    This is the main function, hence the name.  Every executable program
    needs a main function.
*/
int main(int argc, char** argv)
{
    /* local variables used */
    int buckets[13] = {0};  // This notation will initialize the array to zero
    int i;                  // A counting variable for looping
    int roll;               // The outcome of a single roll.

    /* 
        Initialize the random number generator,
        or else the results will be the same every time.
        
        This seed is based on the seconds of the current time.  So if you happen to run
        this at the same second multiple time, the results would be the same.
    */
    srand((unsigned int)time(NULL));

    /* Simulate tossing dice by picking a random number between 2 and 12 inclusive */
    for(i = 0; i < NUM_ROLLS; i++)
    {
        /* Generate the single random number */
        roll = rollDie(2, 12);
        
        /* Keep track of the roll by incrementing the count in the appropriate bucket */
        buckets[roll]++;
    }

    printf("%d total rolls\n", NUM_ROLLS);

    /* Dump the array contents.  Notice that we are starting at 2 */
    printf("Random numbers from 2 - 12\n");
    for( i = 2; i <=12; i++)
        printf("[%d]: %d\n", i, buckets[i]);

    /* 
        ToDo: For the student to complete.
        
        Now run the test again, but by tossing a pair of dice.
        First clear out the array of old data. 
    */
    

    /* Typically a program would return an error value if something went wrong. */
    return 0;
}
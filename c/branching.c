/*
    branching.c

    Author: Rich Lynch
    For the programming merit badge class.
 
    Released to the public under the MIT license.

    The purpose of this program is to demonstrate various branching
    statements.
*/

#include <stdio.h>

int main(int args, char * argv[])
{
    // Initialize a couple variables
    int a = 5;
    int b = 15;

    if(a >= 0 && a <= 10)
        printf("a = %d and is between 0 and 10\n", a);
    else
        printf("a = %d and is not between 0 and 10\n", a);

    if(b >= 0 && b <= 10)
        printf("b = %d and is between 0 and 10\n", b);
    else
        printf("b = %d and is not between 0 and 10\n", b);

    if(1 || a <= 10)
        printf("This will always print regardless of value of a\n");

    if(0 && a <= 10)
        printf("This will never print regardless of value of a\n");

    return 0;
}

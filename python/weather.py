#!/usr/bin/python3

'''
    weather.py
    
    Demonstration of simple functions for weather.

    Author: Rich Lynch
    Created for merit badge college.  
    Released to the public under the MIT license.
    
    For sake of keeping the code clean, some normal error checking
    has been eliminated.  For example, where a number is expected as input,
    an exception will be raised if a non-number is entered.  A more robust
    program would use try/catch to capture this type of error.
'''
import math

'''
    Function:   whatToPack
    Params:
        temp - temperature in degrees F
    Return:
        None, will output to screen messages about clothing options depending
        on the temperature.
'''
def whatToPack(temp):
    if temp <= 0:
        print("Pack long underwear!")
    elif temp > 65:
        print("Pack shorts and T-shirts")
    elif temp >= 100:
        print ("Remember to hydrate!")
    else:
        print ("Good weather to hike, dress in layers")

'''
    Function:   main
    Purpose:    Test various functions
    Params:     none
    Return:     none
'''
def main(): 
    #...initialize looping variable, assume 'yes' as the first answer
    continueYN = "y"
 
    while continueYN == "y" or continueYN == "Y":
        #...get temperature input from the user
        sDegreeF = input("Enter next temperature in degrees Farenheight (F): ")
 
        #...convert text entry to number value that can be used in equations
        nDegreeF = int(sDegreeF)
 
        # Based on the temperature, what do we need to pack?
        whatToPack(nDegreeF)
 
        #    Now it is left to the student to write a function that will calculate the 
        #    wind chill factor.
        #    
        #    Another input is needed, the wind speed in miles per hour.  You need to follow the 
        #    example above to get the input as a string, and convert it into an integer.
        #    
        #    Then, write a function that takes two parameters, the temperature and wind speed
        #    and this will return the wind chill factor.  The formula for the wind chill factor is:
        #    
        #    Wind Chill = 35.74 + 0.6215T - 35.75(V^0.16) + 0.4275T(V^0.16)
        #    
        #    Where T is the temperature in degrees F and V is the windspeed in miles per hour.
        #    
        #    As a hint, V^0.16 is V raised to the power of 0.16.  This is done like this:
        #    
        #    math.pow(V, 0.16)
        #    
        #    If you do everything right, for 0 degrees and 30 miles per hour, the windchill
        #    should be around -26

       
        # test of windChill
        
        # Keep doing this as long as we type Y or y.
        continueYN = input("Input another? ") 
        
'''
    This makes sure that the main function is called.  Not of much use in this simple
    example, but in more complex examples, this would be needed.  Shown here for completness.
'''
if __name__ == "__main__":
    main()
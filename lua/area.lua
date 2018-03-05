#!/usr/bin/env lua

--[[
    area.lua
    
    Demonstration of basic function to calculate
    the area of simple geometric shapes.

    Author: Rich Lynch
    Created for merit badge college.  
    Released to the public under the MIT license 2017.
-]]


--[[ 

    Simple function to calculate the area of a square.
    Note that there is no error checking here.
    
    The student must add error checking for zero and negative input values.
--]]
    
function area_square(side)

    return side * side

end


--[[ 
    Function for performing unit tests.  
    
    Returns true if no errors, otherwise false

--]]
function unit_tests()

    error = true

    -- Why do you think we test with 3?  Why not 1 or 2?
    if area_square(3) ~= 9 then
        print("area_square(3) is not equal to 9")
        error = false
    end
    
    -- Once we add error checking in area_square, we must add new checks here.
    
    return error
end

-- Let's do some unit tests

if unit_tests() == false then
    print("*** Unit test(s) failed ***")
else
    print("*** All unit tests passed ***")
end


-- use our function and print the results
side = 10
area = area_square(side)
print("Area: ", area)

--[[ 
    Let's add some formatting for nicer output 
    
    Here we are creating a string, and formatting it.  This is a little more advanced,
    but you can copy and paste for your needs.
--]]
print(string.format("Area of a square with a side of %d is %d", side, area))

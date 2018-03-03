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

    if(side <= 0) then
        return -1
    end

    return side * side

end

function area_rect(length, width)

    if( length <= 0 or width <= 0) then
        return -1
    end

    return length * width
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
        error = nil
    end

    if area_square(0) ~= -1 then
        print("area_square(0) is not equal to -1")
        error = nil
    end

    if area_square(-1) ~= -1 then
        print("area_square(0) is not equal to -1")
        error = false
    end

-- Test all combinations of invalid input and one valid input
    if area_rect(2, 3) ~= 6 then
        print("area_rect(2, 3) is not equal to 6")
        error = false
    end

    if area_rect(1, 0) ~= -1 then
        print("area_rect(1, 0) is not equal to -1")
        error = false
    end

    if area_rect(1, -1) ~= -1 then
        print("area_rect(1, 0) is not equal to -1")
        error = false
    end

    if area_rect(0, 1) ~= -1 then
        print("area_rect(1, 0) is not equal to -1")
        error = false
    end

    if area_rect(-1, 1) ~= -1 then
        print("area_rect(1, 0) is not equal to -1")
        error = false
    end
    
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
print(string.format("Area of a rectangle with a side of %d is %d", side, area))

width = 2
length = 3
area = area_rect(2,3)
print(string.format("Area of a rectangle with sides of %d and %d is %d", width, length, area))

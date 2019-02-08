#!/usr/bin/env lua

--[[ 

    coin_toss.lua

    Author: Rich Lynch
    For the programming merit badge.
    Copywrite 2019

    Released to the public under the MIT license

    The purpose of this program is to demonstrate random numbers with a coin toss

--]]


--[[ 
    Seed the random number generator using the system time 
    Remember that os.time() returns a unique number every second.
    So, if this program is run more than once in the same second (rare),
    the results will be exactly the same.  This would be ok for this
    simple example, but maybe not so much in a real-world program.
--]]
math.randomseed(os.time())


-- Let's declare some variables

loops = 1000           -- Number of tosses
heads = 0              -- Number of "Heads"
tails = 0              -- Number of "Tails"


-- Toss the "coin"
for i = 1, loops do

    --Pick a number from 0 to 1
    toss = math.random(0,1)

    -- Let's say that 1 is heads, so 0 will be tails
    if toss == 1 then   -- increment the number of heads tosses
        heads = heads + 1
    else                -- otherwise this is tails, so increment tails
        tails = tails + 1
    end
end

-- print out the results
print("For " .. loops)
print(heads .. " heads and " .. tails .. " tails")

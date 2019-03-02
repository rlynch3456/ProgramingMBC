#!/usr/bin/env lua

--[[ loops.lua

	Author: Rich Lynch
	For the Programming Merit Badge

	Released to the public under the MIT license

	The purpose of this program is to show basic looping in Lua
--]]

print("This is a for loop")

for i = 0, 10 do
    print("i = " .. i)
end

print("\nThis is a while loop")
i = 10
while i >= 0 do
    print("i = " .. i)
    i = i - 1
end

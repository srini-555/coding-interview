# Get All Operator Combinations to Make Expression Match Target Number

## Alias
- Leetcode (282): [Expression Add Operators](https://leetcode.com/problems/expression-add-operators/)

## Problem
- Given a number in string and a target number, get all the combination of operators (`+`, `-`, `*`) which can be added between the digits of the number, so that the calculated result of the expression can match the target value.

## Examples
- Example 1
   - Number: "123"
   - Target: 6
   - Combinations: `["1*2*3","1+2+3"]`
- Example 2
   - Number: "232"
   - Target: 8
   - Combinations: `["2*3+2","2+3*2"]`
- Example 3
   - Number: "105"
   - Target: 5
   - Combinations: `["1*0+5","10-5"]`

## Solutions
- Solution 1: Backtracking
   - Basic idea
      - In the gap between each 2 digits, there are 4 operator can be added
         - No operator (Let 2 digits become a single number)
         - + operator
         - - operator
         - x operator

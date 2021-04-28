# Implement Pow(x,n)

## Alias
- Leetcode (50): [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## Problem
- Implement pow(x, n), which calculates x<sup>n</sup>.
- x can be positive, negative and 0;
- n can be positive, negative and 0;

## Solution
- Solution 1: Recursion + Fast Power
   - If the n is even, so x<sup>n</sup> = x<sup>n/2</sup> * x<sup>n/2</sup>.
   - If the n is odd, so x<sup>n</sup> = x<sup>n/2</sup> * x<sup>n/2</sup> * x.

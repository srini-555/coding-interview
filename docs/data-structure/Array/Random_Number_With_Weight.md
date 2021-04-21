# Random Number with Weight

## Alias
- Leetcode (528): [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/)
- GeeksforGeeks: [Random number generator in arbitrary probability distribution fashion](https://www.geeksforgeeks.org/random-number-generator-in-arbitrary-probability-distribution-fashion/)

## Problem
- In the input array, each element is the weight of each element.
- Randomly return an index of the input array with probability proportional to its weight

## Example
- Input array: {1, 6, 2, 1}
- The probability of return 0: 1 / (1+6+2+1) = 1 / 10
- The probability of return 1: 6 / (1+6+2+1) = 6 / 10
- The probability of return 2: 2 / (1+6+2+1) = 2 / 10
- The probability of return 3: 1 / (1+6+2+1) = 1 / 10

## Analysis
- A person throw a ball on the line.
- The element with large weight would occupy a broader range on the line compared to the element with small weight.
- The offsets of the ranges are actually the prefix sums from a sequence of numbers.
- So the problem can be consider as
    - Generate a random number between 0 and the total weight.
    - See the random number drop in which range based on offsets (prefix sum array).
    - Pick the index of that range.

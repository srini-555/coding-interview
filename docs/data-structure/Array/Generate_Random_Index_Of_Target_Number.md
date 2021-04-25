# Generate Random Index of Target Number

## Alias
- Leetcode (528): [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/)

## Problem
- The input array is an integer array with duplicated numbers.
- Randomly return the index of elements which match to the target number.

## Example
- Input array: [1, 6, 3, 1, 3, 4 ,3, 3]
- If the target number is 3, it should randomly return one of [2, 4, 6, 7].
- If the target number is 1, it should randomly return one of [0, 3].
- If the target number is 4, it should randomly return one of [5].

## Solution
- Solution 1: HashMap
   - Create a HashMap - Key is the unique number and value is a list of indexes has that number.
   - When we have a target number, get the list of the indexes for the target number and randomly pick a index from it.
  ```java
  class Solution {
      Map<Integer, List<Integer>> map;

      public Solution(int[] nums) {
          this.map = new HashMap<>();
        
          for (int i = 0; i < nums.length; i++) {
              if (map.get(nums[i]) == null) {
                  List<Integer> list = new ArrayList<>();
                  list.add(i);
                  map.put(nums[i], list);
              } else {
                  map.get(nums[i]).add(i);
              }
          }
      }
    
      public int pick(int target) {
          List<Integer> list = map.get(target);
          Random random = new Random();
          int index = random.nextInt(list.size());
          return list.get(index);
      }
  }
  ```

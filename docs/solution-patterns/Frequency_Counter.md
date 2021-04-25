# Frequency Counter

## Concepts
- Use an object to record unique values and the frequency of each unique values.

## Pros
- Avoid the need for nested loops or O(n<sup>2</sup>) operations.

## Code
- Java
  ```java
  Map<Integer,Integer> map = new HashMap<>();
        
  for(int num : nums) {                            
      map.put(num, map.getOrDefault(num, 0) + 1);
  }
  ```

## Problems can use this pattern

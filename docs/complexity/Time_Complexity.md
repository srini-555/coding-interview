# Time Complexity

## Big O Notation
- Concept: The upper bound of the algorithm
- Notation: O

## Order of time complexity

| Complexity | Name | Example |
|----|----|----|
| O(1) | Constant time | <li>Single statement |
| O(*log*n) | Logarithmic time | <li>Binary search<li>Operations on binary search tree |
| O(n) | Linear time | <li>1-level loop |
| O(n*log*n) | Linearithmic time | <li>Quick sort<li>Merge sort<li>Heap sort |
| O(n<sup>2</sup>) | Quadratic time | <li>2-level nested loop<li>Bubble sort<li>Insertion sort<li>Selection sort |
| O(n<sup>3</sup>) | Cubic time | | 
| O(2<sup>n</sup>) | Exponential time | |
  
## General rules
| Case | Time Complexity |
|----|----|
| Single statement | O(1) |
| 1-level loop | O(n) |
| 2-level nested loop | O(n<sup>2</sup>) |
| k-level nested loop | O(n<sup>k</sup>) |

## Master theorem
- Goal: Analyze the time complexity of a recursive function.
- Formula: T(n) = aT(n/b) + n<sup>c</sup>
- Notation:
   - a: The number of subproblems.
   - n/b: The scale of each subproblems.
   - n<sup>c</sup>: The time complexity outside the recursive function.
- Rules
   - Case 1: If a > b<sup>c</sup>, so time complexity is n<sup><i>log</i><sub>b</sub>a</sup>.
   - Case 2: If a = b<sup>c</sup>, so time complexity is n<sup>c</sup><i>log</i>n.
   - Case 3: If a < b<sup>c</sup>, so time complexity is n<sup>c</sup>.
- Examples:
   - Example 1:
      - Code
        ```
        func(n) {
           func(n/2);
           func(n/2);
        }
      - Formula: T(n) = 2T(n/2) + 1
      - Parameters:
         - a = 2
         - b = 2
         - c = 0
      - Comparision: 2 > 2<sup>0</sup>
      - Complexity: n<sup><i>log</i><sub>2</sub>2</sup> = n 

    

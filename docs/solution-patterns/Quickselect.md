# Quickselect

## Concepts
- Quickselect is a selection algorithm to find the Kth smallest element in an unordered array.
- This reduces the average complexity from O(n<i>log</i>n) to O(n).

## Algorithm
- The algorithm is separated into 2 subprocedures: Patition and select.

### Patition
- Goal
   - Separate the array into 2 parts:
      - All elements in the 1st part are less than a certain element.
      - All elements in the 2nd part are greater than or equal to the element.
- Process
   - Pick an element as the pivot:
      - Commonly pick the most right one as the pivot.
      - You can also pick a random element as the pivot and swap it with the most right one.
   - Declare 2 pointers:
      - j: This pointer is to iterate from left to right - 1 for checking all the elements except the pivot.
      - i: This pointer is mark the left end of the 2nd part (Elements are greater than or equal to the pivot).
   - When the pointer j is iterating from left to right - 1:
      - If the element j is smaller than the pivot, swap element i and element j.
      - Increase i by 1.
   - At the end:
      - Swap element i with the pivot (Move the pivot to the middle to separate 2 parts).
      - Return i (The index of the pivot).
- Code
  ```
  int partition(int[] nums, int left, int right) {
      int pivot = nums[right];
      int i = left;
      for (int j = left; j < right; j++) {
          if (nums[j] < pivot) swap(nums[i], nums[j]);
          i = i + 1;
      }
      swap(nums[i], nums[right]);
      return i;
  }
  ```

### Select
- Code (In-place)
  ```
  int select(int[] nums, int k) {
      int left  = 0;
      int right = nums.length - 1;
      
      while (left <= right) {
          int pivotIndex = partition(nums, left, right);
          if (pivotIndex == k) {
              return nums[pivotIndex];
          } else if (pivotIndex > k) {      // It means that k is in the 1st part, so set the right bound
              right = pivotIndex - 1;
          } else {                          // It means that k is in the 2nd part, so set the left bound
              left = pivotIndex + 1;
          }
      }
  }
  ```

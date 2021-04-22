# Array

## Basic operations
### Manipulation
#### Swap 2 elements
```
void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
```
#### Reverse sub-array
```
void reverse(int[] nums, int i, int j) {
    while (i < j) {
        swap(nums, i, j);
        i++;
        j--;
    }
}
```

## Strategies
- The problem is related to sub-array and sub, consider to use prefix sum array.

## Common topics
- Interval

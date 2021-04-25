# Prefix Sum Array

## Concepts
- Each element in a prefix sum array is the sum of all the elements which is in and before the current element of the input array.
- prefixSum[i] = input[0] + input[1] + ... + input[i] = prefixSum [i-1] + input[i]

  ![Untitled (3)](https://user-images.githubusercontent.com/8989447/115646395-4b51f080-a2df-11eb-9fd4-21315870d887.png)

## Benefit
- Reduce the complexity of algorightm.

## Construction
```
void buildPrefixSumArray(int[] nums) {
    int[] prefixSum[] = new int[nums.length];
    prefixSum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        prefixSum[i] = prefixSum[i-1] + nums[i];
    }
}
```

## Conclusions
- The sum of range [i, j] of the input array: prefixSum[j] - prefixSum[i-1]

## Problems can use prefix sum array
- Sum of sub-array problems
   - [Get Equilibrium Index from Array]()
   - [Count Sub-array Sum Equals K]()
- Other problems
   - [Generate Random Number with Weight]()

## References
- https://en.wikipedia.org/wiki/Prefix_sum
- https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/

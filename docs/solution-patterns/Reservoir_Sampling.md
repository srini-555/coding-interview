# Reservoir sampling

## Concepts
- Reservoir sampling is a sampling algorithm to get random candidate(s) over a population of **unknown size** with **constant space**.

## Benefits
- You don't have to know the size of data (Advantage for linked list).
- You don't have to declare a new collecion.
- The overall probability of each candidate being chosen is same (Probability = 1 / N).
   - The probability of <i>i</i>th candidate: 
     
     ![Untitled (7)](https://user-images.githubusercontent.com/8989447/116016497-03420f00-a5fa-11eb-9a6c-a8334fb3ec5b.png)

## Algorithm
- Conditions
   - Each candidate has same weight (Even if 2 candidate have same value, you can treat them as different candidates).
- Process
   - At each time when finding a new candidate, we have to make the decision of whether or not to choose this candidate:
      - Get the number of candidates has been scanned.
      - Get a random number between [0, NumOfCand - 1].
      - If the random number is 0, pick the current candidate.
- Code
  ```
  int getRandom(int[] nums) {
      int chosenCandidate = 0;                  // Record the candidate has been chosen
      int numOfCand       = 0;                  // The number of candidates have been scanned
      
      for (int i = 0; i < nums.length; i++) {
          numOfCand++;
          if (rand.nextInt(numOfCand) {         // Get random number from [0, NumOfCand - 1] and check it is 0 or not
              chosenCandidate = nums[i];        // Record the current candidate as the chosen candidate
          }
      }
      return chosenCandidate;                   // Return the chosen candidate
  }
  ```

## Complexity
- Time complexity
   - O(n)
- Space complexity
   - O(1)

## Problems can use this pattern
- Random candidate with same weight problems
   - [Generate Random Index of Target Number]()
   - [Get Random Node from List]()

## References
- https://en.wikipedia.org/wiki/Reservoir_sampling#:~:text=Reservoir%20sampling%20is%20a%20family,to%20fit%20into%20main%20memory.

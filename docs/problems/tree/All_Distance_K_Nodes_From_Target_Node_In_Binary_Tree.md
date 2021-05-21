# All Distance K Nodes from Target Node in Binary Tree

## Alias
- Leetcode (863): [All Nodes Distance K in Binary Tree](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)

## Problem
- Given a binary tree, return a list of the values of all nodes that have a distance k from the target node.

## Examples
- Example 1
   - Binary tree:
     
     ![dis](https://user-images.githubusercontent.com/8989447/119074934-2a97bc00-b9ad-11eb-9c16-e7195ba00413.png)

   - Target Node: 5
   - K: 2
   - Output: `[7,4,1]`

## Solutions
- Solution 1 Depth-first search
   - Distance K nodes can happen in the following cases
      - Child nodes (Target=5, K=2)
        
        ![child](https://user-images.githubusercontent.com/8989447/119075223-adb91200-b9ad-11eb-85ef-6c5ce587db7f.png)
      - Parent node (Target=5, K=2)

        ![parent (1)](https://user-images.githubusercontent.com/8989447/119075666-5ebfac80-b9ae-11eb-9195-89c83f672bf0.png)
      - Nodes in another branch (Target=5, K=3)

        ![branch](https://user-images.githubusercontent.com/8989447/119075847-ba8a3580-b9ae-11eb-9c54-5941e523a89e.png)

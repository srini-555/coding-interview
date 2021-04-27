# Heap

## Concept
- Complete binary tree.
- The key stored in each node is either greater than or equal to (≥) or less than or equal to (≤) the keys in the node's children.

## Types
- **Max heap**
   - The parent key is greater than or equal to (≥) the child keys.
   - The root has the max key.
   
     ![max_heap](https://user-images.githubusercontent.com/8989447/116179688-ffcf8600-a6d4-11eb-8485-0399871a804e.png)


- **Min head**
   - The parent key is less than or equal to (≤) the child keys.
   - The root has the min key.
   
     ![min_heap](https://user-images.githubusercontent.com/8989447/116179698-03630d00-a6d5-11eb-90b3-83c4933b9a4a.png)
     
## Array Representation

![heap_array](https://user-images.githubusercontent.com/8989447/116182267-2e4f6000-a6d9-11eb-8acb-684198d741ea.png)

## Basic operations
### Insert
- Process
   - Add the new node to the bottom level of the heap at the leftmost open space.
   - Compare the new node with its parent: 
      - If they are in the correct order, stop.
      - If they are NOT in the correct order, swap the new node with its parent. Continue this comparison.
### Extract
- Process
   

# Union Find

## Alias
- Disjoint set
- Merge find

## Concepts
- A data structure that keeps track of elements which are split into one or more non-overlapping groups.

## Algorithm
### Basics
- Graph
   - Each group will have one or more nodes.
   - Each group will have a root node.
   - If a group has multiple nodes, each node except the root node will have parent node.
- There are 2 operation in this algorithm:
   - Find: Get the root node of the input node.
   - Union: Merge the 2 input nodes' groups.
- Tracking group information
   - Use 1D array or HashMap to track nodes' relationship.
   - The key is the node ID (index can be the key if using array).
   - The value is the parent node ID of the current node.

### Initialization
- Idea
   - Treat each node as a single group.
- Process
   - Create a N size array or HashMap.
   - Assign each node's parent node ID: 
      - Option 1: Use -1 (-1 means root node).
      - Option 2: Use its own node ID (each node's parent is itself).

        ![Union_Find_1](https://user-images.githubusercontent.com/8989447/118570540-9d98fc80-b739-11eb-9848-eac0b5207af5.png)

### Find
- Process
- Code
### Union

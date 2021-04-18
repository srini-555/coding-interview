# Binary Tree

## Concept
### Rules
- Each node has at most two children, which are referred to as the left child and the right child.

### Code
```
TreeNode {
    int      data;
    TreeNode left;
    TreeNode right;
}
```

### Types
- **Full binary tree**: 
   - Every node has either 0 or 2 children.
     ![1280px-Full_binary svg](https://user-images.githubusercontent.com/8989447/115163571-0d4a9780-a067-11eb-8615-873f5aa8fdb9.png | width=100)

- **Complete binary tree**: 
   - Every level, except the last, is completely filled.
   - All nodes in the last level are as far left as possible
     ![1920px-Complete_binary2 svg](https://user-images.githubusercontent.com/8989447/115163595-26ebdf00-a067-11eb-93a6-a54c8dd83bf2.png | width=100)

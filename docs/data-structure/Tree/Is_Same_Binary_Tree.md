# Is Same Binary Tree

## Alias
- Leetcode (100): [Same Tree](https://leetcode.com/problems/same-tree/)

## Problem
- Check 2 binary trees are same or not.
- Return true if 2 binary trees are same.

## Solutions
- Solution 1
  ```java
  public boolean isSameTree(TreeNode p, TreeNode q) {
     if (p == null && q == null) {      // p and q are both null
          return true;
      } 
      if (p == null || q == null) {      // one of p and q is null
          return false;
      }
        
      if (p.val != q.val) {
          return false;
      } else {
          return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }
  }
  ```

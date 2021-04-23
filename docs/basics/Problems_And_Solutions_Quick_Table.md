# Problems And Solutions Quick Table

## Array
| Problem Name | Pattern | Solutions | Edge Cases |
|----|----|----|----|

## String
| Problem Name | Pattern | Solutions | Edge Cases |
|----|----|----|----|
| Is Palindrome | | <li>2 meet pointers | |
| Is Palindrome by Removing One Char | | <li>2 meet pointers + Greedy (Until l != r, check both [l, r-1] and [l+1, r] are palindrome or not) | |
| Is Valid Parentheses | | <li>Stack | |
| Generate All Combinations of Parentheses | Cases: <li>(n-1)<li>1(n-1),2(n-2),...,(n-1)n | | |
| Remove Minimum Parentheses to Make Parentheses Valid | | <li>Two pass + StringBuilder (1st pass: Remove extra ) at the beginning, 2nd pass: Remove extra ( at the end) | |

## Linked List
| Problem Name | Pattern | Solutions | Edge Cases |
|----|----|----|----|
| Traverse in reversed order (Basic operations) | | <li>Recursion | |
| Get the Kth node from tail (Basic operations) | | <li>Recursion<li>2 pointers with K distance | <li>K can greater the size. |
| Get Middle Node | | <li>Fast slow pointers | | 
| Is Palindrome | | <li>Fast slow pointers + Stack | |
| Remove Duplicates | | <li>2 brute force pointers | |
| Remove Duplicates from Sorted List | | <li>1 pointer | |
| Remove Node without Accessing Previous Node | | <li>Swap with next node and delete next node | |
| Remove Nodes by Value | | <li>1 pointer | |
| Reverse List | | <li>3 neighbor pointers | |
| Reverse Sub-list | | <li>Separate and reverse the sub-list, and then merge | |
| Rotate List Right | <li>Right rotate a linked list K positions, is same as appending the last K nodes from tail to the head. | <li>Separate and concatenate the last K nodes | <li>K can greater the size. |
  
## Binary Tree
| Problem Name | Pattern | Solutions | Edge Cases |
|----|----|----|----|
| Get Height | | <li>Recursion<ul><ul><li>Max(leftH,rightH)+1</ul></ul> | |
| Get Diameter | <li>Path=Max(leftPath,rightPath)+1<li>Diameter=Max(diameter,leftPath+rightPath) | <li>Recursion | |
| Get Lowest Common Ancestor | <li>current is n1 or n2(up-down relationship), so current is LCA<li>n1,n2 in different sub-tree, so current is LCA<li>Both n1,n2 in left sub-tree, go to left<li>Both n1,n2 in right sub-tree, go to right | <li>Recursion | |
| Get Num of Univalue Subtrees | | <li>Recursion | |
| Is Binary Search Tree | <li>In-order traverse BST is ascending order.<li>Reversed in-order traverse BST is descending order. | <li>Recursion: In-order traverse and check it is ascending order or not.<li>Recursion: Valid range. | |
| Is Balanced Binary Tree |  | <li>Recursion: GetHeight + Use (-1) to indicate the sub-tree is not balanced. | |
| Is Mirror Binary Trees | <li>(t1.v==t2.v) && isMirror(t1.l,t2.r) && isMirror(t1.r,t2.l) | <li>Recursion | |

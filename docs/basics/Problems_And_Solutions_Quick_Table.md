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

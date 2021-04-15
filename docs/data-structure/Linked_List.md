# Linked List

## Concept
### Code
```
ListNode {
    int      data;
    ListNode next;
}
```

## Strategies
- If an operation is against the direction of a linked list, need to consider use a recursive function.

## Basic operations
### Traverse
#### Traverse in order
```
void traverse(ListNode head) {
    ListNode current = head;
    while (current != null) {
        stmt;
        current = current.next;
    }
}
```

#### Traverse in reversed order
```
void traverseReversedOrder(ListNode head) {
    if (head == null) return;
    traverseReversedOrder(head.next)
    stmt;
}
```

### Access
#### Access the first node
```
ListNode getFirst(ListNode head) {
    return head;
}
```

#### Access the last node
```
ListNode getLast(ListNode head) {
    ListNode current = head;
    while (current.next != null) {
        current = current.next;
    }
    return current;
}
```

#### Access the Kth node
(The index is 0-based)
```
ListNode getKth(ListNode head, int k) {
    ListNode current = head;
    while (current.next != null) {
        if (k == 0) {
            return current;
        }
        current = current.next;
        k--
    }
    if (k > 0) {                                   // If the K is greater than the total number of nodes
        return null;                               // Returning null means there is no Kth node
    }
}
```

#### Access the Kth node from tail
- **Solution 1**: Use recursive function.
  ```
  int getKthFromTail(ListNode head, int k) {                 // Return value is the Ith node from tail
      if (head == null) return 0;
      int count = getKthFromEnd(node.next, k) + 1;
    
      if (i == k) {
          // current is the Kth from tail
      }
    
      return count;
  }
  ```
- **Solution 2**: Use 2 pointers.
   - Let pA point to the head, let pB point to the Kth node from the head.
   - Move pA and pB to the tail in the same pace so the distance between pA and pB is always K.
   - When pB points to the tail, pA is pointing to the Kth node from the tail.
  ```
  ListNode getKthFromTail(ListNode head, int k) {
      ListNode pA = head;
      ListNode pB = head;
      
      for (int i = 0; pB != null && i < k; i++) {     // Let pB point to the Kth node from the head.
          pB = pB.next;
      }
      
      if (pB == null) return null;                    // If the K is greater than the total number of nodes, return null
                                                      // Returning null means there is no Kth node from the tail
                                                      
      while (pB != null) {                            // Move pA and pB to the tail in the same pace until pB points to the tail
          pA = pA.next;
          pB = pB.next;
      }
      
      return pA
  }
  ```
- Solution 3: Get the (N-K+1)th node from the head.

### Manipulation
#### Add 
#### Remove
#### Reverse

# Remove Node without Accessing Previous Node

## Problem
- Remove a single node.
- Cannot access the head node and the previous node.

## Solutions
Swap with the next node and delete the next node.
```java
public ListNode deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
}
```

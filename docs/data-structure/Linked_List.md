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
    if (k > 0) {                       // If there is no Kth node (The number of nodes is less than K)
        return null;                   // Return null to mean there is no Kth element
    }
}
```

#### Access the Kth element from tail


### Manipulation
#### Add 
#### Remove
#### Reverse

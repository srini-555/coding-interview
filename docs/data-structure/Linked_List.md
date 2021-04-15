# Linked List

## Concept
### Code
```
ListNode {
    val;
    next;
}
```

## Strategies
- If an operation is against the direction of a linked list, need to consider use a recursive function.

## Basic operations
### Traverse
#### Traverse in order
```
void traverse(ListNode head) {
    while (head != null) {
        stmt;
        head = head.next;
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
### Access element

### Manipulation

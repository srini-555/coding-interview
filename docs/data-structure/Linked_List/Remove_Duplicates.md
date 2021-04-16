# Remove Duplicates

## Problem
- Remove all duplicates from a unsorted list.

## Solutions
- Solution 1: 2 pointers
  ```java
  public void deleteDuplicates(ListNode head) {
      ListNode current = head;
      
      while (currentNode != null) {
          ListNode runner = current;

          while (runner.next != null) {
              if (runner.next.data == currentNode.data) {
                  runner.next = runner.next.next;
              } else {
                  runner = runner.next;
              }
          }

          currentNode = currentNode.next;
      }
      
      return head;
  }
  ```

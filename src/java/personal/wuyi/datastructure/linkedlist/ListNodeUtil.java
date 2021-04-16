package personal.wuyi.datastructure.linkedlist;

public class ListNodeUtil {
    public static void addNodeAtTail(ListNode head, int val) {
    	while (head.next != null) {
    		head = head.next;
    	}
    	head.next = new ListNode(val);
    }
    
    public static void printLinkedList(ListNode head) {
    	while (head != null) {
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
}

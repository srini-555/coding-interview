package personal.wuyi.datastructure.linkedlist;

public class Test {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNodeUtil.addNodeAtTail(head, 2);
		ListNodeUtil.addNodeAtTail(head, 3);
		
		ListNodeUtil.printLinkedList(head);
		
		
		String str = "abcdefgh";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i+1));
		}
	}

}

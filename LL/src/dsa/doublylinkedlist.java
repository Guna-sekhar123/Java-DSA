package dsa;

public class doublylinkedlist {
	
	private Node head;
	private Node tail;
	
	//inserting the element in the first place of the linked list.
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
	}
	//displaying the elements in the linked list.
	public void printlist() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.val + ",");
			node = node.next;
		}
	}
	
	private class Node{
		int val;
		Node next;
		Node prev;
		public Node(int val) {
			this.val = val;
		}
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}
	
}
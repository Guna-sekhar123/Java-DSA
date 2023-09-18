package dsa;


public class linkedlist {
	private Node head; // created a head node variable
	private Node tail; // created a tail node variable
	
	private int size; // created a variable to tract the size of linkedlist.
	
	// Inserting an element into front of the linked list
	public void insertFirst(int val) { 
		Node node = new Node(val);
		node.next = head;
		head = node;
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	// Inserting an element into the end of the linkedlist
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	//inserting an element into the linked list
	public void insert(int val, int index) {
		if(index == 0) {
			insertFirst(val);
		}
		if(index == size) {
			insertLast(val);
		}
		Node temp = head;
		for(int i =1; i<index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val,temp.next);
		temp.next = node;
		size++;
	}
	//deletion of the element from the head of the linkedlist
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	//deletion of the last element from the linkedlist
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondlast = get(size-2);
		int val = tail.value;
		tail = secondlast;
		tail.next = null;
		size--;
		return val;
	}
	//deletion of the particular index from the linked list
	public int delete(int index) {
		if(index ==0) {
			return deleteFirst();
		}
		if(index == size-1) {
			return deleteLast();
		}
		Node prev = get(index - 1);
		int val = prev.next.value;
		
		prev.next = prev.next.next;
		return val;
	}
	//finding the value in the linked list
	public Node find(int value) {
		Node node = head;
		while(node!=null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	
	//getting the index of an element in the linked list
	public Node get(int index) {
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		return node;
	}
	
	//displaying the elements in the linkedlist.
	public void printlist() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.value + ",");
			temp = temp.next;
		}
	}
	
	// created a constructor that initialises the size to 0
	public linkedlist() {
		this.size = 0;
	}
	
	// Created the structure of a node 
	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}

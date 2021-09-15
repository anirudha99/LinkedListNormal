package com.linkedlist;

public class LinkedlistMain {

	public static void main(String[] args) {
		
//		LinkedList l = new LinkedList();
//		l.addFront(100);
//		l.addFront(200);
//		l.addFront(300);
//		l.addFront(400);
//		l.print();
//		l.deleteAtHead();
//		l.print();
//		l.deleteAtTail();
//		l.print();
//		l.search(400);
//		l.addAtPosition(3, 250);
//		l.insertAfter(400, 450);
//		l.print();
//		l.deleteSpecified(450);
//		l.print();
		
		OrderedLinkedList orderedList = new OrderedLinkedList();
		orderedList.add(56);
		orderedList.add(30);
		orderedList.add(40);
		orderedList.add(72);
		System.out.println("Ordered list is");
		orderedList.print();
	}
}

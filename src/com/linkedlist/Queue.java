package com.linkedlist;

import com.linkedlist.LinkedList.Node;

public class Queue {

	LinkedList queue = new LinkedList();
	Node head;

	/**
	 * @param data value of new node adds the new node at the end. Calls the add
	 *             method defined in LinkedList class
	 */
	public void enqueue(int data) {

		head = queue.add(data);

	}

	/**
	 * prints the content of queue
	 */
	public void display() {
		if (head == null) {
			System.out.println("empty");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	/**
	 * Removes the first element from queue
	 */
	public void dequeue() {
		if (head == null) {
			System.out.println("empty");
		} else {
			head = head.next;
		}
	}

}

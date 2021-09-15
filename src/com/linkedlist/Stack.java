package com.linkedlist;

import com.linkedlist.LinkedList.Node;

public class Stack {

	LinkedList stack = new LinkedList();
	
	Node head;

	/**
	 * @param data value of node Adds new node at the begining.This will call the
	 *             push method defined in LinkedList class
	 */
	public void push(int data) {

		head = stack.addFront(data);

	}

	/**
	 * @return the top value of stack. Doesn't remove the top element,just returns
	 *         the content
	 */
	public int peek() {

		if (head == null) {
			System.out.println("Stack is empty:Underflow");
			return 0;
		}
		return (int) head.data;

	}

	/**
	 * Prints the content of stack
	 */
	public void display() {

		if (head == null) {
			System.out.println("empty");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "---> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	/**
	 * Removes the top element of the stack
	 */
	public void pop() {
		if (head == null) {
			System.out.println("empty stack");
			return;
		}
		head = head.next;
	}


}

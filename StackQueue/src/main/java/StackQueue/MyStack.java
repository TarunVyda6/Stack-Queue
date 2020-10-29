package StackQueue;

public class MyStack<k extends Comparable<k>> {

	private final MyLinkedList<k> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<k>();
	}

	/* push method */
	public void push(INode<k> newNode) {
		myLinkedList.add(newNode);
	}
	
	
}


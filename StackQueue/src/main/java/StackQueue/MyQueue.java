package StackQueue;

public class MyQueue<k extends Comparable<k>> {

	private final MyLinkedList<k> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<k>();
	}

	/* enqueue method */
	public void add(INode<k> newNode) {
		myLinkedList.append(newNode);
	}

	
}

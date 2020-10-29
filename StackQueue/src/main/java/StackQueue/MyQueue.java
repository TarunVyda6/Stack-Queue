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

	/* shows and removes the first element added */
	public INode<k> remove() {
		return myLinkedList.pop();
	}

	/* peek method, shows the first element added */
	public INode<k> peek() {
		return myLinkedList.peek();
	}
}

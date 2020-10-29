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

	/* shows and removes the last element added */
	public INode<k> pop() {
		return myLinkedList.pop();
	}

	/* peek method, shows the last element added */
	public INode<k> peek() {
		return myLinkedList.peek();
	}

}

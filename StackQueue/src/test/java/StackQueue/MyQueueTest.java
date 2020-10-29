package StackQueue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.add(myFirstNode);
		myQueue.add(mySecondNode);
		myQueue.add(myThirdNode);
		Assert.assertEquals(myFirstNode, myQueue.peek());
	}

	@Test
	public void given3NumbersInQueueWhenPopedShouldMatchFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.add(myFirstNode);
		myQueue.add(mySecondNode);
		myQueue.add(myThirdNode);
		Assert.assertEquals(myFirstNode, myQueue.remove());
	}
}

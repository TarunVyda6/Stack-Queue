package StackQueue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumbersAddedToStack_WhenAnalysed_ShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		Assert.assertEquals(myThirdNode, myStack.peek());

	}

	@Test
	public void given3NumbersInStackToPop_WhenAnalysed_ShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		Assert.assertEquals(myThirdNode, myStack.pop());
	}

}

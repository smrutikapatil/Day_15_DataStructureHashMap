package com.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	@Test
	public void givenThreeNumbersWhenAddedToBSTShouldReturnSizeThree() {
		MyBinaryTree<Integer> MyBinaryTree = new MyBinaryTree<>();
		MyBinaryTree.add(56);
		MyBinaryTree.add(30);
		MyBinaryTree.add(70);
		int size = MyBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}

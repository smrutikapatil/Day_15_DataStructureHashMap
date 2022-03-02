package com.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	@Test
	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree programms");
		BinaryTreeService BST = new BinaryTreeService();
		BST.insert(56);
		BST.insert(30);
		BST.insert(70);
		System.out.println("The Binary Sarch Tree is:"+" "+BST);
		
		BinaryTreeService  BST2 = new BinaryTreeService ();
		BST2.insert(76);
		BST2.insert(23);
		BST2.insert(22);
		BST2.insert(61);
		BST2.insert(33);
		BST2.insert(63);
		BST2.insert(66);
		BST2.insert(34);
		System.out.println("The Binary Sarch Tree is:"+" "+BST2);
		
		int size=BST2.getSize();
		System.out.println("The Binary Sarch Tree is:"+" "+size);
	}
}

package com.binarysearchtree;

public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node() {
		super();
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

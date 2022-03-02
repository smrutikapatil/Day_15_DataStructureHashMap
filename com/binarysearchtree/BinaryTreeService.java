package com.binarysearchtree;

public class BinaryTreeService {
	Node root;

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		Node traverse = root;
		while (true) {
			if (traverse == null) {
				root = newNode;
				break;
			} else if (traverse.data < newNode.data) {
				if (traverse.right == null) {
					traverse.right = newNode;
					break;
				}
				traverse = traverse.right;
			} else {
				if (traverse.left == null) {
					traverse.left = newNode;
					break;
				}
				traverse = traverse.left;
			}
		}
	}

	public void search(Node root, int key, Node parent) {
		if (root == null) {
			System.out.println("Key not found");
			return;
		}

		if (root.data == key) {
			if (parent == null) {
				System.out.println("The node with key " + key + " is root node");
			} else if (key < parent.data) {
				System.out.println("The given key is the left node of the node " + "with key " + parent.data);
			} else {
				System.out.println("The given key is the right node of the node " + "with key " + parent.data);
			}
			return;
		}

		if (key < root.data) {
			search(root.left, key, root);
		} else {
			search(root.right, key, root);
		}
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(Node current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	@Override
	public String toString() {
		return "BinaryTreeService [root=" + root + "]";
	}
}
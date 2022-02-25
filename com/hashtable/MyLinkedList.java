package com.hashtable;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void append(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<K> tempNode = this.tail;
			this.tail = newNode;
			tempNode.setNext(newNode);
		}

	}

	public INode pop(INode<K> deleteNode) {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode<K> search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void printMyNodes() {
		System.out.println("My Nodes:" + head);

	}

	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
}
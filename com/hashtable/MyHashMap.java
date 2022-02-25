package com.hashtable;

import java.util.ArrayList;

public class MyHashMap<K, V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketsArray;

	public MyHashMap() {
		this.numBuckets = 10;
		this.myBucketsArray = new ArrayList<>(numBuckets);
		for (int i = 0; i < numBuckets; i++)
			this.myBucketsArray.add(null);
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketsArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketsArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketsArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashmapNodes List{" + myBucketsArray + '}';
	}
}
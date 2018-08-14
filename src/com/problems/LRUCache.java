package com.problems;

import java.util.*;

public class LRUCache<K, V> {

	class Node<T, U> {
		Node<T,U> previous;
		Node<T,U> next;
		T key;
		U value;
		
		public Node(Node<T, U> previous, Node<T, U> next, T key, U value) {
			this.previous = previous;
			this.next = next;
			this.key = key;
			this.value = value;
		}
	}
	
	private HashMap<K, Node<K,V>> cache;
	private Node<K, V> leastRecentlyUsed;
	private Node<K, V> mostRecentlyUsed;
	private int maxSize;
	private int currentSize;
	
	public LRUCache(int maxSize) {
		this.maxSize = maxSize;
		this.currentSize = 0;
		leastRecentlyUsed = new Node(null, null, null, null);
		mostRecentlyUsed = leastRecentlyUsed;
		cache = new HashMap<K, Node<K,V>>();
	}
}

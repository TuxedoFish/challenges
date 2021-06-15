package com.tuxedofish.challenges.linkedlist;

public class LinkedListUtils {
	public static ListNode generateLinkedListFromArray(int[] array) {
		
		// Set up the first node by value
		int index = 0;
		ListNode x = new ListNode(array[index]);
		
		// Set the current to the return
		ListNode current = x;
		index ++;
		
		// Loop over array and setup
		while(index < array.length) {
			current.next = new ListNode(array[index]);
			current = current.next;
			index ++;
		}
		
		// Return the top level node
		return x;
	}
}

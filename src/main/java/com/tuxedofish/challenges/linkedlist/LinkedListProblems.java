package com.tuxedofish.challenges.linkedlist;

public class LinkedListProblems {
	/* 83. Remove duplicates from sorted linked list
	   Given the head of a sorted linked list, 
	   delete all duplicates such that each 
	   element appears only once. 
	   Return the linked list sorted as well.
    */
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null) { return null; }
    	ListNode current = head;
    	
    	while(current.next != null) {
    		// As sorted if the same value can remove
    		if(current.next.val == current.val) {
    			current.next = current.next.next;
    		} else {
    			current = current.next;
    		}
    	}
    	
    	return head;
    }
}

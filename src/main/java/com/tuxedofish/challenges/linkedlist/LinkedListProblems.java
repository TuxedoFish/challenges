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
    /* 
     * 160. Intersection of Two Linked Lists
     * Given the heads of two singly linked-lists 
     * headA and headB, return the node at which 
     * the two lists intersect. If the two linked 
     * lists have no intersection at all, return null.
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	// The below is O(n x m) time complexity
    	// And O(n + m) space complexity
//        if(headA == null || headB == null) { return null; }
//    	
//    	ListNode currA = headA;
//    	
//    	while(currA != null) {
//        	ListNode currB = headB;
//        	
//    		while(currB != null) {
//    			if(currB == currA) {
//                    return currA;
//    			}
//    			currB = currB.next;
//    		}
//    		
//    		currA = currA.next;
//    	}
//    	
//    	return null;
    	// The below is O(2n + m) => O(n) time complexity
    	// And O() space complexity
    	if(headA == null || headB == null) { return null; }
    	
    	// Calculate count of A
    	int countA = 0;
    	ListNode curr = headA;
    	while(curr!=null) {countA ++; curr = curr.next;}
    	
    	// Calculate count of B
    	int countB = 0;
    	curr = headB;
    	while(curr!=null) {countB ++; curr = curr.next;}
    	
    	// Calculate offset for runners
    	int offset = countB - countA;
    	ListNode runnerA = headA;
    	ListNode runnerB = headB;
    	
    	// Loop over at the given offset
    	while(runnerA != null && runnerB != null) {
    		if(offset > 0) {
    			// If B > A then offset runnerB
    			runnerB = runnerB.next;
    			offset --;
    		} else if(offset < 0) {
    			// If A > B then offset runnerA
    			runnerA = runnerA.next;
    			offset ++;
    		} else {
    			// Once the offset is resolved iterate 
    			if(runnerA == runnerB) {
    				return runnerA;
    			} else {
    				runnerA = runnerA.next;
        			runnerB = runnerB.next;
    			}
    		}
    	}
    	
    	return null;
    }
}

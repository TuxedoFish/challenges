package com.tuxedofish.challenges.linkedlist;

import java.util.Hashtable;

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
    	// And O(1) space complexity
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
    /* 
     * 141. Linked List Cycle
     * Given head, the head of a linked list,
     * determine if the linked list has a cycle in it.
     */
    public static Boolean hasCycle(ListNode head) {
    	// Brute force solution using Hashtable
    	// The below is O(n * 1) => O(n) time complexity [containsKey is O(1)]
    	// And O(n) space complexity
//    	ListNode curr = head;
//    	int index = 0;
//        Hashtable<ListNode, Integer> hashtable = new Hashtable<ListNode, Integer>();
//        
//        while(curr != null) {
//            if(hashtable.containsKey(curr)) {
//                return true;
//            }
//            hashtable.put(curr, index);
//            curr = curr.next;
//            index ++;
//        }
//    	
//        
//        return false;
    	// The below is O(n) time complexity
    	// And O(1) constant memory
    	if(head == null) { return false; }
    	
    	ListNode slow = head;
    	ListNode fast = head.next;
    	
    	while(fast != null && fast.next != null) {
    		if(slow == fast) { return true; }
    		slow = slow.next;
			fast = fast.next.next;
    	}
    	
    	return false;
    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    	
    	// The below is O(n + m) Time complexity => o(n)
    	// where n - length of list1 and m is length of list2
    	// Still not the fastest solution
    	
    	// Variable setup
        int index = 0;
        ListNode nodeA = null, nodeB = null, currA = list1;
        
        // Iterate through for nodeA and nodeB
        while(index <= b + 1 & currA != null) {
            if(index == a - 1) {
                nodeA = currA;
            }
            if(index == b + 1) {
                nodeB = currA;
            }
            index ++;
            currA = currA.next;
        }
        
        // Go to end of list 2 and append nodeB
        ListNode currB = list2;
        while (currB.next != null) { currB = currB.next; }
        currB.next = nodeB;
        
        // Append list2 + nodeB to nodeA
        nodeA.next = list2;
        
        // Return the complete linked list
        return list1;
    }
}

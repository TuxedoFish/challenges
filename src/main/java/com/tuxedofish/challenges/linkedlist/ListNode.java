package com.tuxedofish.challenges.linkedlist;

// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public String toString(){  
    	StringBuilder list = new StringBuilder();
    	list.append('[');
    	list.append(this.val);
    	ListNode current = this.next;
    	while(current != null) {
    		list.append(", ");
    		list.append(current.val);
    		current = current.next;
    	}
    	list.append(']');
    	return list.toString();
	}  
}

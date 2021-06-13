package com.tuxedofish.challenges.linkedlist;

// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    @Override
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
    
    @Override
    public boolean equals(Object o) {
    	// If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
  
        // Check if the same instance
        if (!(o instanceof ListNode)) {
            return false;
        }
          
        // Type cast o to ListNode 
        ListNode c = (ListNode) o;
        ListNode curr = this;
        
        // Compare the data members and return accordingly 
        while(c != null) {
        	if(curr == null) { return false; }
            if(c.val != curr.val) { return false; }
            
            curr = curr.next;
            c = c.next;
        }
        return true;
    }
}

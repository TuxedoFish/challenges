package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HasCycleTest {
	@Test                                               
    @DisplayName("Returns true that has node")   
    public void simpleCase() {
    	Boolean expected = true;
    	
        ListNode loop = LinkedListUtils.generateLinkedListFromArray(new int[] {3, 2, 0});
        ListNode loopNode = new ListNode(-4, loop);
        loop.next.next.next = loopNode;
       
        Boolean actual = LinkedListProblems.hasCycle(loop);
        assertEquals(expected, actual);
    }    
}

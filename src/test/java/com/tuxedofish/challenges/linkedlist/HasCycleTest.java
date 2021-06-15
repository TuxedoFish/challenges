package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HasCycleTest {
	@Test                                               
    @DisplayName("Returns true that has node")   
    public void loopCase() {
    	Boolean expected = true;
        ListNode loop = LinkedListUtils.generateLinkedListFromArray(new int[] {3, 2, 0});
        ListNode loopNode = new ListNode(-4, loop);
        loop.next.next.next = loopNode;
       
        Boolean actual = LinkedListProblems.hasCycle(loop);
        assertEquals(expected, actual);
    }    
	@Test                                               
    @DisplayName("Returns false if input is null")   
    public void nullCase() {
    	Boolean expected = false;
        Boolean actual = LinkedListProblems.hasCycle(null);
        assertEquals(expected, actual);
    }    
	@Test                                               
    @DisplayName("Returns false if no loop")   
    public void noLoopCase() {
    	Boolean expected = false;
    	ListNode noloop = LinkedListUtils.generateLinkedListFromArray(new int[] {3, 2, 0});
        Boolean actual = LinkedListProblems.hasCycle(noloop);
        assertEquals(expected, actual);
    }    
}

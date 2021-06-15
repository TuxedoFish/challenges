package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Test                                               
    @DisplayName("Returns correct node of intersection")   
    public void simpleCase() {
    	ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {8, 4, 5});	
    	
        ListNode inputA = LinkedListUtils.generateLinkedListFromArray(new int[] {4, 1});
        inputA.next = expected;
        ListNode inputB = LinkedListUtils.generateLinkedListFromArray(new int[] {5, 6, 1});
        inputB.next = expected;
       
        ListNode actual = LinkedListProblems.getIntersectionNode(inputA, inputB);
        assertEquals(expected, actual);
    }    
    @Test                                               
    @DisplayName("Returns correct node of complex intersection")   
    public void complexCase() {
    	ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {8, 4, 5});	
    	
        ListNode inputA = LinkedListUtils.generateLinkedListFromArray(new int[] {4, 1, 7, 8, 4});
        inputA.next = expected;
        ListNode inputB = LinkedListUtils.generateLinkedListFromArray(new int[] {5, 6, 1, 9, 4});
        inputB.next = expected;
       
        ListNode actual = LinkedListProblems.getIntersectionNode(inputA, inputB);
        assertEquals(expected, actual);
    } 
    @Test                                               
    @DisplayName("Returns null if input is null")   
    public void nullCase() {
        ListNode inputA = null;
        ListNode inputB = LinkedListUtils.generateLinkedListFromArray(new int[] {5, 6, 1, 8, 4, 5});
        ListNode expected = null;
        ListNode actual = LinkedListProblems.getIntersectionNode(inputA, inputB);
        assertEquals(expected, actual);
    }
}

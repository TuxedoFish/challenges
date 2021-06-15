package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeInBetweenTest {
	@Test                                               
    @DisplayName("Returns expected loop removal")   
    public void simpleCase() {
		ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,1000000,1000001,1000002,1000003,1000004,6});
        ListNode list1 = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,2,3,4,5,6});
        ListNode list2 = LinkedListUtils.generateLinkedListFromArray(new int[] {1000000,1000001,1000002,1000003,1000004});
        
        ListNode actual = LinkedListProblems.mergeInBetween(list1, 2, 5, list2);
        assertEquals(expected, actual);
    }    
	@Test                                               
    @DisplayName("Returns expected if b is end of array")   
    public void endOfArrayCase() {
		ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,1000000,1000001,1000002,1000003,1000004});
        ListNode list1 = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,2,3,4,5,6});
        ListNode list2 = LinkedListUtils.generateLinkedListFromArray(new int[] {1000000,1000001,1000002,1000003,1000004});
        
        ListNode actual = LinkedListProblems.mergeInBetween(list1, 2, 6, list2);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns expected if a is start of array")   
    public void startOfArrayCase() {
		ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1000000,1000001,1000002,1000003,1000004});
        ListNode list1 = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,2,3,4,5,6});
        ListNode list2 = LinkedListUtils.generateLinkedListFromArray(new int[] {1000000,1000001,1000002,1000003,1000004});
        
        ListNode actual = LinkedListProblems.mergeInBetween(list1, 1, 6, list2);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns expected if a is equal to b")   
    public void equalValuesCase() {
		ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,2,1000000,1000001,1000002,1000003,1000004,4, 5,6});
        ListNode list1 = LinkedListUtils.generateLinkedListFromArray(new int[] {0,1,2,3,4,5,6});
        ListNode list2 = LinkedListUtils.generateLinkedListFromArray(new int[] {1000000,1000001,1000002,1000003,1000004});
        
        ListNode actual = LinkedListProblems.mergeInBetween(list1, 3, 3, list2);
        assertEquals(expected, actual);
    }
}

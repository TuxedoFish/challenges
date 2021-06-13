package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedTest {
    @Test                                               
    @DisplayName("Simple test case should work")   
    public void testRemoveDuplicates() {
        ListNode input = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1, 1});
        ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1});
        ListNode actual = LinkedListProblems.deleteDuplicates(input);
        assertEquals(expected, actual);
    }
}

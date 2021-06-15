package com.tuxedofish.challenges.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedTest {
    @Test                                               
    @DisplayName("Single duplicate value is removed")   
    public void simpleCase() {
        ListNode input = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1, 1});
        ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1});
        ListNode actual = LinkedListProblems.deleteDuplicates(input);
        assertEquals(expected, actual);
    }
    @Test                                               
    @DisplayName("Multiple duplicate values are removed")   
    public void complexCase() {
        ListNode input = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1, 1, 1, 2, 2, 3, 4, 7, 9, 9, 12});
        ListNode expected = LinkedListUtils.generateLinkedListFromArray(new int[] {0, 1, 2, 3, 4, 7, 9, 12});
        ListNode actual = LinkedListProblems.deleteDuplicates(input);
        assertEquals(expected, actual);
    }
    @Test                                               
    @DisplayName("Null input should return null")   
    public void nullCase() {
        ListNode input = null;
        ListNode expected = null;
        ListNode actual = LinkedListProblems.deleteDuplicates(input);
        assertEquals(expected, actual);
    }
}

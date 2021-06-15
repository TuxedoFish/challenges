package com.tuxedofish.challenges.binarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	@Test                                               
    @DisplayName("Returns true with even input")   
    public void evenLengthCase() {
    	int expected = 4;
    	int[] input = new int[] {-1,0,3,5,9,12};
    	int target = 9;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
	@Test                                               
    @DisplayName("Returns true with even input")   
    public void oddLengthCase() {
    	int expected = 1;
    	int[] input = new int[] {-5,3,6,12,19};
    	int target = 3;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns true with target at end")   
    public void endCase() {
    	int expected = 5;
    	int[] input = new int[] {-1,7,6,5,12,19};
    	int target = 19;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
	@Test                                               
    @DisplayName("Returns true with target at end")   
    public void startCase() {
    	int expected = 0;
    	int[] input = new int[] {-6,0,3,5,12};
    	int target = -6;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
	@Test                                               
    @DisplayName("Returns true with target as -1")   
    public void edgeCase() {
    	int expected = 0;
    	int[] input = new int[] {-1,0,2,3,4,5};
    	int target = -1;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
	@Test                                               
    @DisplayName("Returns correct not found with small array")   
    public void smallArrayCase() {
    	int expected = -1;
    	int[] input = new int[] {2, 5};
    	int target = 0;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    } 
	@Test                                               
    @DisplayName("Returns correct with small array")   
    public void smallArrayStartCase() {
    	int expected = 0;
    	int[] input = new int[] {2, 5};
    	int target = 2;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
	@Test                                               
    @DisplayName("Returns correct with small array")   
    public void smallArrayEndCase() {
    	int expected = 1;
    	int[] input = new int[] {2, 5};
    	int target = 5;
    	
    	int actual = BinarySearchProblems.search(input, target);
        assertEquals(expected, actual);
    }  
}

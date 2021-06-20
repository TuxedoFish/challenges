package com.tuxedofish.challenges.binarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountNegativesMatrixTest {
	@Test                                               
    @DisplayName("Returns correct count for matrix")   
    public void countMatrixCase() {
    	int expected = 8;
    	int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int actual = BinarySearchProblems.countNegatives(grid);
        assertEquals(expected, actual);
    }  
}
package com.tuxedofish.challenges.binarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.tuxedofish.challenges.binarytree.twodimensionalmatrixsearch.*;

public class TwoDimensionalMatrixSearchTest {
	@Test                                               
    @DisplayName("Returns correct count for matrix")   
    public void countMatrixCase() {
		Solution solution = new Solution();
    	boolean expected = false;
//    	int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    	int[][] matrix = new int[][] {{1,3,5}};
    	boolean actual = solution.searchMatrix(matrix, 4);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns correct count for matrix")   
    public void example1Case() {
		Solution solution = new Solution();
    	boolean expected = true;
    	int[][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    	boolean actual = solution.searchMatrix(matrix, 3);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns correct count for matrix")   
    public void example2Case() {
		Solution solution = new Solution();
    	boolean expected = false;
    	int[][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    	boolean actual = solution.searchMatrix(matrix, 13);
        assertEquals(expected, actual);
    }
	@Test                                               
    @DisplayName("Returns correct count for matrix")   
    public void coordTest() {
		Solution solution = new Solution();
		solution.n = 5;
		solution.m = 5;
		solution.size = 25;
		Coord actual = solution.getCoordFromMid(4);
        assertEquals(0, actual.row);
        assertEquals(4, actual.col);
    }
}
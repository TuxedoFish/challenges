package com.tuxedofish.challenges.binarytree.twodimensionalmatrixsearch;

public class Solution {
	public int n, m, size;
	
	public boolean searchMatrix(int[][] matrix, int target) {
        // Using a binary search algorithm
        // We can treat it like an array of size n*m
        // Therefore time complexity O(log(n*m))
        n = matrix[0].length;
        m = matrix.length;
        size = n * m;
        
        return searchMatrixRecursive(matrix, target, 0, size - 1);
    }
	
	public Coord getCoordFromMid(int mid) {
		int x = mid / n;
		int y = mid - (x * n);
		return new Coord(x, y);
	}
    
    public boolean searchMatrixRecursive(int[][] matrix, int target, int lower, int upper) {
        int mid = lower + ((upper - lower) / 2);
        Coord c = getCoordFromMid(mid);
        int val = matrix[c.row][c.col];
        
        if(lower == upper) {
            return val == target;   
        }
        
        if(val < target) {
        	if(mid == size - 1 || mid == upper) { return false; }
            return searchMatrixRecursive(matrix, target, mid + 1, upper);
        } else if(val > target) {
        	if(mid == 0 || mid == lower) { return false; }
            return searchMatrixRecursive(matrix, target, lower, mid - 1);
        } else {
            return true;
        }
    }
}

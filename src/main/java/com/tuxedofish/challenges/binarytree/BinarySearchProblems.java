package com.tuxedofish.challenges.binarytree;

public class BinarySearchProblems {
	public static int search(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }
    
    public static int searchRecursive(int[] nums, int target, int left, int right) {
    	// Binary search is O(log(n))       
    	// This is because in the worst case
    	// it takes k iterations to get to 1
    	// Worst case is N/(2^k) = 1
    	// N = 2^k
    	// k = log(n)
    	// Space complexity is O(1) constant space
        int mid = left + ((right - left) / 2);
        int curr = nums[mid];
        
        if(left == right) {
            return curr == target ? mid : -1; 
        }
        
        if(curr < target) {
        	if(mid == nums.length) { return -1; }
            return searchRecursive(nums, target, mid + 1, right);
        } else if (curr > target) {
        	if(mid == 0) { return -1; }
            return searchRecursive(nums, target, left, mid - 1);
        } else {
            return mid;
        }
    }
    
    public static int countNegatives(int[][] grid) {
    	// Time complexity is O(n + m)
    	// Space complexity is O(1) constant space
    	
    	// There is a brute force solution with O(n * m)
    	// There is also a recursive solution with O(n * m)
    	
        // Get the number of rows and cols
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Initialize the count
        int count = 0;
        
        // Start at the bottom left
        int i = 0;
        int j = rows - 1;
        
        // Loop through
        while(i < cols && j != -1) {
            if(grid[j][i] < 0) {
                // Add whole row
                count += cols - i;
                // Move upwards
                j --;
            } else {
                // Move to the right
                i ++;
            }
        }
        
        return count;
    }
    
}

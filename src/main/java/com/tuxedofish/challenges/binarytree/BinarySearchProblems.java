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
}

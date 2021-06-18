package com.tuxedofish.challenges.binarytree.findduplicateinarray;

class Solution {
    public int findDuplicate(int[] nums) {
        // Use tortoise and hare to find intersection in loop
        int tortoise = nums[nums[0]];
        int hare = nums[nums[nums[0]]];
        
        while(hare != tortoise) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        
        // Slow hare down and they will meet at loop entrance
        tortoise = nums[0];
        
        while(hare != tortoise) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return tortoise;
    }
}
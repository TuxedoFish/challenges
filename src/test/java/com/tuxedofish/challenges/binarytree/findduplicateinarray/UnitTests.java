package com.tuxedofish.challenges.binarytree.findduplicateinarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UnitTests {
	
	private Solution solution;

    @BeforeAll
    public void init() {
        this.solution = new Solution();
    }
	
	@Test                                               
    @DisplayName("Returns duplicate for medium array")   
    public void simpleCase() {
    	int[] nums = new int[] {1,2,3,3};
        int actual = solution.findDuplicate(nums);
        assertEquals(3, actual);
    }
	@Test                                               
    @DisplayName("Returns duplicate within small array")   
    public void smallestArrayCase() {
    	int[] nums = new int[] {1,1};
        int actual = solution.findDuplicate(nums);
        assertEquals(1, actual);
    }
}

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
    @DisplayName("Returns true that has node")   
    public void simpleCase() {
    	int[] nums = new int[] {1,2,3,3};
        int actual = solution.findDuplicate(nums);
        assertEquals(3, actual);
    }
}

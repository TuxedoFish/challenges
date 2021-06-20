package com.tuxedofish.challenges.binarytree.makebalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.tuxedofish.challenges.binarytree.TreeNode;

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
    	TreeNode input = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));
        TreeNode actual = solution.balanceBST(input);
        assertEquals(input, actual);
    }
}

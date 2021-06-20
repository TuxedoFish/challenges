package com.tuxedofish.challenges.binarytree.makebalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.tuxedofish.challenges.binarytree.TreeNode;
import com.tuxedofish.challenges.binarytree.Utils;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MakeBalancedTest {
	
	private Solution solution;

    @BeforeAll
    public void init() {
        this.solution = new Solution();
    }
	
	@Test                                               
    @DisplayName("Returns balanced binary search tree")   
    public void simpleCase() {
    	TreeNode input = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));
        TreeNode actual = solution.balanceBST(input);
        // Expect node values to be the same as input
        assertEquals(Utils.getValues(input), Utils.getValues(actual));
        // Expect node to be balanced
        assertEquals(true, Utils.isBalanced(actual));
    }
}

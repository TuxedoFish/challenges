package com.tuxedofish.challenges.binarytree;

import java.util.ArrayList;

public class Utils {
	public static ArrayList<Integer> getValues(TreeNode node) {
        ArrayList<Integer> curr = new ArrayList<Integer>();
        if(node.left != null) { curr.addAll(getValues(node.left)); }
        curr.add(node.val);
        if(node.right != null) { curr.addAll(getValues(node.right)); }
        return curr;
	}
	
	public static boolean isBalanced(TreeNode node) {
		boolean isNodeBalanced = Math.abs((getMaxDepth(node.left, 0) - getMaxDepth(node.right, 0))) <= 0;
		
		boolean isLeftNodeBalanced = true;
		if(node.left != null) { isLeftNodeBalanced = isBalanced(node.left); }
		
		boolean isRightNodeBalanced = true;
		if(node.right != null) { isRightNodeBalanced = isBalanced(node.right); }
		
		return isNodeBalanced && isLeftNodeBalanced && isRightNodeBalanced;
	}
	
	public static int getMaxDepth(TreeNode node, int depth) {
		if(node == null) { return depth; }
		int leftDepth = node.left == null ? depth : getMaxDepth(node.left, depth + 1);
		int rightDepth = node.right == null ? depth : getMaxDepth(node.right, depth + 1);
		return rightDepth > leftDepth ? rightDepth : leftDepth;
	}
}

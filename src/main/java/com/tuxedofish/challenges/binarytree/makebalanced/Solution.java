package com.tuxedofish.challenges.binarytree.makebalanced;

import java.util.ArrayList;

import com.tuxedofish.challenges.binarytree.TreeNode;

class Solution {
    ArrayList<Integer> inorder; 
    
    public TreeNode balanceBST(TreeNode root) {
        
        // Create integer array of in order traversal
        inorder = inOrderTraversal(root);
        
        // Traverse through splitting at midpoints for l and r nodes
        // Build up from nothing the first node is mid - left will be mid 
        // of the list to left and right will be mid of the list to the right
        return getBalancedBSTFromArray(0, inorder.size() - 1);
    }
    
    // This is O(n) because it needs to look at mid point until seen every element
    public TreeNode getBalancedBSTFromArray(int lower, int upper) {
        
        // Calculate the midpoint
        int mid = lower + ((upper - lower) / 2);
        int val = inorder.get(mid);
        
        // Setup nulls either side
        TreeNode left = null, right = null;
        
        if(mid - 1 == 0) {
            left = new TreeNode(inorder.get(0));
        } else if(mid - 1 > 0 && mid - 1 > lower) {
            left = getBalancedBSTFromArray(lower, mid - 1);
        } else if(mid - 1 == lower && lower != mid) {
            left = new TreeNode(inorder.get(lower));
        }
        
        if(mid + 1 == inorder.size() - 1) {
            right = new TreeNode(inorder.get(inorder.size() - 1));
        } else if(mid + 1 < inorder.size() - 1 && mid + 1 < upper) {
            right = getBalancedBSTFromArray(mid + 1, upper);
        } else if(mid + 1 == upper && upper != mid) {
            right = new TreeNode(inorder.get(upper));
        }
        
        return new TreeNode(val, left, right);
    }
    
    // This is O(n) as traverses every node in the tree exactly once
    public ArrayList<Integer> inOrderTraversal(TreeNode node) {
        
        ArrayList<Integer> curr = new ArrayList<Integer>();
        if(node.left != null) { curr.addAll(inOrderTraversal(node.left)); }
        curr.add(node.val);
        if(node.right != null) { curr.addAll(inOrderTraversal(node.right)); }
        return curr;
    }
}
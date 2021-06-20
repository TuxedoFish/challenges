package com.tuxedofish.challenges.binarytree;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeNode {
	public TreeNode left = null, right = null;
	public int val;

	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.left = left;
		this.right = right;
		this.val = val;
	}

	public TreeNode(int val) {
		super();
		this.val = val;
	}
	
	public static ArrayList<PrintNode> getRelativeCoords(TreeNode node, int x, int y) {
		ArrayList<PrintNode> coords = new ArrayList<PrintNode>();
		
		if(node.left != null) { coords.addAll(getRelativeCoords(node.left, x==0 ? x - 2 : x - 1, y + 1)); }
		coords.add(new PrintNode(x, y, node.val, node.left != null, node.right != null));
		if(node.right != null) { coords.addAll(getRelativeCoords(node.right, x==0 ? x + 2 : x + 1, y + 1)); }
		
		return coords;
	}
	
	@Override
	public String toString() {
		
		// Get the coordinates of the tree
		ArrayList<PrintNode> coords = new ArrayList<PrintNode>();
		coords = getRelativeCoords(this, 0, 0);
		
		// Find the min / max x and max y
		int minX = 0, maxX = 0, maxY = 0;
		for(int i=0; i<coords.size(); i++) {
			PrintNode c = coords.get(i);
			if(c.x < minX) { minX = c.x; }
			if(c.x > maxX) { maxX = c.x; }
			if(c.y > maxY) { maxY = c.y; }
		}
		
		// How many chars are needed
		int width = ((maxX - minX) * 2) + 1;
		int height = (maxY * 2) + 1;
		
		// Create a char array
		String[][] chars = new String[height][width];
		
		// Add empty string as default
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				chars[i][j] = " ";
			}
		}
		
		int y = 0;
		while(y <= maxY) {
			for(int i=0; i<coords.size(); i++) {
				PrintNode c = coords.get(i);
						
				if(c.y == y) {
					// This coordinate is at the right level
					int xCoord = (-(minX * 2)) + (c.x * 2);
					int yCoord = c.y * 2;
					System.out.println("(" + xCoord + ", " + yCoord + ")");
					chars[yCoord][xCoord] = String.valueOf(c.val);
					
					if(c.hasLeft) {
						if(c.x == 0) {
							chars[yCoord + 1][xCoord - 1] = "‾";
							chars[yCoord + 1][xCoord - 2] = "‾";
							chars[yCoord + 1][xCoord - 3] = "/";
						} else {
							chars[yCoord + 1][xCoord - 1] = "/";
						}
					}
					
					if(c.hasRight) {
						if(c.x == 0) {
							chars[yCoord + 1][xCoord + 1] = "‾";
							chars[yCoord + 1][xCoord + 2] = "‾";
							chars[yCoord + 1][xCoord + 3] = "\\";
						} else {
							chars[yCoord + 1][xCoord + 1] = "\\";
						}
					}
				}
			}
			
			y++;
		}
		
		String result = "";
		for (int i = 0; i < chars.length; i++) {
            result += "\n";
            result += String.join("", chars[i]);
        }
        result += "\n";
		
		return result;
	}
}

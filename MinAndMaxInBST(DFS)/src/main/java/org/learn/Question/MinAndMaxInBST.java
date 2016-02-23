
package org.learn.Question;

public class MinAndMaxInBST {
	public static int min(Node root) {
		if(null == root) {
			System.out.println("Tree is empty");
			return -1;
		}
		//we found the min value
		if(root.left == null) {
			return root.data;
		}
		return min(root.left);
	}
	
	public static int max(Node root) {
		if(null == root) {
			System.out.println("Tree is empty");
			return -1;
		}
		//we found the max value
		if(root.right == null) {
			return root.data;
		}
		return max(root.right);
	}
}

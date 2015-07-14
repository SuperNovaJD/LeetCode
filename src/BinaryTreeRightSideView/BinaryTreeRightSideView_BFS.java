package BinaryTreeRightSideView;

import java.util.*;

public class BinaryTreeRightSideView_BFS {
	public List<Integer> rightSideView(TreeNode root) {
		if (root == null) {
			return new ArrayList<Integer>();
		}
		LinkedList<TreeNode> q1 = new LinkedList<TreeNode>();
		LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();
		q1.add(root);

		while (!q1.isEmpty()) {
			TreeNode right = q1.peekLast();
			result.add(right.val);
			while (!q1.isEmpty()) {
				TreeNode temp = q1.pop();
				if (temp.left != null) {
					q2.add(temp.left);
				}
				if (temp.right != null) {
					q2.add(temp.right);
				}
			}
			q1 = q2;
			q2 = new LinkedList<TreeNode>();
		}
		return result;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}

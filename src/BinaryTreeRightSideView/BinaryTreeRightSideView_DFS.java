package BinaryTreeRightSideView;

import java.util.*;

import BinaryTreeRightSideView.BinaryTreeRightSideView_BFS.TreeNode;

public class BinaryTreeRightSideView_DFS {
	public class Solution {
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> result = new ArrayList<Integer>();
			help(root, 1, result);
			return result;
		}

		public void help(TreeNode root, int depth, List<Integer> result) {
			if (root == null)
				return;
			if (result.size() < depth)
				result.add(root.val);
			help(root.right, depth + 1, result);
			help(root.left, depth + 1, result);
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
}

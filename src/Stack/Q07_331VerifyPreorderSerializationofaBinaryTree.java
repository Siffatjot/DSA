//https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/description/

package Stack;

import java.util.*;

public class Q07_331VerifyPreorderSerializationofaBinaryTree {
	public static void main(String[] args) {
		String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		System.out.println(isValidSerialization(preorder));
	}

	public static boolean isValidSerialization(String preorder) {
		if (preorder.isEmpty()) {
			return false;
		}
		String[] arr = preorder.split(",");
		Stack<String> S = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("#") && !S.isEmpty() && S.peek().equals("#")) {
				while (!S.isEmpty() && S.peek().equals("#")) {
					S.pop();
					if (S.isEmpty()) {
						return false; // More "#" than needed
					}
					S.pop(); // Pop the corresponding non-null node
				}
			}
			S.push(arr[i]);
		}
		return S.size() == 1 && S.peek().equals("#");
	}
}

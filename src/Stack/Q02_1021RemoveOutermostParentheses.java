//https://leetcode.com/problems/remove-outermost-parentheses/
//
//Example 1:
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation: 
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//
//Example 2:
//Input: s = "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation: 
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

package Stack;

import java.util.*;

public class Q02_1021RemoveOutermostParentheses {
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}

	private static String removeOuterParentheses(String s) {
		StringBuilder ans = new StringBuilder();
		Stack<Character> S = new Stack<>();

		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			char sp = s.charAt(i);

			if (sp == '(') {
				S.push(sp);
			} else if (sp == ')') {
				S.pop();
				if (S.isEmpty()) {
					ans.append(s.substring(start + 1, i));
					start = i + 1;
				}
			}
		}
		return ans.toString();
	}
}

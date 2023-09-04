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

public class Q02_1021RemoveOutermostParentheses {
	public static void main(String[] args) {
		String s  = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}

	public static String removeOuterParentheses(String s) {
		return s;
	}
}

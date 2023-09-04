//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

package Stack;

import java.util.*;

public class Q03_1047RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {
		String input = "abbaca";
		System.out.println(removeDuplicates(input));
	}

	public static String removeDuplicates(String s) {
		if (s.isEmpty()) {
			return "";
		}
		Stack<Character> S = new Stack<>();
		S.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			char sp = s.charAt(i);

			if (!S.isEmpty() && S.peek() == sp) {
				S.pop();
			}else {
                S.push(sp);
            }
		}
		

		StringBuilder sb = new StringBuilder();
		while (!S.isEmpty()) {
			sb.append(S.pop().toString());
		}
		
		return sb.reverse().toString();
	}
}

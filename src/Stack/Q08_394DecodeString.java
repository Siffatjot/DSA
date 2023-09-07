//https://leetcode.com/problems/decode-string/
package Stack;

import java.util.*;

public class Q08_394DecodeString {
	public static void main(String[] args) {
		String input = "2[abc]3[cd]ef";
		System.out.println(decodeString(input));
	}

	public static String decodeString(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c != ']') {
				stack.push(c);
			} else {
				StringBuilder sb = new StringBuilder();
				while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
					sb.insert(0, stack.pop());
				}
				String re = sb.toString();
				stack.pop();
				
				StringBuilder temp = new StringBuilder();
				while (!stack.isEmpty() && Character.isDigit(stack.peek())){
					temp.insert(0, stack.pop());
				}
				int n = Integer.valueOf(temp.toString());
				
				while(n > 0) {
					for(char ch : re.toCharArray())  
                        stack.push(ch);
                    n--;
				}
			}
		}
		
		StringBuilder retv = new StringBuilder();
        while(!stack.isEmpty())
            retv.insert(0, stack.pop());

        return retv.toString();
	}
}
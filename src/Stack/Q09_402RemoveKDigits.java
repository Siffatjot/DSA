package Stack;

import java.util.*;

public class Q09_402RemoveKDigits {
	public static void main(String[] args) {
		String num = "10200";
		int k = 1;
		System.out.println(removeKdigits(num, k));
	}

	private static String removeKdigits(String num, int k) {
		if(num.length() == k){
            return "0";
        }
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
 
			while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
				stack.pop();
				k--;
			}

			if (stack.size() == 0 && c == '0') {
				continue;
			} else {
				stack.push(c);
			}
		}

		while (!stack.isEmpty() && k > 0) {
			stack.pop();
			k--;
		}

		String ans = "";
		while (!stack.isEmpty()) {
			ans = stack.pop() + ans;
		}
		if(ans.equals("")) return "0";
		return ans;
	}

}

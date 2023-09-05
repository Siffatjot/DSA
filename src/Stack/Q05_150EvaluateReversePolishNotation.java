//https://leetcode.com/problems/evaluate-reverse-polish-notation/
package Stack;

import java.util.*;

class Q05_150EvaluateReversePolishNotation {
	public static void main(String[] args) {
		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
//		int ans = 0;
//		Stack<Integer> S = new Stack<>();
//		for (String token : tokens) {
//			if (token.equals("+")) {
//				int temp1 = S.pop();
//				int temp2 = S.pop();
//				ans = temp1 + temp2;
//			} else if (token.equals("-")) {
//				int temp1 = S.pop();
//				int temp2 = S.pop();
//				ans = temp1 - temp2;
//			}else if (token.equals("*")) {
//				int temp1 = S.pop();
//				int temp2 = S.pop();
//				ans = temp1 * temp2;
//			}else if (token.equals("/")) {
//				int temp1 = S.pop();
//				int temp2 = S.pop();
//				ans = temp1 / temp2;
//				S.push(ans);
//			} else {
//				S.push(Integer.parseInt(token));
//			}
//		}
//		return S.pop();
		Stack<Integer> S = new Stack<>();

		for (String token : tokens) {
			if (isOperator(token)) {
				int operand2 = S.pop();
				int operand1 = S.pop();
				int result = performOperation(token, operand1, operand2);
				S.push(result);
			} else {
				S.push(Integer.parseInt(token));
			}
		}

		return S.pop();
	}

	private static boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}

	private static int performOperation(String operator, int operand1, int operand2) {
		switch (operator) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/":
			return operand1 / operand2;
		default:
			return 0;
		}
	}
}

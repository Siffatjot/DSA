//https://leetcode.com/problems/baseball-game/

//Input: ops = ["5","-2","4","C","D","9","+","+"]
//Output: 27
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"-2" - Add -2 to the record, record is now [5, -2].
//"4" - Add 4 to the record, record is now [5, -2, 4].
//"C" - Invalidate and remove the previous score, record is now [5, -2].
//"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.

package Stack;
import java.util.*;
public class Q01_682BaseballGame {
	
	public static void main(String[] args) {
		String[] operations = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(operations));
	}
	public static int calPoints(String[] operations) {
		 Stack<Integer> S = new Stack<>();
			
	        for (String s : operations) {
	            if (s.equals("+")) {
	                int temp1 = S.pop();
	                int temp2 = S.pop();
	                int currentScore = temp1 + temp2;
	                S.push(temp2); 
	                S.push(temp1);
	                S.push(currentScore); 
	            } else if (s.equals("D")) {
	                S.push(2 * S.peek());
	            } else if (s.equals("C")) {
	                S.pop();
	            } else {
	                S.push(Integer.parseInt(s));
	            }
	        }

	        int ans = 0;
	        for (int score : S) {
	            ans += score;
	        }
	        return ans;
	}

}

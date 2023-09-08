package QuestionOfTheDay;

import java.util.*;

public class Q05_118PascalsTriangle {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(generate(n));
	}

	static List<List<Integer>> list = new ArrayList<>();

	public static List<List<Integer>> generate(int numRows) {
//		List<List<Integer>> list = new ArrayList<>();
//		
//		List<Integer> AL1 = new ArrayList<>();
//		AL1.add(1);
//		
//		List<Integer> AL2 = new ArrayList<>();
//		AL2.add(1);
//		AL2.add(1);
//		
//		list.add(AL1);
//		list.add(AL2);

		// System.out.println(list.toString());
		List<Integer> AL1 = new ArrayList<>();
		AL1.add(1);
		list.add(AL1);
		if (numRows == 1) {
			return list;
		} else {
			solve(1, numRows);
		}

		return list;
	}

	private static void solve(int r, int numRows) {

		if (r == numRows) {
			return;
		}

		List<Integer> AL2 = new ArrayList<>();
		AL2.add(1);
		for (int i = 1; i < r; i++) {
			AL2.add(list.get(r - 1).get(i - 1) + list.get(r - 1).get(i));
		}
		AL2.add(1);

		list.add(AL2);

		solve(r + 1, numRows);

	}

}

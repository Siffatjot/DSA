package QuestionOfTheDay;

import java.util.*;

public class Q06_377CombinationSumIV {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int target = 4;
		System.out.println(combinationSum4(nums, target));
	}

	public static int combinationSum4(int[] nums, int target) {
		Integer[] dp = new Integer[target+1];
		return solve(nums, target, dp);
	}

	public static int solve(int[] nums, int target, Integer[] dp) {

		if (target <= 0) {
			if (target == 0) {
				return 1;
			}
			return 0;
		}
		
		if (dp[target] != null) {
			return dp[target];
		}
		
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans += solve(nums, target - nums[i], dp);
		}
		dp[target] = ans;

		return dp[target];
	}
}

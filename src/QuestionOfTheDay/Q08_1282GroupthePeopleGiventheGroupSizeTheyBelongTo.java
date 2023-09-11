package QuestionOfTheDay;

import java.util.*;

public class Q08_1282GroupthePeopleGiventheGroupSizeTheyBelongTo {
	public static void main(String[] args) {
		int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
		System.out.println(groupThePeople(groupSizes));
	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		HashMap<Integer, List<Integer>> HM = new HashMap<>();
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < groupSizes.length; i++) {
			if (!HM.containsKey(groupSizes[i])) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				HM.put(groupSizes[i], list);
			} else {
				HM.get(groupSizes[i]).add(i);
			}
			if (HM.get(groupSizes[i]).size() == groupSizes[i]) {
				ans.add(HM.get(groupSizes[i]));
				HM.remove(groupSizes[i]);
			}
		}
		return ans;
	}
}

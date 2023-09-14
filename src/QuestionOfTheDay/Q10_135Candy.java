package QuestionOfTheDay;

public class Q10_135Candy {
	public static void main(String[] args) {
		int[] ratings = { 1, 0, 2 };
		System.out.println(candy(ratings));
	}

//	public static int candy(int[] candies) {
//		int temp = 1; // temp me 1 lekar chalo
//
//		// since i = 1 ko hamesha 1 candy to milegi hi to hum 1 se start krte hai
//		for (int i = 1; i < candies.length; i++) {
//			// agr bada h next element to temp me 1 add krke count me daldo
//			if (candies[i] > candies[i - 1]) {
//				count = count + temp + 1;
//				temp = temp + 1;
//			} else if (candies[i] < candies[i - 1]) {
//				if (temp > 1) {
//					// agr next element chota hai aur temp 1 se bada hai tbhi -1 krke add krna hai
//					count = count + temp - 1;
//					temp = temp - 1;
//				}
//				// varna 1 hi add hoga
//				count += 1;
//			} else {
//				count += temp; // jab equal hai to 1 add hoga
//			}
//		}
//		return count;
//	}
	
	public static int candy(int[] ratings) {
		int n = ratings.length;
		int[] candies = new int[n];
		
		for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
		
		 for (int i = 1; i < n; i++) {
	            if (ratings[i] > ratings[i - 1]) {
	                candies[i] = candies[i - 1] + 1;
	            }
	        }
		 
		 int totalCandies = candies[n - 1];
		 
		 for(int i = n - 2; i >= 0; i--) {
			 if (ratings[i] > ratings[i + 1]) {
	                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
	            }
	            totalCandies += candies[i];
		 }
		return totalCandies;
	}

}

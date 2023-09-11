package QuestionOfTheDay;

public class Q07_1359CountAllValidPickupandDeliveryOptions {
	public static void main(String[] args) {
		System.out.println(countOrders(3));
	}

	public static int countOrders(int n) {
		long ans = 1;
		int mod = 1000000007;

		for (int i = 1; i <= n; i++) {
			ans = ans * (2 * i - 1) * i % mod;
		}
		return (int) ans;
	}
}

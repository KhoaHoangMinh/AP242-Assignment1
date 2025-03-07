public class Utility {

	/**
	 * Test whether a specific number is a prime number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a prime number.
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Test whether a specific number is a square number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a square number.
	 */
	public static boolean isSquare(int num) {
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}

	public static boolean isFibo(int n) {
		if(n < 0) return false;
		if(n == 0 || n == 1) return true;
		int a = 0, b = 1;
		while(b < n) {
			int temp = b;
			b += a;
			a = temp;
		}
		return b == n;
	}
	public static int findFiboIndex(int n) {
		if(n < 0) return -1;
		if(n == 0) return 0;
		if(n == 1) return 1;
		int a = 0, b = 1, idx = 1;
		while(b < n) {
			int temp = b;
			b += a;
			a = temp;
			idx++;
		}
		return (b == n) ? idx : -1;
	}
	public static double checkCombatScore(double n) {
		if(n > 999) return 999;
		else return n;
	}
}

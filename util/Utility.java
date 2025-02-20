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
		return isSquare(5 * n * n + 4)
				|| isSquare(5 * n * n - 4);
	}
	public static int findFiboIndex(int n) {
		double fibo = 2.078087 * Math.log(n) + 1.672276;
		return (int) Math.round(fibo);
	}
}

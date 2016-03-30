public class SecondHighest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 5, 8, 7, 6, 2, 1, 8, 4, 3 };
		int firstHighest = Integer.MIN_VALUE + 1;
		int secondHighest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (firstHighest < a[i]) {
				secondHighest = firstHighest;
				firstHighest = a[i];
			} else if (secondHighest < a[i] && a[i] != firstHighest) {
				secondHighest = a[i];
			}
		}
		System.out.println(firstHighest + " " + secondHighest);
	}

}

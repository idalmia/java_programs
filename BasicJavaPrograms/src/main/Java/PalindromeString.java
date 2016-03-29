
public class PalindromeString {
	static boolean isPalindrome(String s) {
		int l = s.length();
		if (l == 0 || l == 1) {
			return true;
		} else if (s.charAt(0) == s.charAt(l - 1)) {
			return isPalindrome(s.substring(1, l - 1));

		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("ABCBA"));
		int n = 12321;
		Integer no = n;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);

		System.out.println(isPalindrome(no.toString()));
	}
}

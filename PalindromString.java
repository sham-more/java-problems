
public class PalindromString {
	public static void main(String[] args) {
		System.out.println("+++ String Palindrom Program +++");

		String Result = Palindrom();

		System.out.println(Result);
	}

	public static String Palindrom() {

		String str = "ababab";
		int left = 0;
		int right = str.length() - 1;

		boolean isPalindrom = true;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				isPalindrom = false;
				break;

			}
			left++;
			right--;
		}

		if (isPalindrom) {
			return "String is palindrom";
		} else {
			return "String is not palindrom";
		}

	}
}

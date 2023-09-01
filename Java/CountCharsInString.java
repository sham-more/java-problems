
public class CountCharsInString {
	public static void main(String[] args) {
		System.out.println("===Count Number of chars in string program===");
		int result = countChar();
		System.out.println(result);
	}

	public static int countChar() {
		String str = "Learn Code";
		int Count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {

				Count++;
			}
		}

		return Count;

	}
}

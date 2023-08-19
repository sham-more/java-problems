
public class CountRepeatedNum {
	public static void main(String[] args) {

		// remainder
		// cheack condition
		// increase
		// remove last digit

		System.out.println("====Count Repeat====");
		int Result = countRepeat();
		System.out.println(Result);
	}

	public static int countRepeat() {
		int num = 121121;

		int count = 0;

		while (num > 0) {

			int rem = num % 10;

			if (rem == 1) {
				count++;
			}

			num = num / 10;

		}

		return count;

	}

}


public class NumIsPalindrom {
    public static void main(String[] args) {
        System.out.println("===Palindrom Number Program===");
        String result = isNumPalindrome();
        System.out.println(result);
    }

    public static String isNumPalindrome() {
        int num = 121;
        int originalNum = num; // Store the original value of num
        int reversedNum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            reversedNum = rem + reversedNum * 10;
        }

        if (originalNum == reversedNum) {
            return "num is palindrome";
        } else {
            return "num is not palindrome";
        }
    }
}

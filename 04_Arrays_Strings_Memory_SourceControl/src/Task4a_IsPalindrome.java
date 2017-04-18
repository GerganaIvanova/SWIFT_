package homework_java3;

import java.util.Scanner;

public class Task4a_IsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }

}

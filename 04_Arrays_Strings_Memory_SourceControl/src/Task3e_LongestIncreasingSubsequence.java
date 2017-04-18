package homework_java3;

import java.util.Scanner;

public class Task3e_LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] number = new int[count];
        for (int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        }
        int startIndex = 0;
        int endIndex = 0;
        int increasingCount = 0;
        int currentIncreasingCount = 0;
        
        for (int k = 0; k < number.length; k++) {
            if (k > 0 && number[k] > number[k - 1]) {
                currentIncreasingCount = currentIncreasingCount + 1;
                if (currentIncreasingCount >= increasingCount) {
                    increasingCount = increasingCount + 1;
                    startIndex = k - increasingCount;
                    endIndex = k;
                }
            } else {
                currentIncreasingCount = 0;
            }
        }
        
        for (int j = startIndex; j <= endIndex; j++) {
            System.out.print(number[j] + " ");
        }
    }
}

package homework_java3;

import java.util.Scanner;
import java.util.Arrays;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] number = new int[count];
        for (int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + ",");
        }
    }
}

package homework_java3;

import java.util.Scanner;

public class Task1c_ReadArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i] + ",");
        }
    }

}

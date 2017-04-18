package Task1_Methods;

import java.util.Scanner;

public class Task1c_IndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        indexOf(x, arr);
    }

    public static void indexOf(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.printf("Index of elemetn is %d", i);
            }
        }
    }
}

package homework_java3;

import java.util.Scanner;

public class Task2a_PrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        int index = 1;

        for (int i = 0; i < column; i++) {
            for (int b = 0; b < row; b++) {
                arr[i][b] = index;
                index +=column;
                System.out.printf("%3d", arr[i][b]);
            }
            index = 2 + i;
            System.out.println();
        }
    }
}

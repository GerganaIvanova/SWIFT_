package homework_java3;

public class Task1e_Print2dArray {

    public static void main(String[] args) {
        int row = 4;
        int column = 4;
        int[][] arr = new int[row][column];
        int index = 1;

        for (int i = 0; i < row; i++) {
            for (int b = 0; b < column; b++) {
                arr[i][b] = index;
                index++;
                System.out.printf("%3d", arr[i][b]);
            }
            System.out.println();
        }
    }
}

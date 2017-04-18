package homework_java3;

import java.util.Scanner;

public class Task3a_PrintLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] number = new int [count];
        int max_number = 0;
        for (int i = 0; i<count; i++) {
          number[i] = sc.nextInt();
        }
        for (int j = 0; j < number.length; j++){
            if(number[j] > max_number){
                max_number = number[j];
            }
        }
        System.out.println(max_number);
    }
}

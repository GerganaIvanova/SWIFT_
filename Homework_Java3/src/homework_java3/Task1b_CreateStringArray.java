package homework_java3;

import java.util.Scanner;

public class Task1b_CreateStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(",");
        for (int i = 0; i<split.length; i++){
            System.out.println(split[i].trim());
        }
    }
}

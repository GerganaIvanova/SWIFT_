
package Task1_Methods;

import java.util.Scanner;

public class Task1b_AreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second nuber : ");
        int y = sc.nextInt();
        System.out.println(areEqual(x, y));
    }

    public static boolean areEqual(int x, int y) {
        boolean isEqual = false;
        if(x == y){
            isEqual = true;
        }
        return isEqual;
    }
}

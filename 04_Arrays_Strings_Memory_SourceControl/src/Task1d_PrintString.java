
package homework_java3;

import java.util.Scanner;

public class Task1d_PrintString {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String symbols = sc.nextLine();
         for(int i = 0; i<symbols.length(); i++){
             System.out.println(symbols.charAt(i));
         }
     }
    
}
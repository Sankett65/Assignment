package assignment.day_5;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n >= 0 && n < 31) {
            for (int i = 0; i <= n; i++) {
                int sum = (int) Math.pow(2, i);
                System.out.println(sum);
            }
        }else {
            System.out.println("Invalid number");
        }
    }
}
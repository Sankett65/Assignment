package assignment.day_5;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        double sum=0;
        for (double i = n; i !=0; i--) {
            sum = sum + (double)(1/i);
            System.out.println(sum);
        }
    }
}

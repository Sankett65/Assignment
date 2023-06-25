package assignment.day_5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        if (n%2==0){
            System.out.println("Entered number is Even Number");
        }else {
            System.out.println("Entered number is Odd Number");
        }
    }
}

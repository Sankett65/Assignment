package assignment.day_5;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n=sc.nextInt();
        if (n%4==0){
            System.out.println("It is a leap yaer");
        }else {
            System.out.println("It is not a leap year");
        }
    }
}

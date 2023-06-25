package assignment.day_5;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number ");
        int a=sc.nextInt();
        System.out.print("Enter Second number ");
        int b=sc.nextInt();
        System.out.print("Enter Third number ");
        int c=sc.nextInt();
        if (a>b && a>c){
            System.out.println("The first number is largest: "+a );
        }else if (b>a && b>c){
            System.out.println("The second number is largest: "+b);
        }else {

            System.out.println("The third number is largest");
        }
    }
}

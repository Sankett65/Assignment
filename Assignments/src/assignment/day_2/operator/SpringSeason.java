package assignment.day_2.operator;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
//        2. Write a program SpringSeason.java that takes two int values m and d from the
//        command line and prints true if day d of month m is between
//        March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter the day: ");
        int d = sc.nextInt();
        boolean c = (m==3 && d>=20) || (m==4 && d>0 && d<=31) || (m==5 && d>0 && d<=31) || (m==6 && d<=20);
        System.out.println(c);
    }
}

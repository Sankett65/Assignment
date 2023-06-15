package assignment.day_1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int a = sc.nextInt();
        if (a>=1582){
            if (a%4==0 && a%100 !=0 ||a%400==0){
                System.out.println("Year is a leap year");
            }
            else {
                System.out.println("Year is not a leap year");
            }
        }
        else {
            System.out.println("Not a valid year");
        }
    }
}

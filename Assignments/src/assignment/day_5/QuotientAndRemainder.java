package assignment.day_5;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Devidend ");
        int devidend=sc.nextInt();
        System.out.print("Enter Divisor ");
        int divisor=sc.nextInt();
        int Quotient=devidend/divisor;
        int remainder =devidend%divisor;
        System.out.println("Quotient: "+Quotient);
        System.out.println("Ramiander: "+remainder);
    }
}

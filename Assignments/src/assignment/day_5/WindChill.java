package assignment.day_5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for t: ");
        double t=sc.nextInt();
        System.out.print("Enter the value for v: ");
        double v=sc.nextInt();
        double w =35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        System.out.println(w);
    }
}

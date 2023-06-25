package assignment.day_5;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int count=0;
        int count1=0;
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = r.nextInt(2);
            if (a==0){
             //   System.out.println("It`s head");
                count++;
            }else {
              //  System.out.println("It`s tails");
                count1++;
            }


        }
        System.out.println(count+ "\n"+count1);
        double x=(count*100)/n;
        double y= (count1*100)/n;
        System.out.println("Percentage of heads is: "+x);
        System.out.println("Percentage of tails is: "+y);
    }
}

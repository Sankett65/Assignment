package assignment.day_5;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number ");
        int n =sc.nextInt();
          while(n%2==0){
              System.out.println(2);
              n=n/2;
          }
        for (int i=3;i<=n;i++){
            while (n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }

    }
}

package assignment.day_5;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character ");
        char n = sc.nextLine().charAt(0);

        switch (n){
            case 'a':
                System.out.println("It is an Vowel");
                break;
            case 'e':
                System.out.println("It is an Vowel");
                break;
            case 'i':
                System.out.println("It is an Vowel");
                break;
            case 'o':
                System.out.println("It is an Vowel");
                break;
            case 'u':
                System.out.println("It is an Vowel");
                break;
            default:
                System.out.println("It is  not an Vowel");
        }
    }
}

package assignment.day_1;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Name: ");
        String name = sc.nextLine();
        System.out.println("Your Name is : " + name);
    }
}

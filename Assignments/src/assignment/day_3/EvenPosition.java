package assignment.day_3;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int i = 0;
        int a = arr[i];
        for (i = 1; i < n; i=i+2) {
                System.out.println(arr[i]);
        }
    }
}
package assignment.day_3;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5,6,2,8,9,10};
        int max = arr[0];
        int max2=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max=arr[i];
            }

        }
        for (int i = 1; i < arr.length-1; i++) {

            if (arr[i] > max2) {
                max2=arr[i];
            }

        }
        System.out.println(max2);

    }
}

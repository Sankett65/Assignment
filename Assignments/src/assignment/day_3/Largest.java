package assignment.day_3;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5,6,2,8,9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max=arr[i];
                }

            }
        System.out.println(max);

        }
    }



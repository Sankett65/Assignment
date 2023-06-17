package assignment.day_3;

public class Smallest {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
        int small=arr[0];
        for (int i = 0;i< arr.length;i++){
            if (arr[i] < small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}

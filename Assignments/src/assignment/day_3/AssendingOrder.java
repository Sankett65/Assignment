package assignment.day_3;

public class AssendingOrder {
    public static void main(String[] args) {
       int [] arr = {5,3,1,4,2};
       for ( int i =0;i< arr.length-1;i++){
           if (arr[i+1]>arr[i]){
               int temp=arr[i];
               arr[i]= arr[i+1];
               arr[i+1]=temp;
           }

       }
       for (int i= arr.length-1;i>=0;i--){
           System.out.println(arr[i]);
       }
        }
    }


package assignment.day_3;

public class Frequency {
    public static void main(String[] args) {
        int [] arr= {1,2,2,3,3,3,4,5,5,4,2,2};
        boolean [] frequency = new boolean[arr.length];
        for (int i =0;i< arr.length;i++){
            if (frequency[i] == true)
                continue;
            int count=1;
            for (int j = i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    frequency[j] = true;
                    count++;
                }
              //  System.out.println(arr[j]);
            }
            System.out.println(arr[i]+ " " +count);
        }
    }
}

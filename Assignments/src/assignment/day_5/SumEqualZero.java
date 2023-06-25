package assignment.day_5;

public class SumEqualZero {
    public static void main(String[] args) {
        int [] arr={ 5, -2, 1, 0, 1};
        for (int i=0;i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                for (int k=i+2;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}

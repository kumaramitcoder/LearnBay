package arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length+1;
        int res = missing(arr, n);
        System.out.println(res);
    }
    public static int missing(int[] arr, int n){
       int total = n*(n+1)/2;
       int sum = 0;
       for (int nn: arr){
           sum = sum+nn;
       }
       return total-sum;
    }
}

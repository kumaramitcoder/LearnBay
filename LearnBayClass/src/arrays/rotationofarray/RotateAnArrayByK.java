package arrays.rotationofarray;

public class RotateAnArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;
        for (int n :arr){
            System.out.print(n+" ");
        }
        System.out.println();
        rotate(arr, k);
        for (int n :arr){
            System.out.print(n+" ");
        }
    }

    public static void rightShiftByOne(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        System.out.print("last = "+last+" ");
        System.out.println();
        for (int i=n-1;i>0;i--){
            arr[i] =arr[i-1];
        }
        arr[0] = last;
    }
    public static void rotate(int[] arr, int k){
        while(k>0){
            rightShiftByOne(arr);
            k--;
        }
    }
}

package arrays.rotationofarray;


public class ArrayRotationByKLeftRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int n = arr.length;
        k = k%n;
        arayrotationright(arr, 0, k-1);
        arayrotationright(arr, k, n-1);
        arayrotationright(arr, 0, n-1);
        for (int nn : arr){
            System.out.print(nn+" ");;
        }
    }

    public static void arayrotationright(int[] arr, int left, int right){
        while (left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}

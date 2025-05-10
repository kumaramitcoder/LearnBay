package arrays.rotationofarray;

public class ArrayRotationByKRightRotation {
    public static void main(String[] args) {
        System.out.println("array rotation by k position right rotation");
        // Using (Partinoning) 1) Partition the array by kth position 2) reverse the both part seperatly  3)re-reverse the entire array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k =3;
        int start = 0;
        int n = arr.length;
        k = k%n;
        arrayrotation(arr, 0, n-k-1);
        arrayrotation(arr, n-k, n-1);
        arrayrotation(arr, 0, n-1);
        for (int nn : arr){
            System.out.print(nn + " ");
        }
    }

    public static void arrayrotation(int[] arr, int start, int end){
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

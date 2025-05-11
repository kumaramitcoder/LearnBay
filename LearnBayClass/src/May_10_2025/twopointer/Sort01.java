package May_10_2025.twopointer;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,0};
       /* sortZeroOne(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }*/
        sortzeroonelast(arr);
        for (int i:arr){
            System.out.print(i +" ");
        }
    }

    public static void sortZeroOne(int[] arr){
        int left = 0, right = 0;
        while (right<arr.length){
            if (arr[right]==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void sortzeroonelast(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left]==0){
                left++;
            } else if (arr[right]==1){
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void sortt01(int[] arr){
        int i =0; int j =0; int n = arr.length;
        while (i<j){
            if (arr[i]==1){
                j++;
            }
            else {
                int temp = arr[j];
                rightShift(arr, i, j);
                arr[i] = temp;
                i++;
                j++;
            }
        }
    }

    public static void rightShift(int[] arr, int start, int end){
        for (int curr = end; curr > start; curr--){
            arr[curr] = arr[curr-1];
        }
    }
}

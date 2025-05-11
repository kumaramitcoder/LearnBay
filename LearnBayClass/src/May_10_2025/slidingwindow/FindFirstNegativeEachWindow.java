package May_10_2025.slidingwindow;

public class FindFirstNegativeEachWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,4,-2,-8,5,7,9,-10};
        firstNegativeEachWindow(arr, 4);

    }
    public static int  firstNegative(int[] arr, int curr){
        int idx = -1;
        int n = arr.length;
        while (curr<n){
            if (arr[curr]<0){
                idx = curr;
                break;
            }
            curr++;
        }
        return idx;
    }
    public static void firstNegativeEachWindow(int[] arr, int k){
        int idx = firstNegative(arr, 0);
        int st = 0; int end = k-1;
        int n = arr.length-1;
        while (end<n){
            if (st<=idx){
                System.out.print(arr[idx]+" ");
            } else {
                System.out.print(0+" ");
            }
            st++;
            end++;
            if (idx<st){
                idx = firstNegative(arr, st);
            }
        }
    }

}

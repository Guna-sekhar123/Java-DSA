package dsa;

public class recursion{
    public static void main(String[] args) {

    }
    // Binary search using Recursion.
    static int binarysearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target){
            return binarysearch(arr, target, s, m-1);
        }
        return binarysearch(arr, target, m+1, e);
    }
}
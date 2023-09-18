package dsa;

public class binarySearch{
    public int bs(int[] arr, int target){
        int s= arr[0];
        int e = arr.length-1;
        while (s <= e){
            int m = s + (e-s)/2;
            if(target < arr[m]){
                e = m-1;
            }
            else-if(target > arr[m]){
                s = m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
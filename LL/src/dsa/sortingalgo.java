package dsa;

public class sortingalgo{
    public static void main(String[] args) {

    }
    //bubble sort
    static int[] bubblesort(int[] arr){
        int s = arr.length;
        boolean swapped = false;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if(arr[j] < arr[j+1]){
                    swap(arr, j ,j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    //insertion sort
    static int[] insertionsort(int[] arr){
        int s = arr.length;
        for (int i = 0; i < s-1; i++) {
            for (int j = i+1; j >0 ; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
            
        }
        return arr;
    }
    static int[] selectivesort(int[] arr){
        //It generally set the elements in the array according to a particular pattern/selection
        // like setting the largest element first etc..
    }

    // Cyclic sort
    static int[] cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(a[i]!=arr[correct]){
                swap(a,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                return new [] {j+1};
            }
        }
        return new [] {-1};
    }
    // Swapping two elements in an given array with given indices.
    public void swap(int[]arr,int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
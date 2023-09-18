package dsa;
import java.utils.*;
// These problems helps to visualise the concepts
// p1 - lowest successive number, p2 - preceeding greatest number, p3 - first and last occurance of a target
// p4 - fibanocci number

public class Problems{
    public static void main(String[] args) {
        //problem variables for ceilp and floorp problem.
        int[] a1 = {1,2,3,4,5,6,7,8,9};
        int[][] a2 = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 8;
    }

    // Problem-1:- Find the lowest successive number(Ceiling number) for the given target number. Algo:- Binary Search.
    static int ceilp(int[] arr, int target){
        int s = 0;
        int l = arr.length-1;
        while(s <= l){
            int m = s+(e-s)/2;
            if(target > arr[m]){
                s = m+1;
            } else if (target < arr[m]) {
                e = m-1;
            }
            else{
                return m;
            }
        }
        return s;
    }

    //Problem-2:- Find the preceeding greatest number(flooring number) for the given target. Algo:- Binary Search.
    static int floorp(int[] arr, int target){
        int s = 0;
        int l = arr.length-1;
        while(s <=l){
            int m = s+(e-s)/2;
            if(target < arr[m]){
                e = m-1;
            }
            else if(target > arr[m]){
                s = m+1;
            }
            else {
                return m;
            }
        }
        return e;
    }

    //Problem-3:- Find the first and last occurence of a target in a given array. Algo :- Binary search*2(i.e for the firs and last)
    static int flo(int[] arr, int target){
        int[] nf = {-1,-1};
        int starting = search(arr, target, true);
        int ending = search(arr, target,false);
        nf[0] = starting;
        nf[1] = ending;
        return nf;
    }
    int search(int[] arr, int target, boolean fs){
        int ans = -1;
        int s = 0;
        int l = arr.length-1;
        while(s <= l){
            int m = s+(e-s)/2;
            if(target < arr[m]){
                e = m-1;
            }
            else if(target > arr[m]){
                s = m+1;
            }
            else{
                ans = m;
                if(fs){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
        }
        return ans;
    }
    //Problem-4:- Find the fibanocci number.
    static int fib(int n) {
        if (n < 2) { f
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    // fib number optimized
    static long optfib(long n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    // Problem-5:- find the number whether it is prime or not?
    static boolean p(long n){
        return n & 1;
    }
    // Problem-6:- Find the unique element in the array.
    static int unq(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
    // Problem-7:- Find the ith bit of given number
    static int bit(long n, int b){
        return (n & (1 << (b-1))); // in this problem we are masking the binary number of the given number with mask to get the ans
        // here n is the number and b is the bit.
    }
}
package Recursion;

import java.util.Collections;

import static java.util.Collections.swap;

public class MissingNumUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        MissingNumUsingCyclicSort obj = new MissingNumUsingCyclicSort();
        System.out.println(obj.missingNum(arr));
    }
        int missingNum(int arr[]) {
            // code here
            int n = 1+arr.length;
            int i = 0;
            while(i<arr.length){
                if (arr[i] == i+1 || arr[i] == n) i++;
                else {
                    int idx = arr[i] - 1;
                    swap(arr, i, idx);

                }

            }
            for(i = 0; i<arr.length; i++){
                if(arr[i] != i+1) return i+1;

            }
            return n;
        }
        private void swap (int[] arr, int i, int idx) {
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }


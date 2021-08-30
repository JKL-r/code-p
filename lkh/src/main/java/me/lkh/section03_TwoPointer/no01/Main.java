package me.lkh.section03_TwoPointer.no01;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr1, m, arr2));
    }

    private static String solution(int n, int[] arr1, int m, int[] arr2){

        int idx1 = 0, idx2 = 0;
        StringBuilder result = new StringBuilder();
        while(idx1 < n || idx2 < m){
            if(idx1 >= n){
                result.append(arr2[idx2++]).append(" ");
            }
            else if(idx2 >= m){
                result.append(arr1[idx1++]).append(" ");
            }
            else{
                if(arr1[idx1] < arr2[idx2]){
                    result.append(arr1[idx1++]).append(" ");
                }
                else if (arr1[idx1] > arr2[idx2]){
                    result.append(arr2[idx2++]).append(" ");
                }
                else{
                    result.append(arr1[idx1++]).append(" ").append(arr2[idx2++]).append(" ");
                }
            }
        }
        return result.toString();
    }
}

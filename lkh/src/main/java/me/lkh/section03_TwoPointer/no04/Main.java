package me.lkh.section03_TwoPointer.no04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n,int m, int[] arr){

        int lt = 0, sum = 0, result = 0;
        for(int rt = 0; rt < n; rt++) {

            sum += arr[rt];
            if(sum == m)
                result ++;

            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m)
                    result ++;
            }
        }
        return result;
    }
}

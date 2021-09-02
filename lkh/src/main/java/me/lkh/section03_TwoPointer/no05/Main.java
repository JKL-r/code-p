package me.lkh.section03_TwoPointer.no05;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n){

        int result = 0, lt = 0, sum = 0, maxNum = (n / 2) + 1;

        int[] arr = new int[maxNum];
        for(int i = 0; i < maxNum; i++){
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < maxNum; rt++){
            sum += arr[rt];
            if(sum == n){
                result ++;
            }
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) {
                    result++;
                }
            }
        }

        return result;
    }
}

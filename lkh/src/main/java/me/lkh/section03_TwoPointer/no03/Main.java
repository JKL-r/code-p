package me.lkh.section03_TwoPointer.no03;

import java.util.*;

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

        int result = 0;
        int sum = 0;
        int lt = 0;
        int rt = 0;
        while(sum < m){
            sum += arr[rt++];
        }

        while(lt < n){
            if(sum == m){
                result += 1;
                sum += arr[rt];
                if(rt < n - 1)
                    rt++;
            }
            else if(sum > m){
                sum -= arr[lt];
                lt++;
            }
            else{
                if(rt < n - 1)
                    rt++;
                sum += arr[rt];
            }
        }
        return result;
    }
}

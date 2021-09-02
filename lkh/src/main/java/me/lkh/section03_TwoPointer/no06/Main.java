package me.lkh.section03_TwoPointer.no06;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, nums));
    }

    private static int solution(int n, int k, int[] nums){

        int result = 0, zCnt = 0, lt = 0, len = 0;

        for(int rt = 0; rt < n; rt++){
            if(nums[rt] == 0){
                zCnt++;
            }

            while(zCnt > k){
                if(nums[lt] == 0){
                    zCnt--;
                }
                lt++;
            }
            result = Math.max(rt - lt + 1, result);
        }

        return result;
    }
}

package me.lkh.section06_Sort.no08;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, nums));
    }
    private static int solution(int n, int m, int[] nums) {
        Arrays.sort(nums);
        int lt = 0, rt = n - 1;

        while(lt <= rt){
            int pi = (lt + rt) / 2;
            if(nums[pi] == m){
                return pi + 1;
            }
            else if(nums[pi] > m){
                rt = pi - 1;
            }
            else{
                lt = pi + 1;
            }
        }

        return -1;
    }

}

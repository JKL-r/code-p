package me.lkh.section06_Sort.no05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, nums));
    }
    private static String solution(int n, int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i+1])
                return "D";
        }
        return "U";
    }

}

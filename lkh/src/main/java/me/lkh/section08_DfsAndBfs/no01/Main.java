package me.lkh.section08_DfsAndBfs.no01;

import java.util.*;

public class Main {

    static int n, sum = 0;
    static int[] nums;
    static String result = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        solution(0, 0);
        System.out.println(result);
    }

    private static void solution(int idx, int s) {
        if("YES".equals(result) || idx >= n || s > sum - s)
            return ;
        else{
            if(sum - s == s) {
                result = "YES";
                return ;
            }
            solution(idx + 1, s + nums[idx]);
            solution(idx + 1, s);
        }
    }

}

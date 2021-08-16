package me.lkh.section02_Array.no05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n){
        boolean[] result = new boolean[n + 1];
        Arrays.fill(result, true);

        int res = 0;
        for (int i = 2; i < n + 1; i++) {
            if (result[i]) {
                res ++;
                int idx = i * 2;
                while (idx <= n) {
                    result[idx] = false;
                    idx += i;
                }
            }
        }
        return res;
    }
}

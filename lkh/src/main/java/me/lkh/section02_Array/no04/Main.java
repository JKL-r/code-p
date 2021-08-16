package me.lkh.section02_Array.no04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static String solution(int n){
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            if(i == 0 || i == 1)
                result[i] = 1;
            else
                result[i] = result[i - 1] + result[i -2];
        }

        StringBuilder sb = new StringBuilder();
        for(int num : result){
            sb.append(num + " ");
        }
        return sb.toString().trim();
    }
}

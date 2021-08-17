package me.lkh.section02_Array.no08;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }

        System.out.println(solution(n, scores));
    }

    private static String solution(int n, int[] scores){
        int[] results = new int[n];
        Arrays.fill(results, 1);

        for(int i = 0; i < n; i++){
            int curScore = scores[i];
            for(int score2: scores){
                if(curScore < score2)
                    results[i]++;
            }
        }

        StringBuilder result = new StringBuilder();

        for(int rank : results){
            result.append(rank).append(" ");
        }

        return result.toString();
    }
}

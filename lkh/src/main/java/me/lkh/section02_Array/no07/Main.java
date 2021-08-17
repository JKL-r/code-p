package me.lkh.section02_Array.no07;

import java.util.Arrays;
import java.util.Scanner;

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

    private static int solution(int n, int[] scores){
        int result = 0;
        int curScore = 0;

        for(int score : scores){
            if(score == 1){
                result += ++curScore;
            }
            else{
                curScore = 0;
            }
        }

        return result;
    }
}

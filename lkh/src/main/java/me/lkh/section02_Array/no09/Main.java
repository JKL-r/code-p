package me.lkh.section02_Array.no09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] numbers = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, numbers));
    }

    private static int solution(int n, int[][] numbers){
        int result = 0;

        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++){
            int sumVer = 0, sumHor = 0;

            for(int j = 0; j < n; j++){
                sumHor += numbers[i][j];
                sumVer += numbers[j][i];
            }

            int tmpMax = Math.max(sumHor, sumVer);
            result = Math.max(result, tmpMax);

            sum1 += numbers[i][i];
            sum2 += numbers[i][n-i-1];
        }

        int tmpMax = Math.max(sum1, sum2);
        result = Math.max(result, tmpMax);
        return result;
    }
}

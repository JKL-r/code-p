package me.lkh.section02_Array.no02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }

        System.out.println(solution(heights));
    }

    private static int solution(int[] heights){
        int maxHeight = heights[0];
        int result = 1;
        for(int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                result++;
                maxHeight = heights[i];
            }
        }
        return result;
    }
}

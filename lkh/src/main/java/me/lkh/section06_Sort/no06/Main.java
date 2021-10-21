package me.lkh.section06_Sort.no06;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(solution(n, heights));
    }
    private static String solution(int n, int[] heights) {
        int[] copyOfHeights = heights.clone();
        Arrays.sort(copyOfHeights);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(copyOfHeights[i] != heights[i]){
                sb.append(i + 1).append(" ");
            }
        }
        return sb.toString();
    }

}

package me.lkh.section07_Recursive_Tree_Graph.no04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibo = new int[n + 1];
        dfs(n);
        for(int i  = 1; i < fibo.length; i++){
            System.out.print(fibo[i] + " ");
        }
    }

    private static int dfs(int n) {
        if(fibo[n] > 0){
            return fibo[n];
        }
        if(n == 1 || n == 2){
            return fibo[n] = 1;
        }
        else{
            return fibo[n] = dfs(n - 2) + dfs(n - 1);
        }
    }

}

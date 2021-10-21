package me.lkh.section07_Recursive_Tree_Graph.no03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(dfs(n));
    }

    private static int dfs(int n) {
        if(n == 1)
            return 1;
        else
            return dfs(n - 1) * n;
    }

}

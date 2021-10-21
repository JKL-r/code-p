package me.lkh.section07_Recursive_Tree_Graph.no12;

import java.util.*;

public class Main {

    static boolean[] chk;
    static int[][] graph;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        chk = new boolean[n + 1];
        graph = new int[n + 1][n + 1];
        for(int i = 0; i < m; i++){
            int s = sc.nextInt(), e = sc.nextInt();
            graph[s][e] = 1;
        }
        chk[1] = true;
        dfs(1, n);
        System.out.println(result);
    }
    private static void dfs(int node, int n){
        if(node == n){
            result++;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if(graph[node][i] == 1 && !chk[i]){
                    chk[i] = true;
                    dfs(i, n);
                    chk[i] = false;
                }
            }
        }
    }
}

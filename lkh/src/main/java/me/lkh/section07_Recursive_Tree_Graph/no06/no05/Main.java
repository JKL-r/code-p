package me.lkh.section07_Recursive_Tree_Graph.no06.no05;

import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        dfs(1, stack);
    }

    private static void dfs(int idx, Stack<Integer> stack){
        if(idx == n + 1){
            StringBuilder result = new StringBuilder();
            for(int e: stack){
                result.append(e).append(" ");
            }
            System.out.println(result);
        }
        else {
            stack.push(idx);
            dfs(idx + 1, stack);
            stack.pop();
            dfs(idx + 1, stack);
        }
    }

}

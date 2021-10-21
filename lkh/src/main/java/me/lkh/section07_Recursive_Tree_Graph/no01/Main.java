package me.lkh.section07_Recursive_Tree_Graph.no01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        if(n > 1)
            solution(n - 1);

        System.out.print(n + " ");
    }

}

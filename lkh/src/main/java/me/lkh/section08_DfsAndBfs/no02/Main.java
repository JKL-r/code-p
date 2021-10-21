package me.lkh.section08_DfsAndBfs.no02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dfs(n);
    }

    private static void dfs(int n) {
        if(n == 1){
            System.out.print(1);
        }
        else{
            dfs(n / 2);
            System.out.print(n % 2);
        }
    }

}

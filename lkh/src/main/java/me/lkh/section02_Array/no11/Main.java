package me.lkh.section02_Array.no11;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] ranks = new int[m][n];

        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                ranks[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, m, ranks));
    }

    private static int solution(int n, int m, int[][] ranks){
        int result = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(ranks[k][s] == i)
                            pi = s;
                        if(ranks[k][s] == j)
                            pj = s;
                    }

                    if(pi < pj)
                        cnt++;
                }
                if(cnt == m)
                    result++;
            }
        }


        return result;
    }
}

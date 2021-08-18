package me.lkh.section02_Array.no10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] numbers = new int[n][n];

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, numbers));
    }

    private static int solution(int n, int[][] numbers){
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int result = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean isTop = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (0 <= nx && nx < n && 0 <= ny && ny < n && numbers[nx][ny] >= numbers[i][j]) {
                        isTop = false;
                        break;
                    }
                }
                if(isTop)
                    result ++;
            }
        }

        return result;
    }
}

package me.lkh.section05_stackQueue.no03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][]board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, board, moves));
    }

    private static int solution(int n, int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int originMove : moves){
            int move = originMove - 1;
            for(int i = 0; i < n; i++){
                if(board[i][move] != 0){
                    int doll = board[i][move];
                    board[i][move] = 0;
                    if(!stack.isEmpty() && (stack.peek() == doll)){
                        stack.pop();
                        result += 2;
                    }
                    else{
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        return result;
    }

}

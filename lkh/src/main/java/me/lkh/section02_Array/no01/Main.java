package me.lkh.section02_Array.no01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        System.out.println(solution(n, str));
    }

    private static String solution(int n, String str){
        String[] numbers = str.split(" ");

        StringBuilder sb = new StringBuilder(numbers[0]);
        for(int i = 1; i < n; i++){
            int prev = Integer.parseInt(numbers[i - 1]);
            int curr = Integer.parseInt(numbers[i]);

            if(prev < curr){
                sb.append(" " + curr);
            }
        }

        return sb.toString();
    }
}

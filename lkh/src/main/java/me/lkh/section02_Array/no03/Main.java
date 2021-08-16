package me.lkh.section02_Array.no03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n;i++){
            b[i] = sc.nextInt();
        }

        System.out.println(solution(n, a, b));
    }

    private static String solution(int n, int[] a, int[] b){
        String result = "";

        for(int i = 0; i < n; i++){
            if(a[i] == b[i])
                result += "D\n";
            else if(   (a[i] == 1 && b[i] == 3)
                    || (a[i] == 2 && b[i] == 1)
                    || (a[i] == 3 && b[i] == 2))
                result += "A\n";
            else
                result += "B\n";
        }

        return result;
    }
}

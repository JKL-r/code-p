package me.lkh.section1_String.no7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);

        if (str.equalsIgnoreCase(sb.reverse().toString())) {
            return "YES";
        }
        else{
            return "NO";
        }
    }

}

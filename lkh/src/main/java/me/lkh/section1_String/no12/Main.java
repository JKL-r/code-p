package me.lkh.section1_String.no12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        String str = in.next();

        System.out.println(solution(t, str));
    }

    private static String solution(int t, String s) {
        StringBuilder result = new StringBuilder();
        s = s.replace('#', '1').replace('*', '0');
        for(int i = 0; i < t; i++){
            result.append((char) Integer.parseInt(s.substring(7 * i, 7 * (i + 1)), 2));
        }
        return result.toString();
    }

}

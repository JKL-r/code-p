package me.lkh.section01_String.no8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return "YES";
        }
        else{
            return "NO";
        }
    }

}

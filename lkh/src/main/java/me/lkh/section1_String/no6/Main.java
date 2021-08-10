package me.lkh.section1_String.no6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}

package me.lkh.section1_String.no3;

import java.util.*;

public class Main {
    private static String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len=x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(solution(str));
    }
}
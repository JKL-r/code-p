package me.lkh.section1_String.no2;

import java.util.*;

public class Main {
    private static String solution(String str){
        StringBuilder answer= new StringBuilder();
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))
                answer.append(Character.toUpperCase(x));
            else
                answer.append(Character.toLowerCase(x));
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }
}
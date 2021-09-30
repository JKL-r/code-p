package me.lkh.section05_stackQueue.no01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String g = sc.nextLine();
        System.out.println(solution(g));
    }

    private static String solution(String g) {
        Stack<Boolean> s = new Stack<>();

        for(char c : g.toCharArray()){
            if(c == '('){
                s.push(true);
            }
            else if(c == ')'){
                if(s.isEmpty())
                    return "NO";
                s.pop();
            }
        }
        if(s.isEmpty())
            return "YES";

        return "NO";
    }

}

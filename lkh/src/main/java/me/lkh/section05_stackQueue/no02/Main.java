package me.lkh.section05_stackQueue.no02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String g = sc.nextLine();
        System.out.println(solution(g));
    }

    private static String solution(String g) {
       StringBuilder sb = new StringBuilder();

       Stack<Character> s = new Stack<>();

       for(char c : g.toCharArray()){
           if(c == '('){
               s.push(c);
           }
           else if (c == ')') {
               s.pop();
           }
           else{
               if(s.isEmpty())
                   sb.append(c);
           }
       }
       return sb.toString();
    }

}

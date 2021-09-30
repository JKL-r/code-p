package me.lkh.section05_stackQueue.no07;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String es = sc.nextLine();
        String en = sc.nextLine();
        System.out.println(solution(es, en));
    }

    private static String solution(String es, String en) {
        Queue<Character> q = new LinkedList<>();
        for(char c : es.toCharArray()){
            q.offer(c);
        }
        for(char c : en.toCharArray()){
            if(q.contains(c)){
                if(q.poll() != c){
                    return "NO";
                }
            }
        }
        if(!q.isEmpty())
            return "NO";

        return "YES";
    }

}

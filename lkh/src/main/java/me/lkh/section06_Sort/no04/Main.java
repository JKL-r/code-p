package me.lkh.section06_Sort.no04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();

        int[] jobs = new int[n];
        for(int i = 0 ; i < n; i++){
            jobs[i] = sc.nextInt();
        }
        System.out.println(solution(s, n, jobs));
    }

    private static String solution(int s, int n, int[] jobs) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> c = new ArrayDeque<>();

        for(int job: jobs){
            if(c.contains(job)){
                c.remove(job);
            }
            else{
                if(c.size() >= s){
                    c.removeLast();
                }
            }
            c.addFirst(job);
        }
        for(int v:c){
            sb.append(v).append(" ");
        }
        return sb.toString();
    }

}

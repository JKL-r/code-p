package me.lkh.section05_stackQueue.no06;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        int result = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            for(int i = 1; i < k; i++){
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1)
                result = q.poll();
        }
        return result;
    }

}

package me.lkh.section05_stackQueue.no08;

import java.util.*;

class Patient{
    int order;
    int priority;

    public Patient(int order, int priority) {
        this.order = order;
        this.priority = priority;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, p));
    }

    private static int solution(int n, int m, int[] p) {
        Queue<Patient> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            q.offer(new Patient(i, p[i]));
        }

        int result = 0;
        while(!q.isEmpty()){
            Patient tmp = q.poll();
            for(Patient tmpP : q){
                if(tmp.priority < tmpP.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                result ++;
                if(tmp.order == m){
                    return result;
                }
            }
        }
        return result;
    }

}

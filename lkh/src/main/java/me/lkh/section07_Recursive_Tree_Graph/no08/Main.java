package me.lkh.section07_Recursive_Tree_Graph.no08;

import java.util.*;

public class Main {

    static boolean[] chk = new boolean[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hyeon = sc.nextInt(), cow = sc.nextInt();
        System.out.println(bfs(hyeon, cow));
    }

    private static int bfs(int hyeon, int cow){
        chk[hyeon] = true;
        int lv = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(hyeon);

        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0; i < sz; i++){
                int tmp = q.poll();
                if(tmp == cow) {
                    q.clear();
                    return lv;
                }
                if (tmp - 1 >= 1 && tmp - 1 <= 10000 && !chk[tmp - 1]) {
                    q.offer(tmp - 1);
                    chk[tmp - 1] = true;
                }
                if (tmp + 1 >= 1 && tmp + 1 <= 10000 && !chk[tmp + 1]) {
                    q.offer(tmp + 1);
                    chk[tmp + 1] = true;
                }
                if (tmp + 5 >= 1 && tmp + 5 <= 10000 && !chk[tmp + 5]) {
                    q.offer(tmp + 5);
                    chk[tmp + 5] = true;
                }
            }
            lv++;
        }
        return -1;
    }

}

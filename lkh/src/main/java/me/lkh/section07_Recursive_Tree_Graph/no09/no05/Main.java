package me.lkh.section07_Recursive_Tree_Graph.no09.no05;

import java.util.*;

class Node{
    int data;
    Node lt, rt;

    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main {
    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(bfs(root));

        System.out.println(dfs(0, root));
    }

    private static int dfs(int lv, Node root){
        if(root.lt == null && root.rt == null){
            return lv;
        }
        else{
            return Math.min(dfs(lv + 1, root.lt), dfs(lv + 1, root.rt));
        }
    }

    private static int bfs(Node root){
        if(root.lt == null && root.rt == null)
            return 0;
        int lv = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                Node tmp = q.poll();
                Node lt = tmp.lt, rt = tmp.rt;

                if(lt != null){
                    if(lt.lt == null && lt.rt == null){
                        return lv + 1;
                    }
                    q.offer(lt);
                }

                if(rt != null){
                    if(rt.lt == null && rt.rt == null){
                        return lv + 1;
                    }
                    q.offer(rt);
                }
            }
        }
        return 0;
    }
}

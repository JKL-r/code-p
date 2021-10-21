package me.lkh.section07_Recursive_Tree_Graph.no07;

import java.util.*;

public class Main {
    static int[] fibo;

    static class Node{
        Node lt;
        Node rt;
        int data;

        public Node(int val){
            data = val;
            lt = rt = null;
        }
    }
    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        bfs(root);
    }

    private static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while(!q.isEmpty()){
            int len = q.size();
            System.out.print(l + ": ");
            for(int i = 0; i < len; i++){
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null)
                    q.offer(cur.lt);
                if(cur.rt != null)
                    q.offer(cur.rt);
            }
            l++;
            System.out.println();
        }
    }

}

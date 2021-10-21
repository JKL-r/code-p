package me.lkh.section07_Recursive_Tree_Graph.no05;

import java.util.Scanner;

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
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        prefix(root);
        System.out.println();
        infix(root);
        System.out.println();
        postfix(root);
    }

    private static void prefix(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        prefix(root.lt);
        prefix(root.rt);
    }
    private static void infix(Node root) {
        if(root == null)
            return;
        infix(root.lt);
        System.out.print(root.data + " ");
        infix(root.rt);
    }
    private static void postfix(Node root) {
        if(root == null)
            return;
        postfix(root.lt);
        postfix(root.rt);
        System.out.print(root.data + " ");
    }
}

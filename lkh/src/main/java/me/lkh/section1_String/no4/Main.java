package me.lkh.section1_String.no4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        List<String> lst = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            lst.add(in.next());
        }

        for(String str : solution(lst)){
            System.out.println(str);
        }
    }

    private static List<String> solution(List<String> lst) {
        List<String> result = new ArrayList<>();
        for(String str : lst){
            result.add(new StringBuilder(str).reverse().toString());
        }
        return result;
    }

}

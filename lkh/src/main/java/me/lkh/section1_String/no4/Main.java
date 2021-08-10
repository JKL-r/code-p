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

        //for(String str : solutionWithoutStringBuilder(lst)){
        for(String str : solutionWithStringBuilder(lst)){
            System.out.println(str);
        }
    }

    private static List<String> solutionWithStringBuilder(List<String> lst) {
        List<String> result = new ArrayList<>();
        for(String str : lst){
            result.add(new StringBuilder(str).reverse().toString());
        }
        return result;
    }

    private static List<String> solutionWithoutStringBuilder(List<String> lst) {
        List<String> result = new ArrayList<>();

        for(String str : lst){
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = s.length - 1;
            for(int i = 0; i < (s.length / 2); i++){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
            result.add(String.valueOf(s));
        }
        return result;
    }
}

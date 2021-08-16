package me.lkh.section01_String.no10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        solution(str.split(" "));
    }

    private static void solution(String[] s) {
        char t = s[1].charAt(0);
        String str = s[0];
        int[] result = new int[str.length()];
        int p = 1000;
        for(int i = 0; i < str.length(); i++){
            p += 1;

            if(str.charAt(i) == t){
                p = 0;
            }
            result[i] = p;
        }

        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            p += 1;

            if(str.charAt(i) == t){
                p = 0;
            }
            if(result[i] > p){
                result[i] = p;
            }
        }

        for(int c : result){
            System.out.print(c + " ");
        }
    }

}

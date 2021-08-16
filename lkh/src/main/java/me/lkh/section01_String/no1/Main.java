package me.lkh.section01_String.no1;

import java.util.*;

public class Main {

    private int solution(String str, char c){
        int result = 0;

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for(char ch : str.toCharArray()){
            if(ch == c)
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        System.out.println(m.solution(str, c));
    }
}

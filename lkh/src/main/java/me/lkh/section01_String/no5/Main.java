package me.lkh.section01_String.no5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] charArray = str.toCharArray();
        while(lt < rt){

            while(!Character.isAlphabetic(charArray[lt])){
                lt++;
            }
            while (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            }
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;
            lt++;
            rt--;
        }
        return String.valueOf(charArray);
    }

}

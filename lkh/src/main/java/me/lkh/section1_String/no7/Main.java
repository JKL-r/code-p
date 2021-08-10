package me.lkh.section1_String.no7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String result;

        char[] cArr = str.toLowerCase().toCharArray();
        scope:
        {
            int lt = 0;
            int rt = cArr.length - 1;
            for (int i = 0; i < cArr.length / 2; i++) {
                if (cArr[lt] != cArr[rt]){
                    result = "NO";
                    break scope;
                }
                lt ++;
                rt --;
            }
            result = "YES";
        }
        return result;
    }

}

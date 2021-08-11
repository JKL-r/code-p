package me.lkh.section1_String.no11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        s = s + " ";
        Character buf = null;
        int num = 1;
        for (char c : s.toCharArray()) {
            if(buf == null || c != buf){
                if(num > 1)
                    sb.append(num);
                num = 1;
                buf = c;
                sb.append(c);
            }
            else{
                num += 1;
            }
        }

        return sb.toString();
    }

}

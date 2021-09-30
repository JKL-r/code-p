package me.lkh.section05_stackQueue.no05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bars = sc.nextLine();
        System.out.println(solution(bars));
    }

    private static int solution(String bars) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        Character buf = null;
        for(char c : bars.toCharArray()){
            if(c == '('){
                stack.push('(');
                result ++;
            }
            else if(c == ')'){
                stack.pop();
                if(buf == '(') {
                    result--;
                    result += stack.size();
                }
            }
            buf = c;
        }

        return result;
    }

}

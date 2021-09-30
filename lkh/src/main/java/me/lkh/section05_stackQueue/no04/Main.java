package me.lkh.section05_stackQueue.no04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String post = sc.nextLine();
        System.out.println(solution(post));
    }

    private static int solution(String post) {

        Stack<Integer> stack = new Stack<>();

        for(char c : post.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            }
            else{
                int postInt = stack.pop(), preInt = stack.pop();
                int newVal = -1;
                switch(c){
                    case '+':
                        newVal = preInt + postInt;
                        break;
                    case '-':
                        newVal = preInt - postInt;
                        break;
                    case '*':
                        newVal = preInt * postInt;
                        break;
                    case '/':
                        newVal = preInt / postInt;
                        break;
                }
                stack.push(newVal);
            }
        }
        return stack.pop();
    }

}

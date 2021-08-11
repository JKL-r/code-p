package me.lkh.section1_String.no9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }

    private static int solution(String str) {

        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                result.append(c);
            }
        }
        return Integer.parseInt(result.toString());
    }

}

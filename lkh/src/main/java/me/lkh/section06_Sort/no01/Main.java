package me.lkh.section06_Sort.no01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println(solution(n, numbers));
    }

    private static String solution(int n, int[] numbers) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n - 1 ; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(numbers[minIdx] > numbers[j]){
                    minIdx = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[minIdx];
            numbers[minIdx] = tmp;
        }
        for(int number : numbers){
            sb.append(number).append(" ");
        }
        return sb.toString();
    }

}

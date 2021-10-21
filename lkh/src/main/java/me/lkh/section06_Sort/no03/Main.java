package me.lkh.section06_Sort.no03;

import java.util.Scanner;

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

        for(int i = 1; i < n; i++){
            int tmp = numbers[i], j;
            for(j = i - 1; j >= 0; j--){
                if(tmp < numbers[j]){
                    numbers[j + 1] = numbers[j];
                }
                else{
                    break;
                }
            }
            numbers[j + 1] = tmp;
        }
        for(int number : numbers){
            sb.append(number).append(" ");
        }
        return sb.toString();
    }

}

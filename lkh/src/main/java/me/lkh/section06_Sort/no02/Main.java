package me.lkh.section06_Sort.no02;

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

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(numbers[j + 1] < numbers[j]){
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for(int number : numbers){
            sb.append(number).append(" ");
        }
        return sb.toString();
    }

}

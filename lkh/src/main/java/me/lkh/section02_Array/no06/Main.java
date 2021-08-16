package me.lkh.section02_Array.no06;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        System.out.println(solution(n, numbers));
    }

    private static String solution(int n, String[] nums){
        int max = 0;
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] =  Integer.parseInt(new StringBuilder(nums[i]).reverse().toString());
            if(max < numbers[i])
                max = numbers[i];
        }

        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i < (max + 1) / 2 + 1; i++){
            if(isPrime[i]){
                for(int j = i * 2; j < max + 1; j += i){
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(int number : numbers){
            if(isPrime[number])
                result.append(number).append(" ");
        }
        return result.toString();
    }
}

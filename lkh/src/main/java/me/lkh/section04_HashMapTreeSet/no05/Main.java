package me.lkh.section04_HashMapTreeSet.no05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, numbers));
    }

    private static int solution(int n, int k, int[] nums) {
        int result = 0;

        return result;
    }

}

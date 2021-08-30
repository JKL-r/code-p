package me.lkh.section03_TwoPointer.no02;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr1, m, arr2));
    }

    private static String solution(int n, int[] arr1, int m, int[] arr2){

        Map<Integer, Boolean> checkMap = new HashMap<>();
        List<Integer> results = new ArrayList<>();
        for(int n1 : arr1){
            checkMap.put(n1, true);
        }
        for(int n2 : arr2){
            if(checkMap.containsKey(n2)){
                results.add(n2);
            }
        }

        results.sort(null);

        StringBuilder sb = new StringBuilder();
        for(int n1 : results){
            sb.append(n1).append(" ");
        }
        return sb.toString();
    }
}

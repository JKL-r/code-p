package me.lkh.section04_HashMapTreeSet.no03;

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
        int[] sales = new int[n];

        for(int i = 0; i < n; i ++){
            sales[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, sales));
    }

    private static String solution(int n, int k, int[] sales) {
        StringBuilder sb = new StringBuilder();
        Map<Integer,Integer> saleMap = new HashMap<>();
        int cnt = 0, lt = 0;
        for(int rt = 0; rt < n; rt++){
            if(rt < n) {
                saleMap.put(sales[rt], saleMap.getOrDefault(sales[rt], 0) + 1);
                cnt++;
            }

            if(cnt == k)
                sb.append(saleMap.size()).append(" ");
            else if(cnt > k){
                int tmp = saleMap.get(sales[lt]) - 1;
                if(tmp > 0){
                    saleMap.put(sales[lt], tmp);
                }
                else {
                    saleMap.remove(sales[lt]);
                }
                cnt--;
                lt++;

                if(cnt == k)
                    sb.append(saleMap.size()).append(" ");
            }
        }
        return sb.toString();
    }

}

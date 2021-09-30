package me.lkh.section04_HashMapTreeSet.no05;

import java.util.*;

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
        int result = -1;

        Set<Integer> sums = new TreeSet<>(Collections.reverseOrder());  // 내림차순
//        Set<Integer> sums = new TreeSet<>();    // 오름차순

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int l = j + 1; l < n; l++){
                    sums.add(nums[i] + nums[j] + nums[l]);
                }
            }
        }
        int cnt = 0;
        if(sums.size() >= k){
            for(int x : sums){
                cnt++;
                if(cnt == k){
                    result = x;
                    break;
                }
            }
        }
        return result;
    }

}

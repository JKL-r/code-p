package me.lkh.section04_HashMapTreeSet.no01;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String vote = sc.next();

        System.out.println(solution(n, vote));
    }

    private static String solution(int n, String vote) {
        String result = "";
        Map<String, Integer> voteMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String curVote = vote.substring(i, i+1);
            voteMap.put(curVote, voteMap.getOrDefault(curVote, 0) + 1);
        }

        int maxVal = Integer.MIN_VALUE;
        for(String key : voteMap.keySet()){
            if(voteMap.get(key) > maxVal){
                maxVal = voteMap.get(key);
                result = key;
            }
        }

        return result;
    }

}

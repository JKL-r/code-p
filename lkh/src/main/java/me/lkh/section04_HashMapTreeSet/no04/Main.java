package me.lkh.section04_HashMapTreeSet.no04;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(), t = sc.nextLine();
        System.out.println(solution(s, t));
    }

    private static int solution(String s, String t) {
        int result = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> cMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int lt = 0, tLen = t.length();
        char[] sChar = s.toCharArray();
        for(int rt = 0; rt < tLen - 1; rt++){
            cMap.put(sChar[rt], cMap.getOrDefault(sChar[rt], 0) + 1);
        }
        for(int rt = tLen - 1; rt < s.length(); rt++){
            cMap.put(sChar[rt], cMap.getOrDefault(sChar[rt], 0) + 1);
            if(cMap.equals(tMap)){
                result++;
            }
            cMap.put(sChar[lt], cMap.get(sChar[lt]) - 1);
            if(cMap.get(sChar[lt]) == 0)
                cMap.remove(sChar[lt]);
            lt++;
        }

        return result;
    }

}

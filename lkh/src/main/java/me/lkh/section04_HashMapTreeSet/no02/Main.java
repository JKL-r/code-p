package me.lkh.section04_HashMapTreeSet.no02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        String result = "YES";

        Map<Character, Integer> checkMap = new HashMap<>();
        for(char c : str1.toCharArray()){
            checkMap.put(c, checkMap.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()){
            if(checkMap.containsKey(c)){
                int val = checkMap.get(c);
                if(val == 0) {
                    result = "NO";
                    break;
                }
                else{
                    checkMap.put(c, val - 1);
                }

            }
            else{
                result = "NO";
                break;
            }
        }
        for(char key : checkMap.keySet()){
            if(checkMap.get(key) != 0)
                result = "NO";
        }
        return result;
    }

}

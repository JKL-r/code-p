package me.lkh.section06_Sort.no10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), c = sc.nextInt();
        int[] cords = new int[n];
        for(int i = 0; i < n; i++){
            cords[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, cords));
    }


    private static int count(int[] cords, int minDist){
        int result = 1;

        int ep = cords[0];
        for(int i = 1 ; i < cords.length; i++){
            if(cords[i] - ep >= minDist){
                result ++;
                ep = cords[i];
            }
        }
        return result;
    }
    private static int solution(int n, int m, int[] cords) {
        Arrays.sort(cords);
        int result = 0, lt = 1, rt = cords[n - 1];

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(count(cords, mid) >= m){
                result = mid;
                lt = mid + 1;
            }
            else{
                rt =  mid - 1;
            }
        }

        return result;
    }
}

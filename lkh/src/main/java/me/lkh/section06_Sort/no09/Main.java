package me.lkh.section06_Sort.no09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] songs = new int[n];
        for(int i = 0; i < n; i++){
            songs[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, songs));
    }

    private static int count(int[] songs, int c){
        int result = 1, curC = 0;
        for(int song: songs){
            if(curC + song > c){
                result++;
                curC = song;
            }
            else{
                curC += song;
            }
        }
        return result;
    }

    private static int solution(int n, int m, int[] songs) {
        int lt = Arrays.stream(songs).max().getAsInt();
        int rt = Arrays.stream(songs).sum();

        int result = 0;
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(songs, mid) <= m){
                result = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }

        return result;
    }

}

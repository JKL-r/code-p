package me.lkh.section06_Sort.no07;

import java.util.*;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if(this.x < p.x){
            return -1;
        }
        else if(this.x == p.x){
            if(this.y < p.y){
                return -1;
            }
            else if(this.y == p.y){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] points = new Point[n];

        for(int i = 0; i < n; i++){
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        System.out.println(solution(n, points));
    }
    private static String solution(int n, Point[] points) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(points);
        for(Point p : points){
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

}

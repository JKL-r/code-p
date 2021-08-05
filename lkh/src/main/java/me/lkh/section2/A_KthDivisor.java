package me.lkh.section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_KthDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int num = 0;
        found:
        {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (++num == k) {
                        System.out.println(num);
                        break found;
                    }
                }
            }
            System.out.println(-1);
        }

    }
}

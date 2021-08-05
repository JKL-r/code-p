package me.lkh.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_KthNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= t; i++) {

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            List<Integer> numbers = Stream.of(bf.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            List<Integer> extractedNumbers = numbers.subList(s - 1, e).stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            System.out.println("#" + i + " " + extractedNumbers.get(f - 1));
        }
    }
}

package me.lkh.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class C_KthBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> numbers = Stream.of(bf.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sums = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++){
            for (int j = i + 1; j < numbers.size(); j++) {
                for (int h = j + 1; h < numbers.size(); h++) {
                    sums.add(numbers.get(i) + numbers.get(j) + numbers.get(h));
                }
            }
        }
        sums.sort(Comparator.reverseOrder());
        System.out.println(sums.get(k-1));
    }
}

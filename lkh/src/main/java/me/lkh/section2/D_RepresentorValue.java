package me.lkh.section2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.HashMap;

public class D_RepresentorValue {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        List<Integer> numbers = Stream.of(bf.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("sum = " + sum);
    }
}

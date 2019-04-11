package arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
@author: errohan
@created: 8/4/19
*/
public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> collect = IntStream.range(0, Integer.parseInt(sc.next()))
                .mapToObj(i -> sc.next())
                .collect(Collectors.toList());

        IntStream.range(0, Integer.parseInt(sc.next()))
                .mapToObj(i -> sc.next())
                .mapToLong(q -> collect.stream().filter(q::equals).count())
                .forEach(System.out::println);
    }
}

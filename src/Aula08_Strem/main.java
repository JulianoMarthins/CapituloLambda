package Aula08_Strem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> str = nums.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(str.toArray()));

        Stream<String> str2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(str2.toArray()));

        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2).limit(10);
        System.out.println(Arrays.toString(str3.toArray()));

        Stream<Long> fibonicc =
                Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);

        System.out.println(Arrays.toString(fibonicc.limit(25).toArray()));

    }

}

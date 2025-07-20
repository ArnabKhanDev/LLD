package Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo  {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,0,1,2,3,4,5,6);
        System.out.println(list.stream().count());
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());

        String[] str = {"a","b","c"};
        System.out.println(Arrays.stream(str).count());

        Stream<Integer> stringStream = list.stream().map(Integer::numberOfTrailingZeros);
        System.out.println("count " + stringStream.count());

    }
}

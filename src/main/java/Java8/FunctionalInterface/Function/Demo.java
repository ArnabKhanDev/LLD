package Java8.FunctionalInterface.Function;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(2));
    }
}

package Java8.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {

        /**
          Functional Interface
          Boolean value function
          Predicate holds a condition
         **/
        Predicate<String> isStart = s -> s.startsWith("A");
        System.out.println(isStart.test("Arnab"));
    }
}

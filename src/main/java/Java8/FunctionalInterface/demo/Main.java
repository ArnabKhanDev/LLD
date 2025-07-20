package Java8.FunctionalInterface.demo;

public class Main {
    public static void main(String[] args) {
        Demo obj = () -> System.out.println("Demo");
        obj.show();

        Demo1 demo = (i, j) -> i+j;
        int ans = demo.add(2,3);
        System.out.println(ans);


    }

}

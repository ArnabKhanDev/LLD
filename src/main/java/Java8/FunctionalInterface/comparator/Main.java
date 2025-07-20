package Java8.FunctionalInterface.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
    private String name;
    private int age;
    private int marks;

    User(String name, int age, int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

/**
 * Sort Users by marks
 * */

class Marks implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o2.getMarks(),o1.getMarks());
    }
}
public class Main {
    public static void main(String[] args) {
        /**
         * Comparator is used to define custom sorting logic
        **/

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Arnab",38,90));
        users.add(new User("Raju",30,80));
        users.add(new User("Raman",32,100));

        Collections.sort(users,new Marks());
        System.out.println("Normal");
        for(User user : users){
            System.out.println(user.getName() + " " + user.getMarks() + " " + user.getAge());
        }

        System.out.println();
        System.out.println();

        /**
         * Comparator Using Lambda by single value
         **/
        Collections.sort(users,(a,b) -> b.getMarks() - a.getMarks());
        System.out.println("Lambda");
        for(User user : users){
            System.out.println(user.getName() + " " + user.getMarks() + " " + user.getAge());
        }

        System.out.println();
        System.out.println();

        /**
         * Comparator Using Lambda by  multiple value
         **/
        users.sort(Comparator.comparing(User::getAge).thenComparing(User::getMarks));
        System.out.println("Lambda Multiple");
        for(User user : users){
            System.out.println(user.getName() + " " + user.getMarks() + " " + user.getAge());
        }
    }
}

package Java8.FunctionalInterface.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Natural order sorting
 */
class User implements Comparable<User>{
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

    @Override
    public int compareTo(User user) {
        return user.getMarks() - this.getMarks();
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Arnab",38,90));
        users.add(new User("Raju",30,80));
        users.add(new User("Raman",32,100));

        Collections.sort(users);
        for(User user :users)
            System.out.println(user.getName() + " " + user.getMarks() + " " + user.getAge());
    }
}

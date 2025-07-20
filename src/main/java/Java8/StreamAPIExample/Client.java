package Java8.StreamAPIExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Client {
    static List<Employee> employees = Arrays.asList(
            new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
            new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
    );

    public static void main(String[] args) {
        /**
         * Group The employees By Department Names
         */
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartNames()));
        System.out.println("Group The employees By Department Names " + collect);

        /**
         * Find the total count of employees using stream
         */
        System.out.println(employees.stream().count());

        /**
         * Find the max age of employees
         */
        System.out.println(employees.stream().max(Comparator.comparingInt(Employee::getAge)).get().getAge());

        /***
         * 	Find all department names
         */
        List<String> departmentList = employees.stream().map(emp -> emp.getDepartNames()).distinct().collect(toList());
        System.out.println(departmentList);

        /**
         * 	Find the count of employee in each department
         */
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.counting())));

        /**
         * Find the list of employees whose age is less than 30
         */
        List<Employee> list = employees.stream().filter(emp -> emp.getAge() < 30).toList();
        System.out.println(list);

        /**
         * 	Find the list of employees whose age is in between 26 and 31
         */
        List<Employee> list1 = employees.stream().filter(employee -> employee.getAge() > 26 && employee.getAge() <31).toList();
        System.out.println(list1);

        /**
         * Find the average age of male and female employee
         */
        System.out.println(employees.stream().
                collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))));

        /**
         * Find the department who is having maximum number of employee
         */

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get());

        /**
         * Find the Employee who stays in Delhi and sort them by their names
         */

        System.out.println(employees.stream().filter(emp -> emp.getAddress().equals("Chennai"))
                .sorted(Comparator.comparing(Employee::getName)).toList());

        /**
         * Find the average salary in all departments
         */
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames
                ,Collectors.averagingDouble(Employee::getSalary))));

        /**
         * Find the highest salary in each department
         */
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));

        /**
         * Find the list of employee and sort them by their salary
         */

        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList());

        /**
         * Find the employee who has second lowest salary
         */
        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get());


    }
}

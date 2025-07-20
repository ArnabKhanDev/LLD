package Java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample<T> {

    /**
     * Find Duplicates elements
     * */
    public static<T> void findDuplicate(Stream tStream){
        Set<T> set = new HashSet<>();
        System.out.println(tStream.filter(n -> !set.add((T) n)).collect(Collectors.toSet()));
    }

    /**
     * Count occurrence of character in String
     * */
    public static long countOccurrence(String string, char ch)
    {
        return string.chars().filter(c -> c == ch).count();
    }

    /***
     * find the longest string
     */
    public static Optional<String> findLongestString(List<String> stringList){
        Optional<String> str = stringList.stream().max(Comparator.comparing(String::length));
        return str;
    }

    /**
     * Calculate the average age
     */
    public static double calculateAge(List<Integer> age)
    {
        return age.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    /***
     * Merge two sorted lists into a single sorted list using Java streams
     */
    public static List<Integer> mergedList(List<Integer> list1 , List<Integer> list2)
    {
        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).sorted().toList();
        return mergedList;
    }

    /**
     *  Find the intersection of two lists using Java streams:
     */
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> list = list1.stream().filter(list2::contains).toList();
        return list;
    }

    /**
     * Remove duplicates from a list
     */
    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        return list.stream().distinct().toList();
    }

    /**
     * Remove Null Values
     */
    public static List<String> removeNull(List<String> stringList)
    {
        return stringList.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }





    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2,2,3,4,5,5,5,6);
        findDuplicate(stream);

        String str = "Arnabkhan";
        System.out.println(countOccurrence(str,'a'));

        List<String> list = Arrays.asList("arnab","khan","java","description");
        System.out.println(findLongestString(list));

        List<Integer> age = Arrays.asList(12,23,24,56,67);
        System.out.println(calculateAge(age));

        List<Integer> list1 = Arrays.asList(12,23,24,56,67);
        List<Integer> list2 = Arrays.asList(11,3,4,6,7);
        System.out.println(mergedList(list1,list2));

        List<Integer> list3 = Arrays.asList(12,23,24,56,67);
        List<Integer> list4 = Arrays.asList(12,23,4,6,7);
        System.out.println(findIntersection(list1, list4));

        List<Integer> list5= Arrays.asList(12,12,23,24,23,24,56,67);
        System.out.println(removeDuplicates(list5));

        List<String> stringList = Arrays.asList("arnab","khan",null,"java",null);
        System.out.println(removeNull(stringList));

        /**
         * performs multiple transformations and aggregations
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers
                .stream()
                .filter(n -> n % 2 == 0)    // Filter even numbers
                .mapToDouble(n -> n * 2.0)  // Map to doubles and multiply by 2
                .average()                         // Calculate the average
                .orElse(0);                  // If no average, return 0

        System.out.println("average " + average);



    }
}

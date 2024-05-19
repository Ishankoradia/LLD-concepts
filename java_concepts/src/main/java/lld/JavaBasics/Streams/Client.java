package lld.JavaBasics.Streams;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        /*
         * Find below a list of integers. Iterate over it and print the square of each
         * number.
         */
        System.out.println("============================== 1 ===============================");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(n -> System.out.println(n * n));

        /*
         * Find below a list of integers. Iterate over it and print every even number.
         */

        System.out.println("============================== 2 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });

        /*
         * For the list of integers, find all the even numbers. Then, iterate over the
         * even numbers and print each number.
         */

        System.out.println("============================== 3 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        /*
         * For a list of integers, return a list of the squares of each number.
         */
        System.out.println("============================== 4 ===============================");

        List<Integer> result = numbers.stream().map(n -> n * n).toList();
        System.out.println(result);

        /*
         * For a list of strings, return a list of the length of each string.
         */
        System.out.println("============================== 5 ===============================");

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> namesLength = names.stream().map(s -> s.length()).toList();
        System.out.println(namesLength);

        /*
         * For a list of strings, filter out the strings which do not start with the
         * letter T and then uppercase the remaining strings.
         */
        System.out.println("============================== 6 ===============================");

        names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> upperString = names.stream().filter(s -> !(s.startsWith("T") || s.startsWith("t")))
                .map(s -> s.toUpperCase()).toList();
        System.out.println(upperString);

        /*
         * For a list of strings, filter out the strings which do not start with the
         * letter T, then uppercase the remaining strings and then sort them.
         */
        System.out.println("============================== 7 ===============================");

        names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> upperStringSort = names.stream().filter(s -> !(s.startsWith("T") || s.startsWith("t")))
                .map(s -> s.toUpperCase()).sorted().toList();
        System.out.println(upperStringSort);

        /*
         * For a list of integers, find the sum of all the numbers.
         */
        System.out.println("============================== 8 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int s = numbers.stream().reduce(0, (acc, number) -> acc + number);
        System.out.println(s);

        /*
         * For a list of integers, find the sum of the squares of all the numbers.
         */
        System.out.println("============================== 9 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int ss = numbers.stream().map(n -> n * n).reduce(0, (acc, num) -> acc + num);
        System.out.println(ss);

        /*
         * For a list of integers, find the sum of the squares of all the even numbers.
         */
        System.out.println("============================== 10 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sss = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, (acc, num) -> acc + num);
        System.out.println(sss);

        /*
         * Given a list of numbers, find the maximum number in the list.
         */
        System.out.println("============================== 11 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer maxNum = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(maxNum);

        /*
         * Given a list of numbers with duplicates, find the distinct numbers in the
         * list.
         */
        System.out.println("============================== 12 ===============================");

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> resultDistinct = numbers.stream().distinct().toList();
        System.out.println(resultDistinct);

        /*
         * Given a list of numbers, find the average of all the numbers.
         */
        System.out.println("============================== 13 ===============================");

        List<Double> nums = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double average = nums.stream().reduce(0.0, (currentValue, currentElement) -> currentElement + currentValue)
                / numbers.size();

        System.out.println(average);

        /*
         * Give a list of strings, find the average length of all the strings.
         */
        System.out.println("============================== 14 ===============================");

        names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        // Enter your code here
        Double average1 = names.stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();

        System.out.println(average1);

        /*
         * Given a list of strings, find the first string that is longer than 10
         * characters.
         */
        System.out.println("============================== 15 ===============================");

        names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        Optional<String> firstLongName = names.stream()
                .filter(name -> name.length() > 100)
                .findFirst();
        System.out.println(firstLongName);

    }

}

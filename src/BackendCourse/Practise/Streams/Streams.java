package BackendCourse.Practise.Streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // Using Stream to print all the numbers
        // numbers.stream().forEach(a->System.out.print(a+" "));
        // numbers.forEach(a->System.out.print(a+" "));
        Stream<Integer> stream = numbers.stream();

        // filter to return only even numbers
        List<Integer> list = stream.filter(x -> x % 2 == 0 ).toList();

        // for java 16 or earlier
        // List<Integer> list = stream.filter(x -> x % 2 == 0 ).collect(Collectors.toList());

        // an example of map - return squares of each numbers. below line will not work as stream is already consumed in above line. one stream object will be used only once.
        //stream.map( x -> x * x ).forEach( x -> System.out.print(x + " ") );
        // so we will use collection.steam() to get new stream object freshly every time
        numbers.stream().map( x -> x * x ).forEach( x -> System.out.print(x + " ") );

        // an example of mapToInt - given strings. find the max length of string
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Rahul", "Rohit", "Rajesh", "Ramesh", "Raj"));
        // in below line, String::length will apply an object of string at every iteration will call method length (String :: length)
        int maxLen = names.stream().mapToInt(String::length).max().getAsInt();
        System.out.println("Max length of string is: " + maxLen);

        // an example of allMatch - check if all numbers are even
        boolean allEven = numbers.stream().allMatch(x -> x % 2 == 0);

        // an example to return List of fruits starts with character A
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange", "Pineapple", "Avocado"));
        List<String> fruitsStartsWithA = fruits.stream().filter(x -> x.startsWith("A")).toList();

        // an example to return all distinct numbers
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();

        // an example of sort - sort the strings by length descending
        List<String> sortedByLength = names.stream().sorted((a, b) -> b.length() - a.length()).toList();

        // what is the terminal function in stream?
        // terminal function is the function which will consume the stream and return the result. like forEach, collect, toList, toSet, max, min, sum, average, count, anyMatch, allMatch, noneMatch, findFirst, findAny

        // an example of reduce() - to get sum of all numbers
        int sum = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        // What does the following code snippet do?
        Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Result: " + groupedByLength);
        // Output: {5=[Apple, Mango, Orange], 6=[Banana], 9=[Pineapple], 7=[Avocado]}

        IntFunction<Integer> square = x -> x * x; // this functional interface will apply lambda expression given argument.
        System.out.println(square.apply(5));

        BinaryOperator<Integer> add = Integer::sum; // this functional interface will apply lambda expression given two arguments.
        System.out.println(add.apply(5, 6));

        // process sentences
        List<String> sentences = new ArrayList<>(Arrays.asList("I am fan of java", "Java was good", "I am learning java"));
        /*
        Filter out sentences that contain the word "Java".
        Map each filtered sentences to its length.
        Find the average length of the sentences.
        Convert the average length to an integer by rounding down.
        Return the rounded average length.
        * */
        int avgLength = (int) sentences.stream()
                .filter(s -> s.contains("Java"))
                .mapToInt(String::length)
                .average()
                .getAsDouble();

    }


}

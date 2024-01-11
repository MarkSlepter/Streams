package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignment1 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        new Random().ints(10, 0, 20).forEach(arrayList :: add);
        System.out.println("Collection: " + arrayList);
        System.out.println("No duplicates: " + arrayList.stream().distinct().collect(Collectors.toList()));
        System.out.println("Even elements ranging from 7 to 17: " + arrayList.stream().distinct().filter(num -> num >= 7 && num <= 17 && num % 2 == 0).collect(Collectors.toList()));
        System.out.println("Multiplied by 2 elements: " + arrayList.stream().distinct().map(num -> num * 2).collect(Collectors.toList()));
        System.out.println("First 4 sorted elements: " + arrayList.stream().distinct().map(num -> num * 2).sorted().limit(4).collect(Collectors.toList()));
        System.out.println("Number of elements in stream: " + arrayList.stream().distinct().map(num -> num * 2).sorted().limit(4).count());
        System.out.println("Average: " + arrayList.stream().distinct().mapToDouble(Integer::doubleValue).average().orElse(0.0));

    }

}

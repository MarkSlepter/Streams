package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("Mark", "Ansrew", "Dima", "Arthur", "Ivan", "Polina", "Lisa", "Fedor", "Daniil", "Stepan", "Sergey");
        List<String> filteredNames = arrayList.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'a': " + filteredNames);

        String firstSortedNames = arrayList.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .sorted()
                .findFirst()
                .orElse(null);
        System.out.println("First sorted name starting with 'a':" + firstSortedNames);

    }

}

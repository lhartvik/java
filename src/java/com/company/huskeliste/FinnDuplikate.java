package com.company.huskeliste;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinnDuplikate {
    static List<String> strings = asList("foo","bar","banan","kjell","foo","smidig","pyramide","kjell");
    static List<String> strings2 = asList("foo","bar","banan","kjell","foo","smidig","pyramide","kjell");

    static void bad(){
        List<String> duplikate = new ArrayList<>();
        for (int i = 0; i<strings.size();i++){
            if (i != strings.indexOf(strings.get(i))) duplikate.add(strings.get(i)+" er duplikat.");
        }

        duplikate.forEach(System.out::println);
    }

    /**
     *
     */
    static void good(){
        strings.stream().collect(Collectors.groupingBy(t->t))
            .entrySet().stream()
            .filter(e -> e.getValue().size() > 1)
            .forEach(s -> System.out.println(s.getKey() + " er duplikat."));
    }
}

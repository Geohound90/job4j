package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> {
                    List<Holder> holders = new ArrayList<>();
                    for (String unit : student.getUnits()) {
                        holders.add(new Holder(unit, student.getName()));
                    }
                    return holders.stream();
                }).collect(
                        Collectors.groupingBy(t -> t.key,
                                Collector.of(
                                        HashSet::new,
                                        (set, el) -> set.add(el.value),
                                        (left, right) -> {
                                            left.addAll(right);
                                            return left;
                                        }
                                ))
                );
    }
}
